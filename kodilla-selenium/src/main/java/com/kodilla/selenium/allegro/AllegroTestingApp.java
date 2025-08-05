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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // wydłużony timeout

        try {
            driver.get("https://allegro.pl");
            driver.manage().window().maximize();

            try {
                WebElement acceptCookies = wait.until(
                        ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-role='accept-consent']"))
                );
                acceptCookies.click();
                System.out.println("Zaakceptowano cookies.");
            } catch (TimeoutException e) {
                System.out.println("Brak przycisku akceptacji cookies lub za długo się ładował.");
            }

            try {
                Alert alert = driver.switchTo().alert();
                alert.accept();
                System.out.println("Alert zaakceptowany.");
            } catch (NoAlertPresentException ignored) {
                System.out.println("Brak alertu na stronie.");
            }

            WebElement categoryDropdown = wait.until(
                    ExpectedConditions.elementToBeClickable(By.cssSelector("select[data-role='filters-dropdown']"))
            );
            categoryDropdown.click();

            WebElement electronicsOption = wait.until(
                    ExpectedConditions.elementToBeClickable(By.cssSelector("option[value='/kategoria/elektronika']"))
            );
            electronicsOption.click();

            WebElement searchInput = wait.until(
                    ExpectedConditions.elementToBeClickable(By.cssSelector("input[data-role='search-input']"))
            );
            searchInput.sendKeys("Mavic mini");

            WebElement searchButton = wait.until(
                    ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-role='search-button']"))
            );
            searchButton.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("section>article")));

            List<WebElement> productCards = driver.findElements(By.cssSelector("section > article"));

            for (WebElement product : productCards) {
                System.out.println("Produkt:\n" + product.getText());
                System.out.println("---------------");
            }

        } catch (Exception e) {
            System.out.println("Wystąpił błąd podczas testu: " + e.getMessage());
            e.printStackTrace();
        } finally {
            driver.quit();
            System.out.println("Przeglądarka zamknięta.");
        }
    }
}
