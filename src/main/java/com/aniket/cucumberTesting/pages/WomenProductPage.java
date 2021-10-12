package com.aniket.cucumberTesting.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WomenProductPage {
	
	private WebDriver driver;
	private By click_womenCategory=By.xpath("//a[contains(text(),'Women')]");
	private By get_productList=By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]//li//a[@class=\"product-name\"]");
	
	
	public WomenProductPage(WebDriver driver) {
		this.driver=driver;
	}

	public void clickWomenCategory() {
		driver.findElement(click_womenCategory).click();
	}
	
	
	public String getWomenPageTitle() {
		
		return driver.getTitle();
	}
	
	
	public void getProductList() {
		List<WebElement> womenProducts=driver.findElements(get_productList);
		for(WebElement webElements:womenProducts) {
			
			String listOfProducts=webElements.getText();
			System.out.println("List of Women Products are: "+ listOfProducts);
			
		}
	}

}
