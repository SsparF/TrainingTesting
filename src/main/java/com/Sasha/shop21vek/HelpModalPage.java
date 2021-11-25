package com.Sasha.shop21vek;

import com.Sasha.BasePage;
import com.Sasha.constants.TimeConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HelpModalPage extends BasePage {

    protected By closeButt = new By.ByXPath("(//div[@class='popmechanic-close'])[1]");

    HelpModalPage(WebDriver driver){
        super(driver);
    }

    @Override
    public boolean isOpened() {
        //return driver.findElement(closeButt).isDisplayed();
        return WaitUntil(TimeConstants.PAGE_LOAD_TIMEOUT, ExpectedConditions.presenceOfElementLocated(closeButt));
    }

    public void closeModPage() {
        driver.findElement(closeButt).click();
    }

}
