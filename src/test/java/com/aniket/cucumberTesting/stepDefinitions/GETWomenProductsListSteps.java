package com.aniket.cucumberTesting.stepDefinitions;

import java.util.List;
import java.util.Map;

import com.aniket.cucumberTesting.pages.AccountPage;
import com.aniket.cucumberTesting.pages.LoginPage;
import com.aniket.cucumberTesting.pages.WomenProductPage;
import com.aniket.cucumberTesting.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GETWomenProductsListSteps {
	
	//private LoginPage loginPage=new LoginPage(DriverFactory.getDriver());
	private WomenProductPage womenProductPage=new WomenProductPage(DriverFactory.getDriver());
	

	
	
	
	@Then("user is on women category page")
	public void user_is_on_women_category_page() {
		womenProductPage.clickWomenCategory();
		
		
	}
	@When("user gets title of the pages")
	public void user_gets_title_of_the_page(){
		
		womenProductPage.getWomenPageTitle();
	}

	@Then("user gets list of women products")
	public void user_gets_list_of_women_products() {
		
		womenProductPage.getProductList();
	    
	}
}
