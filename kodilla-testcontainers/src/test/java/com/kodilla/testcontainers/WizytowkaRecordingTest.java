package com.kodilla.testcontainers;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.BrowserWebDriverContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import java.io.File;

import static org.testcontainers.containers.BrowserWebDriverContainer.VncRecordingMode.RECORD_ALL;

@Testcontainers
public class WizytowkaRecordingTest {

    @Container
    private static final GenericContainer<?> webServer =
            new GenericContainer<>("wizytowka-rafal:latest")
                    .withExposedPorts(80);

    @Container
    private static final BrowserWebDriverContainer<?> chrome =
            new BrowserWebDriverContainer<>()
                    .withCapabilities(new ChromeOptions())
                    .withRecordingMode(RECORD_ALL, new File("./recordings/"));

    @Test
    void shouldDisplayWizytowka() throws Exception {
        Thread.sleep(5000);
        String host = webServer.getHost();
        Integer port = webServer.getMappedPort(80);

        RemoteWebDriver driver = chrome.getWebDriver();
        driver.get("http://" + host + ":" + port + "/");

        Thread.sleep(10000);
    }
}