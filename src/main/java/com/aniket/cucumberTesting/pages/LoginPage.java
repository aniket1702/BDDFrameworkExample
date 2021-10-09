package com.aniket.cucumberTesting.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private  WebDriver driver;

	private By click_signIn = By.xpath("//a[contains(text(),'Sign in')]");
	private By emailId = By.xpath("//input[@id='email']");
	private By password = By.xpath("//input[@id='passwd']");
	private By click_LoginButton = By.xpath("//button[@id='SubmitLogin']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnSignIn() {
		driver.findElement(click_signIn).click();
	}

	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public void enter_Email(String username) {
		driver.findElement(emailId).sendKeys(username);
	}

	public void enter_pswd(String psswd) {

		driver.findElement(password).sendKeys(psswd);
	}

	public void click_Login_Button() {
		driver.findElement(click_LoginButton).click();
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
