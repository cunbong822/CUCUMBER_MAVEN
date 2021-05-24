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
@account
Feature: Register
@register
	Scenario: Login to system 
	  Given I get login page url 
	  And I click here link
	  And I input to email textbox with data "autorandom"
	  And I click to submit button at register page
	  Then I get the userId infor
	  And I get the password infor
		And I open login page again
@login
	Scenario: Login to system 
	  When I input username textbox
	  And I input password textbox
	  And Click to login button
	  Then Verify homepage displayed with message "Welcome To Manager's Page of Guru99 Bank"

@new_customer
	Scenario Outline: Create new Customer
	  Given I open "New Customer" page
	  When I input to "name" textbox with data "<Name>"
	  And I select "<Gender>" radio button
	  And I input to "dob" textbox with data "<DateOfBirth>"
	  And I input to "addr" textbox with data "<Address>"
	  And I input to "city" textbox with data "<City>"
	  And I input to "state" textbox with data "<State>"
	  And I input to "pinno" textbox with data "<Pin>"
	  And I input to "telephoneno" textbox with data "<Phone>"
	  And I input to "emailid" textbox with "2" data "<Email>"
	  And I input to "password" textbox with data "<Password>"
	  And I click to "Submit" button
	  Then Verify message "Customer Registered Successfully!!!" display
	  And I verify all above information created successfully
	  |Name			|Gender 	|DateOfBirth   |Address	 |City	|State	|Pin		|Phone	|Email	 |
	  |<Name>		|male     |<DateOfBirth> |<Address>|<City>|<State>|<Pin> 	|<Phone>|<Email> |
	  When I get CustomerID at New Customer page
	  
	  Examples: data table for new customer
	  |Name			|Gender |DateOfBirth|Address			|City	|State	|Pin		|Phone		 |Email			 |Password|
	  |Auto test|m			|07/22/1992 |123 TranCung |Hanoi|Tu Liem|123456 |0987654321|bluenemo92 |123123|
	  
@edit_customer
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
  