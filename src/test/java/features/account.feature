#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Register

	Scenario: Login to system 
	  Given I get login page url 
	  And I click here link
	  And I input to email textbox with data "autorandom"
	  And I click to submit button at register page
	  Then I get the userId infor
	  And I get the password infor
		And I open login page again

	Scenario: Login to system 
	  When I input username textbox
	  And I input password textbox
	  And Click to login button
	  Then Verify homepage displayed with message "Welcome To Manager's Page of Guru99 Bank"


	Scenario Outline: Create new Customer
	  Given I open New Customer page
	  When I input to New Customer form with data
	  |Name			|Gender  |DateOfBirth   |Address	 |City	|State	|Pin		|Phone	|Email	 |Password  |
	  |<Name>		|<Gender>|<DateOfBirth> |<Address> |<City>|<State>|<Pin> 	|<Phone>|<Email> |<Password>|
	  And I click submit button at new customer page
	  Then I verify message displayed with message "Customer Registered Successfully!!!" 
	  And I verify all above information created successfully
	  |Name			|Gender 	|DateOfBirth   |Address	 |City	|State	|Pin		|Phone	|Email	 |
	  |<Name>		|male     |<DateOfBirth> |<Address>|<City>|<State>|<Pin> 	|<Phone>|<Email> |
	  When I get CustomerID at New Customer page
	  
	  Examples: data table for new customer
	  |Name			|Gender |DateOfBirth|Address			|City	|State	|Pin		|Phone		 |Email			 |Password|
	  |Auto test|m			|07/22/1992 |123 TranCung |Hanoi|Tu Liem|123456 |0987654321|bluenemo92 |123123|
	  

	Scenario Outline: Edit Customer

	  Given I open Edit Customer page
	  When I input CustomerID to Edit customer page
	  And I click to Submit button at Edit Customer page
	  And I input to Edit Customer form with data
	  |Address					|City		|State	|Pin		|Phone	|Email	|
	  |<Address> 				|<City>	|<State>|<Pin> 	|<Phone>|<Email>|
	  And I click submit button at edit customer page
	  Then I verify message displayed with message "Customer details updated Successfully!!!"
	  And I verify all above information created successfully
		|Address					|City		|State	|Pin		|Phone	|Email	|
	  |<Address> 				|<City>	|<State>|<Pin> 	|<Phone>|<Email>|
	  
	 Examples: Data for edit customer
	 |Address					 |City			|State				|Pin		|Phone		 |Email			 		|
	 |Edit123 TranCung |Edit Hanoi|Edit Tu Liem	|111111 |0987654321|editbluenemo92|
  