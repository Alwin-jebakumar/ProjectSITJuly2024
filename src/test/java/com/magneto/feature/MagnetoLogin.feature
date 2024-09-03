Feature: Check Whether Login Functionality In Magento Application

Scenario: Login Functionality
	Given user Launch The Url 
	And user Validate The Following Fields.
		|	Sign In		|
		|	Create an Account |
		
	Then user Click On The Sign In Button It Navigate To The Login Page
	When user Enter The Email In Email Field
	And user Enter The Password In Password Field
	Then user Click On The Sign In Button It Navigate To Home Page
	
	

