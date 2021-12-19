package com.aniket.cucumberTesting.appHooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aniket.cucumberTesting.driver.Driver;
import com.aniket.cucumberTesting.driver.DriverManager;
import com.aniket.cucumberTesting.enums.ConfigProperties;
import com.aniket.cucumberTesting.qa.util.ConfigReader;
import com.aniket.cucumberTesting.reports.ExtentReport;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;



public class ApplicationHooks {

	
	@Before(order = 0)
	public void initExtentReport() {
		try {
			ExtentReport.initReport();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Before(order = 1)
	public void launchBrowser() {
		String browserName;
		try {
			
			browserName = ConfigReader.get(ConfigProperties.BROWSER);
			Driver.initDriver(browserName);
		} catch (Exception e1) {

			e1.printStackTrace();

		}
	}
	
	

	@After(order = 0)
	public void quitBrowser() {
		
		Driver.quitDriver();
	}

	@After(order = 1)
	public void tearDown(Scenario scenario) {

		if (scenario.isFailed()) {
			String screenshotname = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotname);
		}
	}
	
	

	

}
