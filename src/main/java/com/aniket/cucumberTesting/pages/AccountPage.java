package com.aniket.cucumberTesting.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {
	
	private  WebDriver driver;
	private By get_sectionList=By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]//ul/li");
	
	
	public AccountPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public String getAccountsPageTitle() {
		return driver.getTitle();
	}
	
	public List<String> getAccountSectionList() {
		List<String> accountList=new ArrayList<>();
		List<WebElement> accountHeaderList=driver.findElements(get_sectionList);
		
		for(WebElement e:accountHeaderList) {
			String accList=e.getText();
			System.out.println(" "+accList);
			accountList.add(accList);
		}
		return accountList;
	}

	public int getCount() {
		return driver.findElements(get_sectionList).size();
	}
}
