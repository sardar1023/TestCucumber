package com.jenkins.test.pages;

import com.jekins.test.lib.PropReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;


public class GooglePage extends BasePage {

	//"//input[@id ='lst-ib']";
	public static final String gglSearchbar = "//input[@name ='q']";
	public static final String gglSearchBtn = "//input[@name ='btnK']";

	PropReader prop = new PropReader();

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
	
	public void insertText(String text) {
		searchBar.sendKeys(text);
	}
	
	public void btnClick() {
		//searchBtn.click();
		searchBar.sendKeys(Keys.ENTER);
	}
	
	public void tearDown() {
		driver.close();
	}
}


