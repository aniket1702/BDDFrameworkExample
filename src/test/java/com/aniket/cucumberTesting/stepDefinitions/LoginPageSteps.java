package com.aniket.cucumberTesting.stepDefinitions;

import org.testng.Assert;

import com.aniket.cucumberTesting.pages.LoginPage;
import com.aniket.cucumberTesting.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	
	public static String title;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	
	@Given("user is on Home Page")
	public void user_is_on_Home_Page() {
		DriverFactory.getDriver().get("http://automationpractice.com/index.php");
	}

	@When("user gets title of the page")
	public void user_gets_title_of_the_page() {
		title = loginPage.getLoginPageTitle();
		System.out.println("Page title is: " + title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitle) {
		Assert.assertTrue(title.contains(expectedTitle));
	}

	@Given("user is on Login Page")
	public void user_is_on_Login_Page() {
		loginPage.clickOnSignIn();
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String username) {
		loginPage.enter_Email(username);
	}

	@And("user enters password as {string}")
	public void user_enters_password_as(String pswd) {
		loginPage.enter_pswd(pswd);
	}

	@And("user clicks on Login button")
	public void user_clicks_on_Login_button() {
		loginPage.click_Login_Button();
	}

}