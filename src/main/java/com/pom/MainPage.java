package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//a[contains(text(),'Sign In')]")
	private WebElement singIn;
	
	@FindBy(xpath = "//a[contains(text(),'Create an Account')]")
	private WebElement createAccount;

	public WebElement getSingIn() {
		return singIn;
	}

	public WebElement getCreateAccount() {
		return createAccount;
	}
	
	public MainPage(WebDriver driver) {

		this.driver = driver;
		
		PageFactory.initElements(this.driver, this);
	
	}

}
