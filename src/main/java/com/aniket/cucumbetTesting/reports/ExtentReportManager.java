/**
 * 
 */

package com.aniket.cucumbetTesting.reports;

import java.util.Objects;

import com.aventstack.extentreports.ExtentTest;

/**
 * 05-Dec-2021
 * 
 * @author ANIKET
 * @version 1.0
 */
public final class ExtentReportManager {

	private ExtentReportManager() {

	}

	private static ThreadLocal<ExtentTest> extTest = new ThreadLocal<>();

	static ExtentTest getExtentTest() {
		return extTest.get();
	}

	static void setExtentTest(ExtentTest extentTest) {
		if (Objects.nonNull(extentTest)) {
			extTest.set(extentTest);
		}

	}

	static void unload() {
		extTest.remove();
	}

}
