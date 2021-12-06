$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/appFeatures/tricentis_list_of_navlinks.feature");
formatter.feature({
  "name": "Get NAVBAR Elements.",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@NavbarElementTest"
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
      "name": "@NavbarElementTest"
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
});