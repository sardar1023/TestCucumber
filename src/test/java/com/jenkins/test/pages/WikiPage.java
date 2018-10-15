package com.jenkins.test.pages;

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
		if(wikLink.isDisplayed())
		wikLink.click();
	}

	public void verifyTitle() {
		if (heding.isDisplayed() && heding.getText().equalsIgnoreCase("Sardar")) {
			System.out.println("header is right");
		} else {
			System.out.println("header is not right");
		}
	}
}
