package com.Sasha.shop24;

import com.Sasha.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class SearchPage extends BasePage {

    private By label=new By.ByXPath("//h1[@class='page-main__title']");
    private By selectedProduct=new By.ByXPath("//a[@class='pseudo-link']");

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened(){return driver.findElement(label).isDisplayed();}

    public ProductPage openProductPage() {

        List<WebElement> products=driver.findElements(selectedProduct);
        Random rand = new Random();
        int randomProduct = rand.nextInt(products.size());
        products.get(randomProduct).click();
        return new ProductPage(driver);
    }
}
