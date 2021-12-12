@UnitTest
Feature: Get NAVBAR Elements.

  Background: User should open the Demo Web Shop URL.
    Given user is on Home page
    When user enters URL of the page
    Then user gets the title of the page
    And title of the page should be "Demo Web Shop"

  @Test1
  Scenario: Verify List of Navbar elements are present on Home Page.
    Given Navbar element is present
    When user gets Navbar section
      | BOOKS             |
      | COMPUTERS         |
      | ELECTRONICS       |
      | APPAREL & SHOES   |
      | DIGITAL DOWNLOADS |
      | JEWELRY           |
      | GIFT CARDS        |
    Then counts of Navbar elements should be 7
