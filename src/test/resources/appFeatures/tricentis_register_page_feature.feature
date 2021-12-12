@UnitTest
Feature: Verify Tricentis Demo Web Shop Register Page Feature.

  Background: User should open the Demo Web Shop URL.
    Given user is on Home page
     When user enters URL of the page
     Then user gets the title of the page
      And title of the page should be "Demo Web Shop"

  @Test1
  Scenario: User should be able to click on register link and should redirects to Registration Page.
    Given user is on Registeration Page
     When user clicks on register link
     Then user gets the title of the page
      And title of the page should be "Demo Web Shop. Register"
#
  #@Regression
  #Scenario Outline: User should able to register on the website with given Examples.
    #Given user is on Registeration Page
     #When user clicks on register link
     #And user enters "<Gender>" and "<FirstName>" and "<LastName>" and "<Email>" and  "<Password>" and "<ConfirmPassword>"
      #And user clicks on Register button
     #Then user gets registered successfully message info "Your registration completed"
#
    #Examples: 
      #| Gender | FirstName | LastName | Email                      | Password    | ConfirmPassword |
      #| Male   | Aniket    | Maurya   | aniketmaurya18345@gmail.com | website12365@123 | website12365@123     |
      #| Female | Julie     | Jackson  | jjuie124354@gmail.com           | pswdd222@123    | pswdd222@123        |