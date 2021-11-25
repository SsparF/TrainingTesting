package com.Sasha.shop21vek;

import com.Sasha.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthorizationTest extends BaseTest {

    @Test
    public void test() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        LoginModalPage loginPage=mainPage.goToLogin();
        Assert.assertTrue(loginPage.isOpened());
        mainPage=loginPage.authorization("sashaparfiak007@gmail.com","I5LBn4Dm");
        Assert.assertTrue(mainPage.isOpened());
        Assert.assertEquals("sashaparfiak007@gmail.com", mainPage.getAuthorizedEmail());
    }
}
