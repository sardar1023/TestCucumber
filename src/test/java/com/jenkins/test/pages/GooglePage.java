package com.jenkins.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class GooglePage extends BasePage {

	public static final String gglSearchbar = "//input[@id ='lst-ib']";
	public static final String gglSearchBtn = "//input[@name ='btnK']";
	

	@CacheLookup
	@FindBy(xpath= gglSearchbar)
	public static WebElement searchBar;
	
	@CacheLookup
	@FindBy(xpath= gglSearchBtn)
	public static WebElement searchBtn;
	
	public GooglePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void openGoogle() {
		String url = "https://www.google.com";
		String path = "C:/Users/chromeDriver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	public void insertText(String text) {
		searchBar.sendKeys(text);
	}
	
	public void btnClick() {
		searchBtn.click();
	}
	
	public void tearDown() {
		driver.close();
	}
}


