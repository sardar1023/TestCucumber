package com.jenkins.test.impl;

import com.jenkins.test.pages.BasePage;
import com.jenkins.test.pages.CGIpage;

public class CGIImpl {

	public CGIpage cgiPage;

	public CGIpage getCGIPage() {
		if (cgiPage == null) {
			cgiPage = new CGIpage(BasePage.driver);
		}
		return cgiPage;
	}
	
	public void openCGI() {
		getCGIPage().openCGI();
	}
	
	public void clickContactLink() {
		getCGIPage().clickContactLink();
	}
	
	public void getHeaderText() {
		getCGIPage().getHeaderText();
	}
}
