package com.Sasha.shop21vek;

import com.Sasha.BasePage;
import com.Sasha.constants.TimeConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginModalPage extends BasePage {

    private By loginButton=new By.ByXPath("//button[@class='styles_reactButton__2olKd style_baseActionButton__2LQYJ styles_submitButton__lmwVK']");
    private By loginBox=new By.ByXPath("//input[@id='login-email']");
    private By passwordBox=new By.ByXPath("//input[@name='password']");

    public LoginModalPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened(){
        return WaitUntil(TimeConstants.PAGE_LOAD_TIMEOUT, ExpectedConditions.presenceOfElementLocated(loginButton));
        //return driver.findElement(loginButton).isDisplayed();
    }

    public MainPage authorization(String myLog, String myPassWd){
        WebElement login=driver.findElement(loginBox);
        login.click();
        login.sendKeys(myLog);
        WebElement password=driver.findElement(passwordBox);
        password.click();
        password.sendKeys(myPassWd);
        driver.findElement(loginButton).click();
        return new MainPage(driver);
    }
}
