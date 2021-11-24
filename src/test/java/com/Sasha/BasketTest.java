package com.Sasha;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BasketTest extends BaseTest{

    @Test
    public void test() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        Assert.assertTrue(mainPage.isOpened());
        mainPage.searchProd();
        ProductPage goodPage = new ProductPage(driver);
        Assert.assertTrue(goodPage.isOpened());
        String nameOfSelectedProduct = goodPage.addInBasket().getText();
        goodPage.openBasket();
        TrashPage trashPage = new TrashPage(driver);
        Assert.assertEquals(nameOfSelectedProduct,trashPage.getTrashesNames().get(0));
    }
}
