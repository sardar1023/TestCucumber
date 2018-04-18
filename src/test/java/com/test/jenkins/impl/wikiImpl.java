package com.test.jenkins.impl;

import org.openqa.selenium.WebDriver;

import com.jenkins.test.pages.WikiPage;

public class wikiImpl {

	WebDriver driver;
	private WikiPage wikiPage = null;
	
	private WikiPage getWikiPage() {
		if(wikiPage == null) {
			wikiPage = new WikiPage(driver);
		}
		return wikiPage;
	}
	
	public void clickWikiContent() {
		getWikiPage().clickOnLink();
	}
	
	public void verifyTheHeading() {
		getWikiPage().verifyTitle();
	}
}
