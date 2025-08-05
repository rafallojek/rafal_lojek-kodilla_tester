package com.kodilla.selenium.search;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StoreSearchExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://kodilla.com/pl/test/store");

        WebElement inputField = wait.until(ExpectedConditions.elementToBeClickable(By.name("search")));

        inputField.sendKeys("School");
        inputField.sendKeys(Keys.ENTER);

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(".element")));

        System.out.println("Wyszukiwanie zakończone.");

        driver.quit();
    }
}
