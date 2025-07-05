package com.kodilla.selenium.pom;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class KodillaLoginPomTest {

    KodillaLoginPom loginPom;
    WebDriver driver;

    @BeforeEach
    public void setup() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://kodilla.com/pl/test/login");
        loginPom = new KodillaLoginPom(driver);
    }

    @Test
    public void testLoginPage_CheckErrorValidation() {
        String email = "test@toniedziala.pl";
        String password = "password";

        loginPom.login(email, password);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        boolean alertPresent;
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            alertPresent = true;
        } catch (TimeoutException e) {
            alertPresent = false;
        }

        assertFalse(alertPresent, "Alert should not appear for incorrect login");
    }

    @Test
    public void testLoginPage_CheckPositiveValidation() {
        String email = "test@kodilla.com";
        String password = "kodilla123";

        loginPom.login(email, password);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            WebElement successMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.cssSelector(".login-form__success")
            ));
            String text = successMsg.getText();
            System.out.println("Login success message: " + text);
            assertTrue(text.toLowerCase().contains("login") || text.toLowerCase().contains("zalogowano"),
                    "Unexpected login success message: " + text);
        } catch (TimeoutException e) {
            fail("Expected success message after login but none appeared.");
        }
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
