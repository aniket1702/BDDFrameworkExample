package com.aniket.cucumberTesting.pages;

import org.openqa.selenium.By;

import com.aniket.cucumberTesting.enums.WaitStrategy;

public final class LoginPage extends BasePage{
	//private WebDriver driver;

	private By click_signIn = By.xpath("//a[contains(text(),'Sign in')]");
	private By emailId = By.xpath("//input[@id='email']");
	private By password = By.xpath("//input[@id='passwd']");
	private By click_LoginButton = By.xpath("//button[@id='SubmitLogin']");

	
	
	/*
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
*/
	public void clickOnSignIn() {
		//driver.findElement(click_signIn).click();
		clickButton(click_signIn, WaitStrategy.CLICKABLE, "Sign In");
	}

	public String getLoginPageTitle() {
		//return driver.getTitle();
		return getPageTitle();
	}

	public void enter_Email(String username) {
		//driver.findElement(emailId).sendKeys(username);
		sendKeys(emailId, username, WaitStrategy.PRESENCE, "Username");
	}

	public void enter_pswd(String psswd) {

		//driver.findElement(password).sendKeys(psswd);
		sendKeys(password, psswd, WaitStrategy.PRESENCE, "Password");
	}

	public AccountPage click_Login_Button() {
		//driver.findElement(click_LoginButton).click();
		clickButton(click_LoginButton, WaitStrategy.CLICKABLE, "Sign In");
		return new AccountPage();
	}

	/*
	 * public AccountPage doLogin(String usn, String psd) {
	 * driver.findElement(emailId).sendKeys(usn);
	 * driver.findElement(password).sendKeys(psd);
	 * driver.findElement(click_LoginButton).click();
	 * 
	 * return new AccountPage(driver); }
	 */

}
