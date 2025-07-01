package com.kodilla.selenium.pom;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class StoreSearchTest {

    private WebDriver driver;

    private final Map<String, Integer> expectedResults = Map.of(
            "NoteBook", 1,
            "School", 1,
            "Brand", 1,
            "Business", 1,
            "Gaming", 1,
            "Powerful", 1
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
    void shouldReturnCorrectNumberOfResultsForEachPhraseIgnoringCase() {
        for (String phrase : expectedResults.keySet()) {
            checkSearchResults(phrase);
            checkSearchResults(phrase.toLowerCase());
            checkSearchResults(phrase.toUpperCase());
        }
    }

    private void checkSearchResults(String phrase) {

        WebElement inputField = driver.findElement(By.id("searchField"));

        inputField.clear();
        inputField.sendKeys(phrase);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.cssSelector(".element"), 0));

        List<WebElement> results = driver.findElements(By.cssSelector(".element"));

        String originalKey = expectedResults.keySet().stream()
                .filter(k -> k.equalsIgnoreCase(phrase))
                .findFirst()
                .orElse(null);

        Assertions.assertNotNull(originalKey, "Phrase not found in expectedResults: " + phrase);

        int expectedCount = expectedResults.get(originalKey);

        System.out.println("Phrase: " + phrase + ", Expected: " + expectedCount + ", Actual: " + results.size());

        Assertions.assertEquals(expectedCount, results.size(),
                "Incorrect number of results for phrase: " + phrase);
    }
}
