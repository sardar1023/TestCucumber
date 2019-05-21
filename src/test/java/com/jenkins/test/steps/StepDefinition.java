package com.jenkins.test.steps;

import com.jenkins.test.impl.CGIImpl;
import com.jenkins.test.impl.googleImpl;
import com.jenkins.test.impl.wikiImpl;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	CGIImpl impl = new CGIImpl();
	googleImpl gogleImpl = new googleImpl();
	wikiImpl wkiImpl = new wikiImpl();
	@Given("^Open the Browser and come to google$")
	public void open_the_Browser_and_come_to_google() throws Throwable {
		gogleImpl.openGoogle();
	}

	@When("^Put my name into the search box$")
	public void put_my_name_into_the_search_box() throws Throwable {
		gogleImpl.insertGooglePage();
	}

	@Then("^click on the search button$")
	public void click_on_the_search_button() throws Throwable {
		gogleImpl.clickGooglePage();
	}

	@Then("^confirm my name in the heading$")
	public void confirm_my_name_in_the_heading() throws Throwable {
		
		wkiImpl = new wikiImpl();
		wkiImpl.clickWikiContent();
		wkiImpl.verifyTheHeading();
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		Thread.sleep(2000);
		gogleImpl.closeBrowser();
	}

	@Before
	public void init(Scenario scenario){
		Common.scenarioList.set(scenario);
	}

	@After
	public void artifact(Scenario scenario){
		if(scenario.isFailed()){
			try{
				scenario.embed(impl.getScreenShot(),"image/png");
				System.out.println(Common.getScenarioName());
				System.out.println(Common.getScenarioUniqueId());

			} catch(Exception e){
				e.getMessage();
			}
		}
	}


	@When("^User enter \"([^\"]*)\" into search field$")
	public void userEnterIntoSearchField(String name)  {
		gogleImpl.inserToField(name);
	}

	@And("^click on the link \"([^\"]*)\"$")
	public void clickOnTheLink(String linkText){
		gogleImpl.clickOnLinkWithText(linkText);
	}

	@Then("^User confirm the Ruby Header$")
	public void confirmRubyHeader()  {
		wkiImpl.rubyHeader();

	}
}
