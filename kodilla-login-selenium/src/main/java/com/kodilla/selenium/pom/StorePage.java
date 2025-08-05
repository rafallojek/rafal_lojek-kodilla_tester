package com.kodilla.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class StorePage {
    private final WebDriver driver;
    private final By searchInput = By.id("searchField");  // poprawione id na "searchField"
    private final By results = By.cssSelector(".element");

    public StorePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://kodilla.com/pl/test/store");
    }

    public void searchFor(String keyword) {
        WebElement input = driver.findElement(searchInput);
        input.clear();
        input.sendKeys(keyword);

        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(results));
    }

    public int getNumberOfResults() {
        List<WebElement> elements = driver.findElements(results);
        return elements.size();
    }
}
