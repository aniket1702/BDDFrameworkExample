Feature: Get Women Product List from Women Categories.

  Background: 
    Given user has already logged in to an application
      | username                  | password       |
      | tyitproject2019@gmail.com | Selenium@12345 |
      
    Then user is on women category page

  Scenario: User should be on Women category Page.
     When user gets title of the page
     Then page title should be "Women - My Store"

  Scenario: User can see list of women products.
     Then user gets list of women products