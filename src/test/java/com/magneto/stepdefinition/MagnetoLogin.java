package com.magneto.stepdefinition;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;
import com.helper.DataReaderManager;
import com.magneto.runner.TestRunner;

import com.pageobjectmanager.PageObjectManager;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;

import cucumber.api.java.Before;

import cucumber.api.java.en.Given;				// Cucumber Annotation

import cucumber.api.java.en.Then;				// Cucumber Annotation

import cucumber.api.java.en.When;				// Cucumber Annotation

public class MagnetoLogin extends BaseClass{
	
	static WebDriver driver = TestRunner.driver;
	
	PageObjectManager pom = new PageObjectManager(driver);
	
	@Before
	public void before_Hooks(Scenario scenario) {

		System.out.println("Before hooks is executed.....");
		
	}
	
	@After
	public void after_Hooks(Scenario scenario) {

		System.out.println("After hooks is executed.....");
		
//		if(scenario.isFailed()) {
//			
//			screenshot(scenario.getName()+".png");
//			
//		}
		
		screenshot(scenario.getName()+".png");
		
	}

	@Given("^user Launch The Url$")
	public void user_Launch_The_Url() throws Throwable {
		
		System.out.println("Sceanrio 1 is started.....");
		urlLaunch("https://magento.softwaretestingboard.com/");
		
	}

	@Given("^user Validate The Following Fields\\.$")
	public void user_Validate_The_Following_Fields(DataTable dt) throws Throwable {
		
		List<String> fields = dt.asList(String.class);
		System.out.println(fields);

		assertTrue(fields.contains(pom.getInstanceMP().getSingIn().getText()));
		assertTrue(fields.contains(pom.getInstanceMP().getCreateAccount().getText()));
		
	}

	@Then("^user Click On The Sign In Button It Navigate To The Login Page$")
	public void user_Click_On_The_Sign_In_Button_It_Navigate_To_The_Login_Page() throws Throwable {

		clickOnElement(pom.getInstanceMP().getSingIn());
		
	}

	@When("^user Enter The Email In Email Field$")
	public void user_Enter_The_Email_In_Email_Field() throws Throwable {

		inputValueOnElement(pom.getInstanceLP().getUsername(), 
				DataReaderManager.getInstanceDRM().getInstanceDR().getPropertyUsername());
	
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {

		inputValueOnElement(pom.getInstanceLP().getPass(), 
				DataReaderManager.getInstanceDRM().getInstanceDR().getPropertyPassword());
		
	}

	@Then("^user Click On The Sign In Button It Navigate To Home Page$")
	public void user_Click_On_The_Sign_In_Button_It_Navigate_To_Home_Page() throws Throwable {

		clickOnElement(pom.getInstanceLP().getLoginButton());
		System.out.println("Scenario is ended......");
		
	}

}
