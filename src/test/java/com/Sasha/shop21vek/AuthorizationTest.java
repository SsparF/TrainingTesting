package com.Sasha.shop21vek;

import com.Sasha.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthorizationTest extends BaseTest {

    @Test
    public void test() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        Assert.assertTrue(mainPage.isOpened());
        mainPage.goToLogin();
        LoginPage loginPage=new LoginPage(driver);
        Assert.assertTrue(loginPage.isOpened());
        loginPage.authorization();
        MainPage mainPage1=new MainPage(driver);
        Assert.assertTrue(mainPage1.isOpened());
    }
}
