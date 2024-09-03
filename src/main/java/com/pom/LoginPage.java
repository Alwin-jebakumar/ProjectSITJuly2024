package com.pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;				// null
	
	@FindBy(id = "email")
	private WebElement username;
	
	@FindBy(id = "pass")
	private WebElement pass;
	
	@FindBy(id = "send2")
	private WebElement loginButton;
	
	@FindBy(xpath = "//div[@role='alert']")
	private WebElement alert;
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public WebElement getAlert() {
		return alert;
	}

	public LoginPage(WebDriver abc) {

		driver = abc;
		
		PageFactory.initElements(driver, this);
	
	}
	
	

}
