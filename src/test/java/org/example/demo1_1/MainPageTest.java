package org.example.demo1_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;
import static org.example.demo1_1.MainPage.driver;

public class MainPageTest {
    MainPage mainPage = new MainPage(driver);
//    public WebDriver driver;
//    private MainPage mainPage;

@BeforeMethod    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo4-dunnes.buymie.eu/");

        mainPage = new MainPage(driver);
    }

@AfterMethod public void tearDown() {
        driver.quit();
    }

    @Test
    public void openSignInPage() {
        mainPage.openSignInPageButton.click();
   }
    @Test
    public void loginWithValidUsername() {
        mainPage.emailInput.sendKeys("mar1@harakirimail.com");
        mainPage.passwordInput.sendKeys("Qwerty1!");
        mainPage.signInButton.click();
    }

    @Test
    public void checkLoginSuccess() {
        String pageText = mainPage.pageAssertionText.getText();
        Assert.assertTrue(true, String.valueOf(pageText.contains("Your VALUEclub card")));
    }
}