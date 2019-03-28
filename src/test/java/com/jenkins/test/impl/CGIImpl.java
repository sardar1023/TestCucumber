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

	/**Open the browser */
	public void openCGI() {
		getCGIPage().openCGI();
	}
	/**Click on the target link*/
	public void clickContactLink() {
		getCGIPage().clickContactLink();
	}
	/**Get text in the header*/
	public void getHeaderText() {
		getCGIPage().getHeaderText();
	}
	/**Take screenshot*/
	public byte[] getScreenShot(){
		return getCGIPage().getScreenShot();
	}
}
