package com.kodilla.selenium.pom;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KodillaLoginPom {

    @FindBy(css = "input[type='email']")
    WebElement emailField;

    @FindBy(css = "input[type='password']")
    WebElement passwordField;

    @FindBy(xpath = "//button[contains(text(), 'Log in')]")
    WebElement loginButton;

    WebDriver driver;

    public KodillaLoginPom(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean login(String email, String password) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();

        try {
            Alert alert = driver.switchTo().alert();
            String message = alert.getText();
            alert.dismiss();
            return message.equals("You are login now!");
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
