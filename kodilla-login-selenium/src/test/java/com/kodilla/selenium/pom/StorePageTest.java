package com.kodilla.selenium.pom;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

class StorePageTest {

    private WebDriver driver;

    @BeforeEach
    void setUp() {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Selenium\\chromedriver.exe");

        driver = new ChromeDriver();
    }

    @Test
    void testStorePageConstructor() {
        StorePage storePage = new StorePage(driver);
        assertNotNull(storePage);
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
