/**
 * 
 */
package com.aniket.cucumberTesting.listener;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

import com.aniket.cucumbetTesting.annotations.CucumberFrameworkAnnotations;
import com.aniket.cucumbetTesting.reports.ExtentLogger;
import com.aniket.cucumbetTesting.reports.ExtentReport;

/**
 * 06-Dec-2021
 * 
 * @author ANIKET
 * @version 1.0
 */
public class ExtentReportListener extends RunListener {

	public void testRunStarted(Description description) throws java.lang.Exception {
		ExtentReport.initReport();
	}

	/**
	 * Called when all tests have finished
	 */
	public void testRunFinished(Result result) throws java.lang.Exception {
		ExtentReport.flushReport();
	}

	/**
	 * Called when an atomic test is about to be started.
	 */
	public void testStarted(Description description) throws java.lang.Exception {
		ExtentReport.createTest(description.getMethodName());
		ExtentReport.addAuthors(description.getAnnotation(CucumberFrameworkAnnotations.class).author());
		ExtentReport.addCategories(description.getAnnotation(CucumberFrameworkAnnotations.class).category());
	}

	/**
	 * Called when an atomic test has finished, whether the test succeeds or fails.
	 */
	public void testFinished(Description description) throws java.lang.Exception {
		ExtentLogger.pass(description.getMethodName()+ " is Passed.");
	}

	/**
	 * Called when an atomic test fails.
	 */
	public void testFailure(Failure failure) throws java.lang.Exception {
		ExtentLogger.fail(failure.getDescription()+ "is Failed.", true);
		ExtentLogger.fail(failure.getTrace().toString());
	}

	/**
	 * Called when a test will not be run, generally because a test method is
	 * annotated with Ignore.
	 */
	public void testIgnored(Description description) throws java.lang.Exception {
		System.out.println("Execution of test case ignored : " + description.getMethodName());
	}
}
