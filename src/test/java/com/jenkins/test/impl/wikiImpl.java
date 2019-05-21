package com.jenkins.test.impl;

import com.jenkins.test.pages.BasePage;
import com.jenkins.test.pages.WikiPage;

public class wikiImpl {

	//WebDriver driver;
	private WikiPage wikiPage = null;
	
	private WikiPage getWikiPage() {
		if(wikiPage == null) {
			wikiPage = new WikiPage(BasePage.driver);
		}
		return wikiPage;
	}
	
	public void clickWikiContent() {
		getWikiPage().clickOnLink();
	}
	
	public void verifyTheHeading() {
		getWikiPage().verifyTitle();
	}

	public boolean rubyHeader(){
		return getWikiPage().rubyHeader();
	}
}
