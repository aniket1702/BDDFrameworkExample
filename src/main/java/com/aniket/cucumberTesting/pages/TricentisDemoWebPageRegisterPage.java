/**
 * 
 */
package com.aniket.cucumberTesting.pages;

import org.openqa.selenium.By;

import com.aniket.cucumberTesting.enums.WaitStrategy;

/**
 * 04-Dec-2021
 * 
 * @author ANIKET
 * @version 1.0
 */
public class TricentisDemoWebPageRegisterPage extends BasePage {

	private static By click_registerLink = By.xpath("//a[contains(text(),'Register')]");
	private static By gender_male = By.xpath("//input[@id='gender-male']");

	private static By gender_female = By.xpath("//input[@id='gender-female']");
	// private By select_radio_value=;
	private static By txt_firstname = By.xpath("//input[@id='FirstName']");
	private static By txt_lastname = By.xpath("//input[@id='LastName']");
	private static By txt_email = By.xpath("//input[@id='Email']");
	private static By txt_password = By.xpath("//input[@id='Password']");
	private static By txt_confirmPassword = By.xpath("//input[@id='ConfirmPassword']");
	private static By click_registerButton = By.xpath("//input[@id='register-button']");

	public String getTitle() {
		return getPageTitle();
	}

	public void clickRegisterLink() {
		clickButton(click_registerLink, WaitStrategy.CLICKABLE, "Register");
	}

	public void enterDetails(String gender, String firstname, String lastname, String email, String password,
			String confirmPassword) {

		if (gender.equals("Male")) {
			clickButton(gender_male, WaitStrategy.CLICKABLE, gender);

		} else {
			clickButton(gender_female, WaitStrategy.CLICKABLE, gender);

		}

		sendKeys(txt_firstname, firstname, WaitStrategy.VISIBLE, "First Name");
		sendKeys(txt_lastname, lastname, WaitStrategy.VISIBLE, "Last Name");
		sendKeys(txt_email, email, WaitStrategy.VISIBLE, "Email");
		sendKeys(txt_password, password, WaitStrategy.VISIBLE, "Password");
		sendKeys(txt_confirmPassword, confirmPassword, WaitStrategy.VISIBLE, "Confirm Password");

	}

	public SuccessfullRegisterationDemoPage clickRegisterButton() {
		clickButton(click_registerButton, WaitStrategy.CLICKABLE, "Register Button");

		return new SuccessfullRegisterationDemoPage();
	}
}
