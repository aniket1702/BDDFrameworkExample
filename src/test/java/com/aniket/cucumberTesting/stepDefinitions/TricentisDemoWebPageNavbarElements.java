/**
 * 
 */
package com.aniket.cucumberTesting.stepDefinitions;

import java.util.List;

import org.junit.Assert;

import com.aniket.cucumberTesting.annotations.CucumberFrameworkAnnotations;
import com.aniket.cucumberTesting.enums.CategoryTypes;
import com.aniket.cucumberTesting.pages.TricentisDemoWebPageNavbarListPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * 05-Dec-2021
 * 
 * @author ANIKET
 * @version 1.0
 */

public class TricentisDemoWebPageNavbarElements {


	TricentisDemoWebPageNavbarListPage tricentisNavbarElementsList = new TricentisDemoWebPageNavbarListPage();

	@CucumberFrameworkAnnotations(author = { "John", "Johhny" }, category = { CategoryTypes.MINIREGRESSION,
			CategoryTypes.SMOKE })
	@Given("Navbar element is present")
	public void navbar_element_is_present() {
		System.out.println("Loading Navbae element");
	}

	@When("user gets Navbar section")
	public void user_gets_Navbar_section(DataTable navElements) {
		List<String> expectedNavbarElement = navElements.asList();

		System.out.println("Expected List count are:" + expectedNavbarElement);

		List<String> actualNavbarElementList = tricentisNavbarElementsList.getNavbarElements();

		System.out.println("Actual List count are:" + actualNavbarElementList);

		Assert.assertTrue(expectedNavbarElement.containsAll(actualNavbarElementList));

	}

	@Then("counts of Navbar elements should be {int}")
	public void counts_of_Navbar_elements_should_be(Integer expectedCount) {
		Assert.assertTrue(tricentisNavbarElementsList.getNavbarElementCount() == expectedCount);
	}

}
