package com.aniket.cucumberTesting.stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.aniket.cucumberTesting.pages.AccountPage;
import com.aniket.cucumberTesting.pages.LoginPage;
import com.aniket.cucumberTesting.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AccountPageSteps {
	
	
	private LoginPage loginPage=new LoginPage(DriverFactory.getDriver());
	private AccountPage accountPage;
	
	@Given("user has already logged in to an application")
	public void user_has_already_logged_in_to_an_application(DataTable dataTable) {
	   List<Map<String,String>> cred= dataTable.asMaps();
	   String username=cred.get(0).get("username");
	   String password=cred.get(0).get("password");
	   
	   DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	   accountPage=loginPage.doLogin(username, password);
	   
	}

	@Given("user is on Accounts Page")
	public void user_is_on_Accounts_Page() {
	   accountPage.getAccountsPageTitle();
	}

	@Then("user gets accounts section")
	public void user_gets_accounts_section(DataTable sectionTable) {
		List<String> expAccountSectionList=sectionTable.asList();
		System.out.println("Expected List count are:" +expAccountSectionList);
		
		List<String> actualAccountSectionList=accountPage.getAccountSectionList();
		System.out.println("Actual List count are:" +actualAccountSectionList);
		
		
		Assert.assertTrue(expAccountSectionList.containsAll(actualAccountSectionList));
	   
	}

	@Then("accounts section count should be {int}")
	public void accounts_section_count_should_be(Integer expectedCount) {
	   Assert.assertTrue(accountPage.getCount()==expectedCount);
	}

}
