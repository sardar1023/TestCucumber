package com.jenkins.sc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTest {

	static WebDriver driver;
	static WebElement element;

	public static void main(String[] args) throws Exception {

		String url = "https://www.google.com";
		String path = "C:\\Users\\chromeDriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get(url);

		element = driver.findElement(By.id("lst-ib"));
		element.sendKeys("sardar");

		element = driver.findElement(By.name("btnK"));
		element.click();

		element = driver.findElement(By.linkText("Sardar - Wikipedia"));
		element.click();

		element = driver.findElement(By.xpath("//h1[@id= 'firstHeading' and @class='firstHeading']"));
		element.getText();

		if (element.getText().equalsIgnoreCase("Sardar")) {
			System.out.println("PASS");
		} else {
			System.out.println("Failed");
		}

		Thread.sleep(2000);
		driver.close();
	}
}
