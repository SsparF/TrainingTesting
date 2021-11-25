package com.Sasha.shop21vek;
import com.Sasha.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {

        super(driver);
    }

    private By title=new By.ByCssSelector("a.logotypeImg");
    private By trash=new By.ByCssSelector("a.headerCartBox");
    private By search = new By.ByXPath("//input[@id='j-search']");
    private By accountButton= new By.ByXPath("//button[@class='styles_userToolsToggler__imcSl']");
    private By loginButton= new By.ByXPath("//button[@class='userToolsBtn']");

    @Override
    public boolean isOpened() {
        return driver.findElement(title).isDisplayed();
    }

    public void open(){
        driver.get("https://www.21vek.by/");
    }

    public TrashPage openTrash(){
        driver.findElement(trash).click();
        return new TrashPage(driver);
    }

    public ProductPage searchProd() {
        WebElement searchBox = driver.findElement(search);
        searchBox.click();
        searchBox.sendKeys("Lego" + Keys.ENTER);
        return new ProductPage(driver);
    }

    public LoginPage goToLogin(){
        driver.findElement(accountButton).click();
        driver.findElement(loginButton).click();
        return  new LoginPage(driver);
    }
}
