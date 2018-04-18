package com.jenkins.test.pages;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {

	public static WebDriver driver;
	
	public BasePage (WebDriver driver) {
		BasePage.driver = driver;
	}
	
	public WebDriver getWebDriver() {
		return driver;
	}
}
