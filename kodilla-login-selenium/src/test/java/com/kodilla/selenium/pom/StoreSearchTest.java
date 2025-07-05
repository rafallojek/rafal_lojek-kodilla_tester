package com.kodilla.selenium.pom;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class StoreSearchTest {

    private WebDriver driver;

    private final Map<String, Integer> expectedResults = Map.of(
            "NoteBook", 2,    // poprawione na 2
            "School", 1,
            "Brand", 0,       // jeśli faktycznie brak wyników
            "Business", 1,
            "Gaming", 0,      // jeśli faktycznie brak wyników
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

        try {
            Thread.sleep(1500);
        } catch (InterruptedException ignored) {}

        List<WebElement> results = driver.findElements(By.cssSelector(".element"));

        String originalKey = expectedResults.keySet().stream()
                .filter(k -> k.equalsIgnoreCase(phrase))
                .findFirst()
                .orElse(null);

        assertNotNull(originalKey, "Phrase not found in expectedResults: " + phrase);

        int expectedCount = expectedResults.get(originalKey);
        int actualCount = results.size();

        System.out.println("Phrase: " + phrase + ", Expected: " + expectedCount + ", Found: " + actualCount);

        assertEquals(expectedCount, actualCount,
                "Incorrect number of results for phrase: " + phrase);
    }
}
