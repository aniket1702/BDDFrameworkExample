package com.aniket.cucumberTesting.testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/appFeatures" }, glue = { "com.aniket.cucumberTesting.stepDefinitions",
		"com.aniket.cucumberTesting.appHooks" }, plugin = { "pretty", "html:test-output/",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, 
	
		dryRun = false, 
		monochrome = false

)

public class MyTestRunners {

}
