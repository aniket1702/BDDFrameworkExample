package com.aniket.cucumberTesting.appHooks;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aniket.cucumberTesting.driver.Driver;
import com.aniket.cucumberTesting.driver.DriverManager;
import com.aniket.cucumberTesting.enums.ConfigProperties;
import com.aniket.cucumberTesting.frameworkconstant.FrameworkConstant;
import com.aniket.cucumberTesting.qa.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {

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

	@After(order = 2)
	public void getExtentReport() throws IOException, Exception {
		Desktop.getDesktop().browse(new File(FrameworkConstant.getExtentReportFilePath()).toURI());
	}

}
