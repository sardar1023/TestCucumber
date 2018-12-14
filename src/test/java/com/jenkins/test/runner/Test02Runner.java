package com.jenkins.test.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber-html-report",
				"json:target/cucumber-reports/Cucumber.json"},
		features= {"src/test/resources/feature/"},
		glue = {"com.jenkins.test"},
		tags = {"@test"},
		dryRun = false
		)
public class Test02Runner {

}
