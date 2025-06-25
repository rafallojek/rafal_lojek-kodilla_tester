package com.kodilla.selenium.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StoreSearchExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver.exe");  	// [1]
        WebDriver driver = new ChromeDriver(); // [2]
        driver.get("https://kodilla.com/pl/test/store"); // [3]

        WebElement inputField = driver.findElement(By.name("search"));
        inputField.sendKeys("School");
        inputField.submit();                                  	// [1]
    }
}