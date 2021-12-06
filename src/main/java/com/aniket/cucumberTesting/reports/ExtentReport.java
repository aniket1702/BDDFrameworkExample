/**
 * 
 */

package com.aniket.cucumberTesting.reports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

import com.aniket.cucumberTesting.enums.CategoryTypes;
import com.aniket.cucumberTesting.frameworkconstant.FrameworkConstant;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


/**
 * 05-Dec-2021
 * 
 * @author ANIKET
 * @version 1.0
 */
public final class ExtentReport {

	private ExtentReport() {
	}

	private static ExtentReports extent;

	public static void initReport() throws Exception {
		if (Objects.isNull(extent)) {
			extent = new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter(FrameworkConstant.getExtentReportFilePath());
			extent.attachReporter(spark);
			spark.config().setTheme(Theme.STANDARD);
			spark.config().setDocumentTitle("Selenium Testing Framework");
			spark.config().setReportName("Selenium Testing Framework");
		}
	}

	public static void createTest(String testcasename) {

		ExtentReportManager.setExtentTest(extent.createTest(testcasename));
	}

	public static void flushReport() throws Exception {
		if (Objects.nonNull(extent)) {
			extent.flush();
		}
		ExtentReportManager.unload();
		try {
			Desktop.getDesktop().browse(new File(FrameworkConstant.getExtentReportFilePath()).toURI());
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
	
	
	// Adding Authors and categories to Extent Report
	public static void addAuthors(String[] authors) {
		for (String temp : authors) {
			ExtentReportManager.getExtentTest().assignAuthor(temp);
		}
	}

	public static void addCategories(CategoryTypes[] categories) {
		for (CategoryTypes temp : categories) {
			ExtentReportManager.getExtentTest().assignCategory(temp.toString());
		}
	}

}
