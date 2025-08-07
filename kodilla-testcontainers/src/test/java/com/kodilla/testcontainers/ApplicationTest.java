package com.kodilla.testcontainers;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testcontainers.containers.BrowserWebDriverContainer;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.Network;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.shaded.org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.testcontainers.containers.BrowserWebDriverContainer.VncRecordingMode.RECORD_ALL;

@Testcontainers
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ApplicationTest {

    private final Network network = Network.newNetwork();

    @Container
    private final GenericContainer<?> webServer =
            new GenericContainer<>("wizytowka-rafal:latest")
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
    void createDirs() {
        new File("./build/screenshots").mkdirs();
    }

    @Test
    void customImageTest() throws IOException, InterruptedException {
        RemoteWebDriver driver = chrome.getWebDriver();
        Thread.sleep(3000);

        String containerHost = webServer.getHost();
        Integer containerPort = webServer.getMappedPort(80);

        System.out.println("Connecting to: http://" + containerHost + ":" + containerPort + "/");
        driver.get("http://" + containerHost + ":" + containerPort + "/");

        File screenshot = driver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("./build/screenshots/" + screenshot.getName()));

        String pageSource = driver.getPageSource();
        System.out.println("Page source:\n" + pageSource);
        assertTrue(pageSource.contains("Rafal") || pageSource.contains("rafallojek@gmail.com"));
    }
}