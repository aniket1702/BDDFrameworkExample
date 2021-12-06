/**
 * 
 */
package com.aniket.cucumberTesting.qa.util;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aniket.cucumberTesting.driver.DriverManager;

/**
 * 05-Dec-2021
 * 
 * @author ANIKET
 * @version 1.0
 */
public final class ScreenshotUtils {
	private ScreenshotUtils() {

	}
	
	public static String getBase64Image() {
		return ((TakesScreenshot)DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);
	}
}
