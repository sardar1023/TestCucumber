package com.jenkins.test.steps;

import com.jenkins.test.impl.googleImpl;
import com.jenkins.test.impl.wikiImpl;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {


	@Given("^Open the Browser and come to google$")
	public void open_the_Browser_and_come_to_google() throws Throwable {
		googleImpl gogleImpl = new googleImpl();
		gogleImpl.openGoogle();
	}

	@When("^Put my name into the search box$")
	public void put_my_name_into_the_search_box() throws Throwable {
		
		googleImpl gogleImpl = new googleImpl();
		gogleImpl.insertGooglePage();
	}

	@Then("^click on the search button$")
	public void click_on_the_search_button() throws Throwable {

		googleImpl gogleImpl = new googleImpl();
		gogleImpl.clickGooglePage();
	}

	@Then("^confirm my name in the heading$")
	public void confirm_my_name_in_the_heading() throws Throwable {
		
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
