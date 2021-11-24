package com.Sasha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelpModalPage extends BasePage {

    protected By closeButt = new By.ByXPath("(//div[@class='popmechanic-close'])[1]");

    HelpModalPage(WebDriver driver){
        super(driver);
    }

    @Override
    public boolean isOpened() {
        //return driver.findElement(closeButt).isDisplayed();
        return WaitUntilElementPresence(closeButt);
    }

    public void closeModPage() {
        driver.findElement(closeButt).click();
    }

}
