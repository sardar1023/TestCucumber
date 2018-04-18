package com.jekins.test.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverUtils {

	WebDriver driver;
	
	public void Setup(String browser) throws Exception {
		if (browser.equalsIgnoreCase("firefox")) {
			String path = null;
			System.setProperty("webdriver.gecko.driver", path);
			driver = new FirefoxDriver();
		} else if(browser.equalsIgnoreCase("chrome")) {
			String path = "C:\\Users\\chromeDriver\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);
			driver = new ChromeDriver();
		} else {
			throw new Exception("Browser is not correct");
		}

	}
}
