package com.jenkins.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class CGIpage extends BasePage {

	public static final String contact = "//div[@class='content']/ul[@class='menu']/li[@class='first last leaf']/a";
	public static final String headerText = "//h1[.='Contact us']";

	public CGIpage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void openCGI() {
		String url = "https://www.cgi.com/en";
		String path = "C:/Users/chromeDriver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get(url);
	}

	public void clickContactLink() {

		WebElement link = driver.findElement(By.xpath(contact));
		if(link.isDisplayed())
			link.click();
	}
	
	public void getHeaderText() {
		WebElement text = driver.findElement(By.xpath(headerText));
		if(text.isDisplayed())
		System.out.println(text.getText());
	}
}