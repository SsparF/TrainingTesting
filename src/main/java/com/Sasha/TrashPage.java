package com.Sasha;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class TrashPage extends  BasePage {

    private By label=new By.ByCssSelector("span.BasketTabsScreen_title__2NSA4");
    private By firstProdName=new By.ByCssSelector("td.cr-basket__name > a");

    public TrashPage(WebDriver driver) {
        super(driver);
    }

    public List<String> getTrashesNames()
    {
        //List<String> names=new ArrayList<>();
        //for (WebElement el: trashesNames) {
        //    names.add(el.getText());
        //}
        List<WebElement> trashesNames= driver.findElements(firstProdName);
        return trashesNames.stream().map(el->el.getText()).collect(Collectors.toList());
    }

    public boolean isOpened() {
        return driver.findElement(label).isDisplayed();
    }
}
