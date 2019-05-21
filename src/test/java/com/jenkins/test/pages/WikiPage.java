package com.jenkins.test.pages;

import com.jekins.test.lib.CucumberLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiPage extends BasePage {

    public static final String wikiLink = "//h3[.= 'Sardar - Wikipedia']";
    public static final String heading = "//h1[@id= 'firstHeading' and @class='firstHeading']";

    @FindBy(xpath = wikiLink)
    public static WebElement wikLink;

    @FindBy(xpath = heading)
    public static WebElement heding;

    public WikiPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getWebDriver(), this);
    }

    public void clickOnLink() {
        if (wikLink.isDisplayed())
            wikLink.click();
        CucumberLogger.logPass("Button showed up");


    }

    public void verifyTitle() {
        if (heding.isDisplayed() && heding.getText().equalsIgnoreCase("Sardar")) {
            System.out.println("header is right");
            CucumberLogger.logPass("header is right");
        } else {
            System.out.println("header is not right");
            CucumberLogger.logFail("header is not right");
        }
    }

    public boolean rubyHeader(){
        String header = headerValue();
        if(header.equalsIgnoreCase("Ruby")){
            return true;
        }
        return false;
    }


    public String headerValue() {
        WebElement header = driver.findElement(By.id("firstHeading"));
        return header.getText().trim();
    }
}
