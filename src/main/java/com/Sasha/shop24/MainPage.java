package com.Sasha.shop24;

import com.Sasha.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {

    public String inputValue="Дрель";
    private By logoImg=new By.ByXPath("//img[@class='hidden-xs']");
    private By searchBox=new By.ByXPath("//input[@class='top-search__input white-input js-top-search-input']");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void open(){
        driver.get("https://24shop.by/");
    }

    @Override
    public boolean isOpened(){return driver.findElement(logoImg).isDisplayed();}

    public SearchPage searchProduct(){
        WebElement searchInput=driver.findElement(searchBox);
        searchInput.click();
        searchInput.sendKeys(inputValue+ Keys.ENTER);
        return new SearchPage(driver);
    }
}
