/**
 * 
 */
package com.aniket.cucumberTesting.stepDefinitions;

import org.junit.Assert;

import com.aniket.cucumberTesting.driver.DriverManager;
import com.aniket.cucumberTesting.enums.ConfigProperties;
import com.aniket.cucumberTesting.pages.SuccessfullRegisterationDemoPage;
import com.aniket.cucumberTesting.pages.TricentisDemoWebPageRegisterPage;
import com.aniket.cucumberTesting.qa.util.ConfigReader;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * 03-Dec-2021
 * 
 * @author ANIKET
 * @version 1.0
 */
public class TricentisDemoWebPageRegisterationSteps {

	 TricentisDemoWebPageRegisterPage tricentisDemoWebPageRegisterPage=new TricentisDemoWebPageRegisterPage();
	 SuccessfullRegisterationDemoPage successfullRegisterationDemoPage=new SuccessfullRegisterationDemoPage();
	private String actualTitle = "";

	@Given("user is on Home page")
	public void user_is_on_Home_page() {
		System.out.println("Opening Browser...");
	}

	@When("user enters URL of the page")
	public void user_enters_URL_of_the_page() {
		try {
			DriverManager.getDriver().get(ConfigReader.get(ConfigProperties.URL));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		actualTitle = tricentisDemoWebPageRegisterPage.getTitle();
	}

	@And("title of the page should be {string}")
	public void title_of_the_page_should_be(String expectedtitle) {
		Assert.assertTrue(expectedtitle.equals(actualTitle));
		
	}

	@Given("user is on Registeration Page")
	public void user_is_on_Registeration_Page() {
		System.out.println("Redirecting to Registeration Page");
	}

	@When("user clicks on register link")
	public void user_clicks_on_register_link() {
		tricentisDemoWebPageRegisterPage.clickRegisterLink();
	}

	@And("user enters {string} and {string} and {string} and {string} and  {string} and {string}")
	public void user_enters_details(String gender ,String firstname, String lastname, String email, String password,
			String confirmPassword) {
			tricentisDemoWebPageRegisterPage.enterDetails(gender, firstname, lastname, email, password, confirmPassword);
	}

	@And("user clicks on Register button")
	public void user_clicks_on_Register_button() {
		tricentisDemoWebPageRegisterPage.clickRegisterButton();

	}

	@Then("user gets registered successfully message info {string}")
	public void user_gets_registered_successfully_message_info(String successfullMessage) {
			successfullRegisterationDemoPage.getSuccessfullMessage(successfullMessage);
			Assert.assertTrue(successfullMessage.equals("Your registration completed"));
	}

}
