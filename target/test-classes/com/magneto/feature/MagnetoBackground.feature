Feature: Check Functionalities IN Magneto Application

Background:
	Given user Launch The Mangeto Application Url
	Then user Click SignIn Button It Will Go To The Login Page

@smoke
Scenario: User Check Login Functionality With Valid Username And Password
When user Provide Valid Username And Password In Their Fields
And click On The Login Button It Will Navigate To Home Page
Then user Validate It Successfully Login

@smoke
Scenario: User Check Login Functionality With Invalid Username And Password
When user Provide Invalid Username And InvalidPassword In Their Fields
And click On The Login Button It Will Show The Error Alert
Then user Validate Alert Shown

@sanity
Scenario: User Order Some Iterms Without Login
	When user Select The Size And Click Order Button
	And it Will Go To The Cart Page 
	And user Click On The Place Order Button 
	Then it will Book The Order And Shows Confirm Order
	
	

