package com.Sasha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class ProductPage extends BasePage {

    private By logotype = new By.ByXPath("//h1[@class='content__header cr-category_header']");
    private By addButton = new By.ByXPath("//button[@class='g-button g-buybtn result__buybtn cr-buybtn__in j-ga_track']");
    private By names = new By.ByXPath("//span[@class='result__name']");
    private By selectedProduct = new By.ByXPath("//a[@class='j-button-clicked g-basketbtn']");

    ProductPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        return driver.findElement(logotype).isDisplayed();
    }

    public WebElement addInBasket() {

        HelpModalPage helpModalPage=new HelpModalPage(driver);
        if (helpModalPage.isOpened()) {
            helpModalPage.closeModPage();
        }
        List<WebElement> allProducts = driver.findElements(addButton);
        List<WebElement> allNames = driver.findElements(names);
        Random rand = new Random();
        int randomProduct = rand.nextInt(allProducts.size());
        allProducts.get(randomProduct).click();
        return allNames.get(randomProduct);
    }

    public TrashPage openBasket() {
        driver.findElement(selectedProduct).click();
        return new TrashPage(driver);
    }


}

