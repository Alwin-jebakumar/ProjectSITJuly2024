package com.magneto.stepdefinition;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.BaseClass;

import com.magneto.runner.BackgroundRunner;

import com.pageobjectmanager.PageObjectManager;

import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;

import cucumber.api.java.en.When;

public class MagnetoBackgroundStep extends BaseClass{
	
	static WebDriver driver = BackgroundRunner.driver;
	
	static PageObjectManager pom = new PageObjectManager(driver);
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	
	@Given("^user Launch The Mangeto Application Url$")
	public void user_Launch_The_Mangeto_Application_Url() throws Throwable {
	    
		urlLaunch("https://magento.softwaretestingboard.com/");
		
	}

	@Then("^user Click SignIn Button It Will Go To The Login Page$")
	public void user_Click_SignIn_Button_It_Will_Go_To_The_Login_Page() throws Throwable {
	    
		wait.until(ExpectedConditions.visibilityOf(pom.getInstanceMP().getSingIn()));
		clickOnElement(pom.getInstanceMP().getSingIn());
		
	}

	@When("^user Provide Valid Username And Password In Their Fields$")
	public void user_Provide_Valid_Username_And_Password_In_Their_Fields() throws Throwable {
	    
		inputValueOnElement(pom.getInstanceLP().getUsername(), "yalwin15@gmail.com");
		inputValueOnElement(pom.getInstanceLP().getPass(), "Alwin@123");
		
	}

	@When("^click On The Login Button It Will Navigate To Home Page$")
	public void click_On_The_Login_Button_It_Will_Navigate_To_Home_Page() throws Throwable {
	    
		clickOnElement(pom.getInstanceLP().getLoginButton());
		
	}

	@Then("^user Validate It Successfully Login$")
	public void user_Validate_It_Successfully_Login() throws Throwable {
	    
		wait.until(ExpectedConditions.visibilityOf(pom.getInstanceHP().getUserGreeting()));
		assertTrue(pom.getInstanceHP().getUserGreeting().isDisplayed());
		
		clickOnElement(pom.getInstanceHP().getUserOptions());
		clickOnElement(pom.getInstanceHP().getSignout());
		
	}

	@When("^user Provide Invalid Username And InvalidPassword In Their Fields$")
	public void user_Provide_Invalid_Username_And_InvalidPassword_In_Their_Fields() throws Throwable {
	    
		inputValueOnElement(pom.getInstanceLP().getUsername(), "yal561561@gmail.com");
		inputValueOnElement(pom.getInstanceLP().getPass(), "Alwida671e5");
		
	}

	@When("^click On The Login Button It Will Show The Error Alert$")
	public void click_On_The_Login_Button_It_Will_Show_The_Error_Alert() throws Throwable {
	    
		clickOnElement(pom.getInstanceLP().getLoginButton());
		
	}

	@Then("^user Validate Alert Shown$")
	public void user_Validate_Alert_Shown() throws Throwable {
	    
		assertTrue(pom.getInstanceLP().getAlert().isDisplayed());
		
	}
	

}
