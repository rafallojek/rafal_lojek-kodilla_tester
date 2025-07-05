package com.kodilla.selenium.pom;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

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
    public void testLoginPage_CheckPositiveValidation() {
        String email = "test@kodilla.com";
        String password = "kodilla123";

        loginPom.login(email, password);


        try {
            Thread.sleep(2000);
        } catch (InterruptedException ignored) {}

        String bodyText = driver.findElement(By.tagName("body")).getText();
        System.out.println("=== TEKST NA STRONIE PO ZALOGOWANIU ===");
        System.out.println(bodyText);
        System.out.println("=== KONIEC TEKSTU ===");

    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
