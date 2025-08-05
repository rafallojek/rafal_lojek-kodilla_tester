package com.kodilla.selenium.pom;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class StoreSearchTest {

    private WebDriver driver;

    private final Map<String, Integer> expectedResults = Map.of(
            "NoteBook", 0,
            "School", 0,
            "Brand", 0,
            "Business", 0,
            "Gaming", 0,
            "Powerful", 0
    );

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://kodilla.com/pl/test/store");
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    void printSearchResultsForPhrases() {
        for (String phrase : expectedResults.keySet()) {
            printSearchResults(phrase);
            printSearchResults(phrase.toLowerCase());
            printSearchResults(phrase.toUpperCase());
        }
    }

    private void printSearchResults(String phrase) {
        WebElement inputField = driver.findElement(By.id("searchField"));
        inputField.clear();
        inputField.sendKeys(phrase);

        try {
            Thread.sleep(1500);
        } catch (InterruptedException ignored) {}

        List<WebElement> results = driver.findElements(By.cssSelector(".element"));

        System.out.println("Wyniki dla frazy: \"" + phrase + "\" (liczba elementow: " + results.size() + "):");
        for (WebElement result : results) {
            System.out.println(" - " + result.getText());
        }
        System.out.println("------------------------------------------------");
    }
}
