package com.Sasha;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {

    WebDriver driver;

    @BeforeSuite
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }
    @BeforeTest
    public void setupTest() {
        driver = new ChromeDriver();
    }
    @AfterTest
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
    @Test
    public void test() {
        String url = "https://www.faceit.com/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);
    }
}
