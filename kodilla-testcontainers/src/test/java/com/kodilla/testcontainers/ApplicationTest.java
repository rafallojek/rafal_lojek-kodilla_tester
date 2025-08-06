package com.kodilla.testcontainers;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testcontainers.containers.BrowserWebDriverContainer;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.Network;
import org.testcontainers.images.builder.ImageFromDockerfile;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.shaded.org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testcontainers.containers.BrowserWebDriverContainer.VncRecordingMode.RECORD_ALL;

@Testcontainers
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ApplicationTest {

    private final Network network = Network.newNetwork();

    @Container
    private final GenericContainer<?> webServer =
            new GenericContainer<>(
                    new ImageFromDockerfile()
                            .withFileFromClasspath("/tmp/index.html", "wizytowka-rafal.html")
                            .withDockerfileFromBuilder(builder ->
                                    builder
                                            .from("httpd:latest")
                                            .copy("/tmp/index.html", "/usr/local/apache2/htdocs/index.html")
                                            .build()))
                    .withNetwork(network)
                    .withNetworkAliases("my-server")
                    .withExposedPorts(80);

    @Container
    private final BrowserWebDriverContainer<?> chrome =
            new BrowserWebDriverContainer<>()
                    .withNetwork(network)
                    .withRecordingMode(RECORD_ALL, new File("./build/"))
                    .withCapabilities(new ChromeOptions());

    @BeforeAll
    void beforeAll() {
        new File("./build/screenshots").mkdirs();
        System.out.println("Given: The HTML business card and Dockerfile are ready, Docker is running");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("When: The test starts, I run the containers");
    }

    @AfterEach
    void afterEach() {
        System.out.println("Then: Test completed, screenshot and recording should be in build/");
    }

    @AfterAll
    void afterAll() {
        System.out.println("Cleaning up after all tests.");
    }

    @Test
    void recordBusinessCardTest() throws IOException {
        RemoteWebDriver driver = chrome.getWebDriver();
        driver.get("http://my-server/");

        File screenshot = driver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("./build/screenshots/" + screenshot.getName()));

        String title = driver.findElement(By.tagName("h1")).getText();
        assertEquals("Hello! Tutaj Rafal, przyszly Tester Automatyzujacy", title);
    }
}