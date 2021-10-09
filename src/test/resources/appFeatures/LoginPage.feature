Feature: Test Login Functionlity

  Background: 
    Given user is on Home Page
    When user gets title of the page
    Then page title should be "My Store"

  Scenario: Login Page
    Given user is on Login Page
    When user gets title of the page
    Then page title should be "Login - My Store"

  Scenario: Login with correct credentials
    Given user is on Login Page
    When user enters username as "tyitproject2019@gmail.com"
    And user enters password as "Selenium@12345"
    And user clicks on Login button
    Then user gets title of the page
    And page title should be "My account - My Store"
