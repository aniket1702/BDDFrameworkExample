/**
 * 
 */
package com.aniket.cucumberTesting.pages;



import java.util.List;

import org.openqa.selenium.By;

import com.aniket.cucumberTesting.enums.WaitStrategy;

/**
 * 05-Dec-2021 
 * @author ANIKET
 * @version 1.0
 */
public class TricentisDemoWebPageNavbarListPage extends BasePage{
	
	private static By navList=By.xpath("//body/div[4]/div[1]/div[2]");
	private static By navListElements=By.xpath("//body/div[4]/div[1]/div[2]/ul[1]/li");
	
	public  void getNavList() {
		getTextFromElement(navList, WaitStrategy.PRESENCE, "NavBar");
	}

	
	public List<String> getNavbarElements() {
		
		List<String> navbarElements=sendListKeys(navListElements, WaitStrategy.PRESENCE, "Navbar  Section List");
		
		return navbarElements;
		
	}
	
	public int getNavbarElementCount() {
		return getCount(WaitStrategy.NONE, navListElements );
	}
}
