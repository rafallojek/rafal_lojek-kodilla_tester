package com.kodilla.selenium.search;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreSearchExampleTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeEach
    void setup() {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @AfterEach
    void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    void testSearchResultsAreDisplayed() {
        driver.get("https://kodilla.com/pl/test/store");

        WebElement inputField = wait.until(ExpectedConditions.elementToBeClickable(By.name("search")));
        inputField.sendKeys("School");
        inputField.sendKeys(Keys.ENTER);

        List<WebElement> results = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(".element")));

        assertFalse(results.isEmpty(), "Lista wynikow nie powinna byc pusta");

        System.out.println("Liczba wynikow wyszukiwania: " + results.size());
    }
}
