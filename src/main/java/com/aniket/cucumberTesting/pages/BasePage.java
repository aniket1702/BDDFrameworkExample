	/**
 * 
 */
package com.aniket.cucumberTesting.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aniket.cucumberTesting.driver.DriverManager;
import com.aniket.cucumberTesting.enums.WaitStrategy;
import com.aniket.cucumberTesting.qa.factory.ExplicitWaitFactory;


/**
 * 02-Dec-2021 
 * @author ANIKET
 * @version 1.0
 */
public class BasePage {
	
	

	protected void sendKeys(By by,String value,WaitStrategy waitStrategy,String elementName ) {
		WebElement element=ExplicitWaitFactory.performExplicitStaticWait(waitStrategy, by);
		element.sendKeys(value);
		System.out.println(value+ " is passed to parameter/Element. " + elementName);
	}
	
	
	
	
	protected void clickButton(By by, WaitStrategy waitStrategy, String elementName) {
		WebElement element=ExplicitWaitFactory.performExplicitStaticWait(waitStrategy, by);
		element.click();
		
		System.out.println(elementName+ " is Clicked.");
	}
	
	
	protected String getPageTitle() {
		return DriverManager.getDriver().getTitle();
	}
	
	protected void getTextFromElement(By by, WaitStrategy waitStrategy, String elementName) {
		WebElement element=ExplicitWaitFactory.performExplicitStaticWait(waitStrategy, by);
		element.getText();
		System.out.println(elementName + " is Present.");
	}
	/**
	 * 
	 * @param by
	 * @param waitStrategy
	 * @param elementName
	 * @return List of WebElements from Web Page
	 */
	protected List<String> sendListKeys(By by,WaitStrategy waitStrategy,String elementName ) {
		List<String> list=new ArrayList<>();
		List<WebElement> elements=ExplicitWaitFactory.performExplicitStaticWaitOnListOfElements(waitStrategy, by);
		
		for(WebElement e:elements) {
			String sectionList=e.getText();
			System.out.println(" "+sectionList);
			list.add(sectionList);
		}
		
		return list;
	}
	
	protected int getCount(WaitStrategy waitStrategy, By by) {
		List<WebElement> elements=ExplicitWaitFactory.performExplicitStaticWaitOnListOfElements(waitStrategy, by);
		return elements.size();
	}
}
