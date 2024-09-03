Feature: Check Whether Login Functionality In Magento Application

Scenario Outline: Login Functionality
	Given user Launch The Magneto Url 
	And user Validate The Following Fields In Home Page.
		|	Sign In		|
		|	Create an Account |
		
	Then user Click On The Sign In Button It Navigate To The Login Page For Magneto
	When user Enter The "<Email>" In Email Field In Sing In Page
	And user Enter The "<Password>" In Password Field In Sing In Page
	Then user Click On The Sign In Button It Navigate To Magneto Home Page
	
Examples:   # Data Stored in Table format

			|	Email							|	Password					|
			|	adsfd							|	n1422najdna				|
			| yalwin15@gmail.com| efgrhgdon					|
			| aidbvabcibzxi			| Alwin@123					|
			|	yalwin15@gmail.com| Alwin@123					|
	
		
	