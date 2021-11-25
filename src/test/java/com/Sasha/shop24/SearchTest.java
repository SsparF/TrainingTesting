package com.Sasha.shop24;
import com.Sasha.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {

    @Test
    public void test() {
        MainPage mainPage=new MainPage(driver);
        mainPage.open();
        Assert.assertTrue(mainPage.isOpened());
        mainPage.searchProduct();
        SearchPage searchPage=new SearchPage(driver);
        Assert.assertTrue(searchPage.isOpened());
        searchPage.openProductPage();
        ProductPage productPage=new ProductPage(driver);
        Assert.assertTrue(productPage.isOpened());
        Assert.assertTrue(productPage.nameContains());
    }
}
