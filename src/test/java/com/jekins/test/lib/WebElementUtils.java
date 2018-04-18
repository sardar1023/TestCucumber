package com.jekins.test.lib;

import org.openqa.selenium.WebElement;

public class WebElementUtils {
	
	public void clickBtn(WebElement element) {
		element.click();
	}

	public void enterText(WebElement element,String text) {
		element.sendKeys(text);
	}
	
	public boolean isDiplayed() {
		return true;
	}
}
