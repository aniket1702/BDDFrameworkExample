$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/appFeatures/tricentis_list_of_navlinks.feature");
formatter.feature({
  "name": "Get NAVBAR Elements.",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@UnitTest"
    }
  ]
});
formatter.background({
  "name": "User should open the Demo Web Shop URL.",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.aniket.cucumberTesting.stepDefinitions.TricentisDemoWebPageRegisterationSteps.user_is_on_Home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters URL of the page",
  "keyword": "When "
});
formatter.match({
  "location": "com.aniket.cucumberTesting.stepDefinitions.TricentisDemoWebPageRegisterationSteps.user_enters_URL_of_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets the title of the page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.aniket.cucumberTesting.stepDefinitions.TricentisDemoWebPageRegisterationSteps.user_gets_the_title_of_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "title of the page should be \"Demo Web Shop\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.aniket.cucumberTesting.stepDefinitions.TricentisDemoWebPageRegisterationSteps.title_of_the_page_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify List of Navbar elements are present on Home Page.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@UnitTest"
    },
    {
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "name": "Navbar element is present",
  "keyword": "Given "
});
formatter.match({
  "location": "com.aniket.cucumberTesting.stepDefinitions.TricentisDemoWebPageNavbarElements.navbar_element_is_present()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets Navbar section",
  "rows": [
    {},
    {},
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "com.aniket.cucumberTesting.stepDefinitions.TricentisDemoWebPageNavbarElements.user_gets_Navbar_section(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "counts of Navbar elements should be 7",
  "keyword": "Then "
});
formatter.match({
  "location": "com.aniket.cucumberTesting.stepDefinitions.TricentisDemoWebPageNavbarElements.counts_of_Navbar_elements_should_be(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/appFeatures/tricentis_register_page_feature.feature");
formatter.feature({
  "name": "Verify Tricentis Demo Web Shop Register Page Feature.",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.background({
  "name": "User should open the Demo Web Shop URL.",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.aniket.cucumberTesting.stepDefinitions.TricentisDemoWebPageRegisterationSteps.user_is_on_Home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters URL of the page",
  "keyword": "When "
});
formatter.match({
  "location": "com.aniket.cucumberTesting.stepDefinitions.TricentisDemoWebPageRegisterationSteps.user_enters_URL_of_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets the title of the page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.aniket.cucumberTesting.stepDefinitions.TricentisDemoWebPageRegisterationSteps.user_gets_the_title_of_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "title of the page should be \"Demo Web Shop\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.aniket.cucumberTesting.stepDefinitions.TricentisDemoWebPageRegisterationSteps.title_of_the_page_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to click on register link and should redirects to Registration Page.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    },
    {
      "name": "@Test2"
    }
  ]
});
formatter.step({
  "name": "user is on Registeration Page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.aniket.cucumberTesting.stepDefinitions.TricentisDemoWebPageRegisterationSteps.user_is_on_Registeration_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on register link",
  "keyword": "When "
});
formatter.match({
  "location": "com.aniket.cucumberTesting.stepDefinitions.TricentisDemoWebPageRegisterationSteps.user_clicks_on_register_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets the title of the page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.aniket.cucumberTesting.stepDefinitions.TricentisDemoWebPageRegisterationSteps.user_gets_the_title_of_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "title of the page should be \"Demo Web Shop. Register\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.aniket.cucumberTesting.stepDefinitions.TricentisDemoWebPageRegisterationSteps.title_of_the_page_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});