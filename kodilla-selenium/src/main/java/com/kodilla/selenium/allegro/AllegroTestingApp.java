package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllegroTestingApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        try {
            WebElement acceptCookies = driver.findElement(By.xpath("//button[contains(text(),'Przejdz do serwisu')]"));
            acceptCookies.click();
        } catch (Exception e) {

        }

        WebElement categoryDropdown = driver.findElement(By.xpath("//select[@data-role='filters-dropdown']"));
        categoryDropdown.click();

        WebElement electronicsOption = driver.findElement(By.xpath("//option[text()='Elektronika']"));
        electronicsOption.click();

        WebElement searchInput = driver.findElement(By.xpath("//input[@data-role='search-input']"));
        searchInput.sendKeys("Mavic mini");

        WebElement searchButton = driver.findElement(By.xpath("//button[@data-role='search-button']"));
        searchButton.click();

        Thread.sleep(5000);
        driver.quit();
    }
}
