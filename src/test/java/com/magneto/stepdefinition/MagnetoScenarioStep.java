package com.magneto.stepdefinition;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;
import com.magneto.runner.LoginRunner;
import com.pageobjectmanager.PageObjectManager;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MagnetoScenarioStep extends BaseClass{
	
	public static WebDriver driver = LoginRunner.driver;
	
	public static PageObjectManager pom = new PageObjectManager(driver);

	@Given("^user Launch The Magneto Url$")
	public void user_Launch_The_Magneto_Url() throws Throwable {
		
		urlLaunch("https://magento.softwaretestingboard.com/");
		
	}

	@Given("^user Validate The Following Fields In Home Page\\.$")
	public void user_Validate_The_Following_Fields_In_Home_Page(DataTable dt) throws Throwable {
		
		List<String> fields = dt.asList(String.class);
		System.out.println(fields);

		assertTrue(fields.contains(pom.getInstanceMP().getSingIn().getText()));
		assertTrue(fields.contains(pom.getInstanceMP().getCreateAccount().getText()));
		
	}

	@Then("^user Click On The Sign In Button It Navigate To The Login Page For Magneto$")
	public void user_Click_On_The_Sign_In_Button_It_Navigate_To_The_Login_Page_For_Magneto() throws Throwable {
		
		clickOnElement(pom.getInstanceMP().getSingIn());
		
	}

	@When("^user Enter The \"([^\"]*)\" In Email Field In Sing In Page$")
	public void user_Enter_The_In_Email_Field_In_Sing_In_Page(String email) throws Throwable {
		
		inputValueOnElement(pom.getInstanceLP().getUsername(), email);
		
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field In Sing In Page$")
	public void user_Enter_The_In_Password_Field_In_Sing_In_Page(String pass) throws Throwable {
		
		inputValueOnElement(pom.getInstanceLP().getPass(), pass);
		
	}

	@Then("^user Click On The Sign In Button It Navigate To Magneto Home Page$")
	public void user_Click_On_The_Sign_In_Button_It_Navigate_To_Magneto_Home_Page() throws Throwable {
		
		clickOnElement(pom.getInstanceLP().getLoginButton());
		
	}

}
