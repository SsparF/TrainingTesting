package com.Sasha.shop21vek;

import com.Sasha.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    private String myLog="sashaparfiak007@gmail.com";
    private String myPassWd="I5LBn4Dm";
    private By loginButton=new By.ByXPath("//button[@class='styles_reactButton__2olKd style_baseActionButton__2LQYJ styles_submitButton__lmwVK']");
    private By loginBox=new By.ByXPath("//input[@id='login-email']");
    private By passwordBox=new By.ByXPath("//input[@name='password']");

    public LoginPage (WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened(){
        return driver.findElement(loginButton).isDisplayed();
    }

    public MainPage authorization(){
        WebElement login=driver.findElement(loginBox);
        login.click();
        login.sendKeys(myLog);
        WebElement password=driver.findElement(passwordBox);
        password.click();
        password.sendKeys(myPassWd);
        driver.findElement(loginButton);
        return new MainPage(driver);
    }
}
