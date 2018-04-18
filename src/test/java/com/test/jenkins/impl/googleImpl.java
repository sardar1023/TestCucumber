package com.test.jenkins.impl;

import org.openqa.selenium.WebDriver;

import com.jenkins.test.pages.GooglePage;

public class googleImpl {

	private static final WebDriver driver = null;
	public GooglePage googlePage;

	public GooglePage getGooglePage() {
		if (googlePage == null) {
			googlePage = new GooglePage(driver);
		}
		return googlePage;
	}

	public void openGoogle() {
	
		getGooglePage().openGoogle();
	}

	public void insertGooglePage() {

		getGooglePage().insertText("sardar");

	}

	public void clickGooglePage() {
	
		getGooglePage().btnClick();
	}
	
	public void closeBrowser() {

		getGooglePage().tearDown();
	}
}
