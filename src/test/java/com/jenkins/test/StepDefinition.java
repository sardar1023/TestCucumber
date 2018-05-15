package com.jenkins.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.test.jenkins.impl.googleImpl;
import com.test.jenkins.impl.wikiImpl;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	static WebDriver driver;
	static WebElement element;

	@Given("^Open the Browser and come to google$")
	public void open_the_Browser_and_come_to_google() throws Throwable {
//		String url = "https://www.google.com";
//		String path = "C:\\Users\\chromeDriver\\chromedriver.exe";
//		System.setProperty("webdriver.chrome.driver", path);
//		driver = new ChromeDriver();
//		driver.get(url);
		googleImpl gogleImpl = new googleImpl();
		gogleImpl.openGoogle();
	}

	@When("^Put my name into the search box$")
	public void put_my_name_into_the_search_box() throws Throwable {
//		element = driver.findElement(By.id("lst-ib"));
//		element.sendKeys("sardar");
		
		googleImpl gogleImpl = new googleImpl();
		gogleImpl.insertGooglePage();
	}

	@Then("^click on the search button$")
	public void click_on_the_search_button() throws Throwable {
//		element = driver.findElement(By.name("btnK"));
//		element.click();
		googleImpl gogleImpl = new googleImpl();
		gogleImpl.clickGooglePage();
	}

	@Then("^confirm my name in the heading$")
	public void confirm_my_name_in_the_heading() throws Throwable {
//		element = driver.findElement(By.linkText("Sardar - Wikipedia"));
//		element.click();
//
//		element = driver.findElement(By.xpath("//h1[@id= 'firstHeading' and @class='firstHeading']"));
//		element.getText();
//
//		if (element.getText().equalsIgnoreCase("Sardar")) {
//			System.out.println("PASS");
//		} else {
//			System.out.println("Failed");
//		}
		
		wikiImpl wkiImpl = new wikiImpl();
		wkiImpl.clickWikiContent();
		wkiImpl.verifyTheHeading();
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		Thread.sleep(2000);
		googleImpl gogleImpl = new googleImpl();
		gogleImpl.closeBrowser();
	}

}
