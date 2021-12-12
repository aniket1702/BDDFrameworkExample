/**
 * 
 */
package com.aniket.cucumberTesting.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;

/**
 * 15-Nov-2021
 * 
 * @author ANIKET
 * @version 1.0
 */
public final class DriverManager {

	private DriverManager() {
	}

	private static  ThreadLocal<WebDriver> dr = new ThreadLocal<>();
	

	public static WebDriver getDriver() {
		return dr.get();
	}

	
	
	static void setDriver(WebDriver driverref) {
		if (Objects.nonNull(driverref)) {
			dr.set(driverref);
		}

	}

	
	
	static void unload() {
		dr.remove();
	}

}
