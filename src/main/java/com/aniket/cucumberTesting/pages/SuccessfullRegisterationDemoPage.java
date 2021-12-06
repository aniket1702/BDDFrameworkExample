/**
 * 
 */
package com.aniket.cucumberTesting.pages;

import org.openqa.selenium.By;

import com.aniket.cucumberTesting.enums.WaitStrategy;

/**
 * 04-Dec-2021 
 * @author ANIKET
 * @version 1.0
 */
public class SuccessfullRegisterationDemoPage extends BasePage {
	
	private static  By  txt_SuccessfullMessage=By.xpath("//div[contains(text(),'Your registration completed')]");
	
	public void getSuccessfullMessage(String successfullMessage) {
		getTextFromElement(txt_SuccessfullMessage, WaitStrategy.PRESENCE, successfullMessage);
	}

}
