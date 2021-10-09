Feature: Account Page Feature
Background: 
	Given user has already logged in to an application
	|username|password|
	|tyitproject2019@gmail.com|Selenium@12345|
	
	Scenario: Account Page Title
	Given user is on Accounts Page
	When user gets title of the page
	Then page title should be "My account - My Store"
	
	Scenario: Accounts section count
	Given user is on Accounts Page
	Then user gets accounts section
	|ORDER HISTORY AND DETAILS|
	|MY CREDIT SLIPS|
	|MY ADDRESSES|
	|MY PERSONAL INFORMATION|
	|MY WISHLISTS|
	And accounts section count should be 5


