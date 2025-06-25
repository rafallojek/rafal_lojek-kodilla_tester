package com.kodilla.selenium.allegro;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            WebElement acceptCookies = driver.findElement(By.cssSelector("button[data-role='accept-consent']"));
            acceptCookies.click();
        } catch (Exception ignored) {}

        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (NoAlertPresentException ignored) {}

        WebElement categoryDropdown = driver.findElement(By.cssSelector("select[data-role='filters-dropdown']"));
        categoryDropdown.click();

        WebElement electronicsOption = driver.findElement(By.cssSelector("option[value='/kategoria/elektronika']"));
        electronicsOption.click();

        WebElement searchInput = driver.findElement(By.cssSelector("input[data-role='search-input']"));
        searchInput.sendKeys("Mavic mini");

        WebElement searchButton = driver.findElement(By.cssSelector("button[data-role='search-button']"));
        searchButton.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("section>article")));

        List<WebElement> productCards = driver.findElements(By.cssSelector("section > article"));

        for (WebElement product : productCards) {
            System.out.println("Produkt:\n" + product.getText());
            System.out.println("---------------");
        }

        driver.quit();
    }
}
