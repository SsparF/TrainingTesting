package com.Sasha.shop21vek;

import com.Sasha.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasketTest extends BaseTest {

    @Test
    public void test() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        ProductPage goodPage = mainPage.searchProd();
        Assert.assertTrue(goodPage.isOpened());
        String nameOfSelectedProduct = goodPage.addInBasket().getText();
        TrashPage trashPage = goodPage.openBasket();
        Assert.assertEquals(nameOfSelectedProduct,trashPage.getTrashesNames().get(0));
    }
}
