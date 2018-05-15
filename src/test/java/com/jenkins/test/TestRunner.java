package com.jenkins.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber-html-report"},
		features= {"src/test/resources/feature/test.feature"},
		glue = {"com.jenkins.test"},
		tags = {"@test"}
		)

public class TestRunner {

}
