package com.aniket.cucumberTesting.pages;

import java.util.List;

import org.openqa.selenium.By;

import com.aniket.cucumberTesting.enums.WaitStrategy;

public class AccountPage extends BasePage{
	
	private By get_sectionList=By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]//ul/li");
	
	/*
	 * public AccountPage(WebDriver driver) { this.driver=driver; }
	 */
	
	
	public String getAccountsPageTitle() {
		//return driver.getTitle();
		return getPageTitle();
	}
	
	public List<String> getAccountSectionList() {
		List<String>  accountSectionList=sendListKeys(get_sectionList, WaitStrategy.PRESENCE, "Account Section list");;
		return accountSectionList;
	
	}

	public int getAccountSectionCount() {
		return getCount(WaitStrategy.NONE, get_sectionList);
	}
}
