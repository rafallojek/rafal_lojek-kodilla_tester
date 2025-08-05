package com.kodilla.testcontainers;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testcontainers.containers.BrowserWebDriverContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.shaded.org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

@Testcontainers
class BrowserTest {

    @Container
    private final BrowserWebDriverContainer<?> chromeContainer =
            new BrowserWebDriverContainer<>()
                    .withCapabilities(new ChromeOptions());

    @BeforeAll
    static void createDirs() {
        new File("./build/screenshots").mkdirs();
    }

    @Test
    void chromeTest() throws IOException {
        RemoteWebDriver driver = chromeContainer.getWebDriver();
        driver.get("http://allegro.pl");

        File screenshot = driver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot,
                new File("./build/screenshots/" + screenshot.getName()));
    }
}