/**
 * 
 */
package com.aniket.cucumberTesting.driver;

import java.util.Objects;

import com.aniket.cucumberTesting.enums.ConfigProperties;
import com.aniket.cucumberTesting.qa.factory.DriverFactory;
import com.aniket.cucumberTesting.qa.util.ConfigReader;




/**
 * 15-Nov-2021 
 * @author ANIKET
 * @version 1.0
 */
public final class Driver {
	
	private Driver() {}
	
	
	public static void initDriver(String browser) throws Exception {

		if (Objects.isNull(DriverManager.getDriver())) {

			DriverManager.setDriver(DriverFactory.getDriver(browser));

			DriverManager.getDriver().get(ConfigReader.get(ConfigProperties.URL));

			DriverManager.getDriver().manage().window().maximize();

		}
	}
	
	public static void quitDriver() {
		if (Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().manage().deleteAllCookies();
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}

}
