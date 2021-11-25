package com.Sasha.shop21vek;
import com.Sasha.BasePage;
import com.Sasha.constants.TimeConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {

        super(driver);
    }

    private By title=new By.ByCssSelector("a.logotypeImg");
    private By backetButton =new By.ByCssSelector("a.headerCartBox");
    private By search = new By.ByXPath("//input[@id='j-search']");
    private By accountButton= new By.ByXPath("//span[contains(text(), 'Аккаунт')]");
    private By loginButton= new By.ByXPath("//button[@class='userToolsBtn']");
    private By authorizedEmail= new By.ByXPath("//span[@class='userToolsSubtitle']");

    @Override
    public boolean isOpened() {
        return driver.findElement(title).isDisplayed();
    }

    public void open(){
        driver.get("https://www.21vek.by/");
    }

    public TrashPage openTrash(){
        driver.findElement(backetButton).click();
        return new TrashPage(driver);
    }

    public ProductPage searchProd() {
        WebElement searchBox = driver.findElement(search);
        searchBox.click();
        searchBox.sendKeys("Lego" + Keys.ENTER);
        return new ProductPage(driver);
    }

    public LoginModalPage goToLogin() {
        driver.findElement(accountButton).click();
        driver.findElement(loginButton).click();
        return  new LoginModalPage(driver);
    }

    public String getAuthorizedEmail() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WaitUntil(TimeConstants.PAGE_LOAD_TIMEOUT, ExpectedConditions.elementToBeClickable(accountButton));
        driver.findElement(accountButton).click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String s=driver.findElement(authorizedEmail).getText();
        return s;
    }
}
