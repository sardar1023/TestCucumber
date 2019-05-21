package com.jenkins.test.pages;

import com.jekins.test.lib.PropReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;


public class GooglePage extends BasePage {

    public static final String gglSearchbar = "//input[@name ='q']";
    public static final String gglSearchBtn = "//input[@name ='btnK']";

    PropReader prop = new PropReader();

    @CacheLookup
    @FindBy(xpath = gglSearchbar)
    public static WebElement searchBar;

    @CacheLookup
    @FindBy(xpath = gglSearchBtn)
    public static WebElement searchBtn;

    public GooglePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void openGoogle() {
        String url = null;
        String path = null;
        String chrome = null;
        try {
            url = prop.getValues().get("url").toString();
            path = prop.getValues().get("path").toString();
            chrome = prop.getValues().get("chrome").toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.setProperty(chrome, path);
        driver = new ChromeDriver();
        driver.get(url);
    }

    /**Insert text to the google search bar*/
    public void insertText(String text) {
        searchBar.sendKeys(text);
    }

    /**Click enter after insert value*/
    public void btnClick() {
        //searchBtn.click();
        WebElement search = driver.findElement(By.xpath("//input[@name ='q']"));
        if (search.isDisplayed())
            search.sendKeys(Keys.ENTER);
    }

    /**Insert text to the field for with the specific value*/
    public void insertToField(String name) {
        WebElement search = driver.findElement(By.xpath("//input[@name ='q']"));
        if (search.isDisplayed()) {
            search.sendKeys(name);
        } else {
            return;
        }
    }

    /**Click on the Ruby link*/
    public void clickRubyLink(String linkText){

        WebElement rubyLink = driver.findElement(By.xpath("//a/h3[.='" + linkText + "']"));

        if(rubyLink.isDisplayed()){
            rubyLink.click();
        } else {
            return;
        }
    }

    /**Kill the session--close the browser*/
    public void tearDown() {
        driver.close();
    }
}


