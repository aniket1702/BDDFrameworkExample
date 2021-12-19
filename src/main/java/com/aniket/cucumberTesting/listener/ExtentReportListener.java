/**
 * 
 */
package com.aniket.cucumberTesting.listener;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

import com.aniket.cucumberTesting.annotations.CucumberFrameworkAnnotations;
import com.aniket.cucumberTesting.reports.ExtentLogger;
import com.aniket.cucumberTesting.reports.ExtentReport;

/**
 * 06-Dec-2021
 * 
 * @author ANIKET
 * @version 1.0
 */


public class ExtentReportListener extends RunListener {

	@Override
	public void testRunStarted(Description description) throws Exception {
		ExtentReport.initReport();
	}

	/**
	 * Called when all tests have finished
	 */
	@Override
	public void testRunFinished(Result result) throws Exception {
		ExtentReport.flushReport();
	}

	/**
	 * Called when an atomic test is about to be started.
	 */
	@Override
	public void testStarted(Description description) throws Exception {
		ExtentReport.createTest(description.getMethodName());
		ExtentReport.addAuthors(description.getAnnotation(CucumberFrameworkAnnotations.class).author());
		ExtentReport.addCategories(description.getAnnotation(CucumberFrameworkAnnotations.class).category());
	}

	/**
	 * Called when an atomic test has finished, whether the test succeeds or fails.
	 */
	@Override
	public void testFinished(Description description) throws Exception {
		ExtentLogger.pass(description.getMethodName()+ " is Passed.");
	}

	/**
	 * Called when an atomic test fails.
	 */
	@Override
	public void testFailure(Failure failure) throws Exception {
		ExtentLogger.fail(failure.getDescription()+ "is Failed.", true);
		ExtentLogger.fail(failure.getTrace());
	}

	/**
	 * Called when a test will not be run, generally because a test method is
	 * annotated with Ignore.
	 */
	@Override
	public void testIgnored(Description description) throws Exception {
		System.out.println("Execution of test case ignored : " + description.getMethodName());
	}
}
