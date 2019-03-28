package com.jenkins.test.steps;

import com.jenkins.test.impl.CGIImpl;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CGISteps {


	CGIImpl impl = new CGIImpl();
	
	@Given("^Open cgi main page$")
	public void open_cgi_main_page() throws Throwable {
		impl.openCGI();
	}

	@When("^Click on the contact link$")
	public void click_on_the_contact_link() throws Throwable {
		impl.clickContactLink();
	}

	@Then("^Verify contact text$")
	public void verify_contact_text() throws Throwable {
		impl.getHeaderText();
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

}
