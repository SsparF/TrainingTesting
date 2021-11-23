package com.Sasha;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTest extends BaseTest {

    @Test
    public void simpleTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        Assert.assertTrue(mainPage.isOpened());
        TrashPage trashpage = mainPage.openTrash();
        Assert.assertTrue(trashpage.isOpened());
    }

}
