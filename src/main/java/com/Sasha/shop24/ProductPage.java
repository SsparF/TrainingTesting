package com.Sasha.shop24;

import com.Sasha.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProductPage extends BasePage {

    private By buyButton=new By.ByXPath("//a[@class='open-modal new-button new-button_green']");
    private By title=new By.ByXPath("//h1[@class='page-main__title']");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        return driver.findElement(buyButton).isDisplayed();
    }

    public boolean nameContains(){
        MainPage mainPage=new MainPage(driver);
        String prodName=driver.findElement(title).getText();
        //System.out.println(prodName);
        Pattern p=Pattern.compile("(^)?(Д|д)рель");
        Matcher m=p.matcher(prodName);
        while (m.find())
        {
            return true;
        }
        return false;
    }
}
