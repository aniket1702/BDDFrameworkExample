/**
 * 
 */
package com.aniket.cucumberTesting.frameworkconstant;

import com.aniket.cucumberTesting.enums.ConfigProperties;
import com.aniket.cucumberTesting.qa.util.ConfigReader;

/**
 * 15-Nov-2021
 * 
 * @author ANIKET
 * @version 1.0
 */
public final class FrameworkConstant {

	private FrameworkConstant() {

	}
	
	private static final String BASEPATH = System.getProperty("user.dir");
	private static final String RESOURCESPATH = BASEPATH + "/src/test/resources/";
	private static final String CONFIGFILEPATH = RESOURCESPATH + "config/config.properties";
	private static final int EXPLICITWAIT = 10;
	private static final String EXTENTREPORTFOLDERPATH = BASEPATH + "/test-output/SparkReport/";
	private static String extentReportFilePath = "";

	public static String getResourcesPath() {
		return RESOURCESPATH;
	}

	public static String getConfigFilePath() {
		return CONFIGFILEPATH;
	}

	public static int getExplicitwait() {
		return EXPLICITWAIT;
	}

	public static String getExtentReportFolderPath() throws Exception {
	
			if (ConfigReader.get(ConfigProperties.OVERRIDEREPORTS).equalsIgnoreCase("no")) {
				return EXTENTREPORTFOLDERPATH + System.currentTimeMillis() + "/SparkReport.html";
			} else {
				return EXTENTREPORTFOLDERPATH + "SparkReport.html";
			}
	}

	public static String getExtentReportFilePath() throws Exception {
		if (extentReportFilePath.isEmpty()) {
			extentReportFilePath = getExtentReportFolderPath();
		}
		return extentReportFilePath;
	}

	

}
