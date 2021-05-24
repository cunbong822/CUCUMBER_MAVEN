Feature: Common feature
Scenario: Common step
	#------------------ACTION-----------------#
	#textbox
	And I input to "name" textbox with data "Automation Test"
	And I input to "city" textbox with data "Hanoi"
	And I input to "state" textbox with data "Tu Liem"
	And I input to "emailid" textbox with random data "autotest"
	#1 is random data, 0 is not, 2 is email
	And I input to "city" textbox with "0" data "Ha Noi"
	And I input to "emailid" textbox with "2" data "autotest"
	#text area
	And I input to "addr" textarea with data "117 Tran Cung"
	And I input to "addr" textarea with "1" data "Tran Cung"
	#radio button
	And I select "m" radio button
	And I select "f" radio button
	#dropdown
	And I select "selaccount" dropdown with data "Current"
	And I select "selaccount" dropdown with data "Savings"
	#button
	And I click to "" button
	#regex
	And I input first Account ID
	And I input second Account ID
	And I transfer to "Amount" USD
	And I withdraw to "Amount" USD
	#Link
	And I open "" page
	#------------------VERIFY-----------------#
	And Verify message "" display
	
	#------------------WAIT-----------------#
	And I sleep with "" seconds