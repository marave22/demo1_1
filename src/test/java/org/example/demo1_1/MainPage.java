package org.example.demo1_1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public static WebDriver driver;
    public MainPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-auth-layout[1]/main[1]/div[1]/app-landing-page[1]/" +
            "div[1]/div[1]/div[1]/a[1]")
    public WebElement openSignInPageButton;

    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-auth-layout[1]/main[1]/div[1]/app-sign-in[1]/div[1]/" +
            "div[1]/form[1]/mat-form-field[1]/div[1]/div[1]/div[2]/input[1]")
    public WebElement emailInput;

    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-auth-layout[1]/main[1]/div[1]/app-sign-in[1]/div[1]/" +
            "div[1]/form[1]/mat-form-field[2]/div[1]/div[1]/div[2]/input[1]")
    public WebElement passwordInput;

    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-auth-layout[1]/main[1]/div[1]/app-sign-in[1]/div[1]/div[1]" +
            "/form[1]/mat-form-field[1]/div[1]/div[1]/div[2]/input[1]")
    public WebElement signInButton;

    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-auth-layout[1]/main[1]/div[1]/app-sign-in[1]/div[1]/div[1]" +
            "/form[1]/mat-form-field[2]/div[1]/div[1]/div[2]/input[1]")
    public WebElement pageAssertionText;
}