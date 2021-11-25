package com.Sasha.shop24;

import com.Sasha.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class SearchPage extends BasePage {

    private By label=new By.ByXPath("//h1[@class='page-main__title']");
    private By selectedProduct=new By.ByXPath("//a[@class='pseudo-link']");

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened(){return driver.findElement(label).isDisplayed();}

    public ProductPage openSearchItem(int index) {
        List<WebElement> products=driver.findElements(selectedProduct);
        products.get(index).click();
        return new ProductPage(driver);
    }

    public List<String> getSearchItemsNames(){
        List<WebElement> products=driver.findElements(selectedProduct);
        return products.stream().map(el->el.getText()).collect(Collectors.toList());
    }
}
