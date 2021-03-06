package com.jenkins.test.impl;

import com.jenkins.test.pages.BasePage;
import com.jenkins.test.pages.GooglePage;

import java.io.IOException;

public class googleImpl {

	//private static final WebDriver driver = null;
	public GooglePage googlePage;

	public GooglePage getGooglePage() {
		if (googlePage == null) {
			googlePage = new GooglePage(BasePage.driver);
		}
		return googlePage;
	}

	public void openGoogle(){
	
		getGooglePage().openGoogle();
	}

	public void insertGooglePage() {

		String name = "sardar";
		getGooglePage().insertText(name);

	}

	public void clickGooglePage() {
	
		getGooglePage().btnClick();
	}
	
	public void closeBrowser() {

		getGooglePage().tearDown();
	}

	public void inserToField(String name){
		getGooglePage().insertToField(name);
	}

	public void clickOnLinkWithText(String linkText){
		getGooglePage().clickRubyLink(linkText);
	}
}
