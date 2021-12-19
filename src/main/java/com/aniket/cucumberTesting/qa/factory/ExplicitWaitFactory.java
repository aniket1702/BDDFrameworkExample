/**
 * 
 */
package com.aniket.cucumberTesting.qa.factory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aniket.cucumberTesting.driver.DriverManager;
import com.aniket.cucumberTesting.enums.WaitStrategy;
import com.aniket.cucumberTesting.frameworkconstant.FrameworkConstant;

/**
 * 02-Dec-2021
 * 
 * @author ANIKET
 * @version 1.0
 */
public final class ExplicitWaitFactory {

	private ExplicitWaitFactory() {

	}

	public static WebElement performExplicitStaticWait(WaitStrategy waitStrategy, By by) {
		WebElement element = null;

		if (waitStrategy == WaitStrategy.CLICKABLE) {
			element = new WebDriverWait(DriverManager.getDriver(), FrameworkConstant.getExplicitwait())
					.until(ExpectedConditions.elementToBeClickable(by));
		}
		else if(waitStrategy == WaitStrategy.PRESENCE) {
			element = new WebDriverWait(DriverManager.getDriver(), FrameworkConstant.getExplicitwait())
					.until(ExpectedConditions.presenceOfElementLocated(by));
		}
		else if(waitStrategy == WaitStrategy.VISIBLE) {
			element = new WebDriverWait(DriverManager.getDriver(), FrameworkConstant.getExplicitwait())
					.until(ExpectedConditions.visibilityOfElementLocated(by));
		}
		else if(waitStrategy==WaitStrategy.NONE) {
			element=DriverManager.getDriver().findElement(by);
		}
		
		return element;
	}
	


	@SuppressWarnings("unchecked")
	public static List<WebElement> performExplicitStaticWaitOnListOfElements(WaitStrategy waitStrategy, By by) {
		List<WebElement> elements=null;
		if (waitStrategy == WaitStrategy.CLICKABLE) {
			elements = (List<WebElement>) new WebDriverWait(DriverManager.getDriver(), FrameworkConstant.getExplicitwait())
					.until(ExpectedConditions.elementToBeClickable(by));
		}
		else if(waitStrategy == WaitStrategy.PRESENCE) {
			elements = new WebDriverWait(DriverManager.getDriver(), FrameworkConstant.getExplicitwait())
					.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
		}
		else if(waitStrategy == WaitStrategy.VISIBLE) {
			elements = new WebDriverWait(DriverManager.getDriver(), FrameworkConstant.getExplicitwait())
					.until(ExpectedConditions.visibilityOfAllElements(elements));
		}
		else if(waitStrategy==WaitStrategy.NONE) {
			elements=DriverManager.getDriver().findElements(by);
		}
		
		return elements;
	}
}
