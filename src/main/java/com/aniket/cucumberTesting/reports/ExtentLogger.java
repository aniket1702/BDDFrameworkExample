/**
 * 
 */

package com.aniket.cucumberTesting.reports;

import java.io.IOException;

import com.aniket.cucumberTesting.enums.ConfigProperties;
import com.aniket.cucumberTesting.qa.util.ConfigReader;
import com.aniket.cucumberTesting.qa.util.ScreenshotUtils;
import com.aventstack.extentreports.MediaEntityBuilder;

/**
 * 05-Dec-2021
 * 
 * @author ANIKET
 * @version 1.0
 */
public final class ExtentLogger {
	private ExtentLogger() {

	}

	public static void pass(String message) {
		ExtentReportManager.getExtentTest().pass(message);
	}

	public static void fail(String message) {
		ExtentReportManager.getExtentTest().fail(message);
	}

	public static void skip(String message) {
		ExtentReportManager.getExtentTest().skip(message);
	}

	public static void pass(String message, boolean isScreenshotNeeded) {
		try {
			if (ConfigReader.get(ConfigProperties.PASSEDSCREENSHOTS).equalsIgnoreCase("yes") && isScreenshotNeeded) {
				ExtentReportManager.getExtentTest().pass(message, MediaEntityBuilder
						.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
			} else {
				pass(message);
			}
		} catch (IOException e) {

			e.printStackTrace();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void fail(String message, boolean isScreenshotNeeded) {
		try {
			if (ConfigReader.get(ConfigProperties.FAILEDSCREENSHOTS).equalsIgnoreCase("yes") && isScreenshotNeeded) {
				ExtentReportManager.getExtentTest().fail(message, MediaEntityBuilder
						.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
			} else {
				fail(message);
			}
		} catch (IOException e) {

			e.printStackTrace();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void skip(String message, boolean isScreenshotNeeded) {
		try {
			if (ConfigReader.get(ConfigProperties.SKIPPEDSCREENSHOTS).equalsIgnoreCase("yes") && isScreenshotNeeded) {
				ExtentReportManager.getExtentTest().skip(message, MediaEntityBuilder
						.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
			} else {
				skip(message);
			}
		} catch (IOException e) {

			e.printStackTrace();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
