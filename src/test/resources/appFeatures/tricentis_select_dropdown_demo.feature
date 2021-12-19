@SmokeTest
Feature: Verify Tricentis Demo Web Shop dropdown Menu.

  Background: User should open the Demo Web Shop URL.
    Given user is on Home page
     When user enters URL of the page
     Then user gets the title of the page
      And title of the page should be "Demo Web Shop"