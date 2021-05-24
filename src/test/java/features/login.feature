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
@login
Feature: Login
				As a PO i want login successfull

	Scenario: Login to system 
	  Given I open application
	  When I input username "mngr327147"
	  And I input password "dedAsag"
	  And Click to login button
	  Then Verify homepage displayed with message "Welcome To Manager's Page of Guru99 Bank"
	  And I close browser
  
  	Scenario Outline: Login to system with example data table
  Given I open application
  When I input username "<Username>"
  And I input password "<Password>"
  And Click to login button
  Then Verify homepage displayed with message "Welcome To Manager's Page of Guru99 Bank"
  And I close browser
  
  Examples:
  |Username|Password|
  |mngr327147|dedAsag|
  |mngr327148|sEqyzUz|
  |mngr327149|YvanAja|

  