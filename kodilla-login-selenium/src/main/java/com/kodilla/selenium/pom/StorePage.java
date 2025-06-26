package com.kodilla.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class StorePage {
    private final WebDriver driver;
    private final By searchInput = By.id("search-field");  // zakładamy, że to ID pola wyszukiwania
    private final By results = By.cssSelector(".element"); // zakładamy, że każdy produkt ma klasę "element"

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
    }

    public int getNumberOfResults() {
        List<WebElement> elements = driver.findElements(results);
        return elements.size();
    }
}
