package com.Sasha.shop24;
import com.Sasha.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class SearchTest extends BaseTest {

    @Test
    public void test() {
        MainPage mainPage=new MainPage(driver);
        mainPage.open();
        SearchPage searchPage=mainPage.searchProduct("Дрель");
        Assert.assertTrue(searchPage.isOpened());
        Random rand = new Random();
        int index=rand.nextInt(searchPage.getSearchItemsNames().size()-1);
        ProductPage productPage=searchPage.openSearchItem(index);
        Assert.assertTrue(productPage.isOpened());
        Assert.assertTrue(productPage.nameContains("Дрель"));
    }
}
