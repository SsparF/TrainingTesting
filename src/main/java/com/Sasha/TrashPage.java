package com.Sasha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrashPage {

    protected WebDriver driver;
    private By label=new By.ByCssSelector("span.BasketTabsScreen_title__2NSA4");
    ////span[@class='BasketTabsScreen_title__2NSA4' and contains(text(),'Корзина')]

    public TrashPage(WebDriver driver) {
        this.driver=driver;
    }

    public boolean isOpened() {
        return driver.findElement(label).isDisplayed();
    }
}
