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
        boolean loggedIn = loginPom.login(email, password);
        assertFalse(loggedIn, "Login should fail with incorrect credentials");
    }

    @Test
    public void testLoginPage_CheckPositiveValidation() {
        String email = "test@kodilla.com";
        String password = "kodilla123";

        // Poczekaj na alert, jeśli jest
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        boolean alertPresent;
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            alertPresent = true;
        } catch (TimeoutException e) {
            alertPresent = false;
        }

        boolean loggedIn = loginPom.login(email, password);

        assertTrue(alertPresent, "Expected alert on successful login");
        assertTrue(loggedIn, "Login should succeed with correct credentials");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
