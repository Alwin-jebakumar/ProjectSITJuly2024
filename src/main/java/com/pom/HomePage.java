package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//li[@class='greet welcome']/span")
	private WebElement userGreeting;
	
	@FindBy(xpath = "//span[@class='customer-name']/button[@type='button']")
	private WebElement userOptions;
	
	@FindBy(xpath = "//div[@class='customer-menu']/ul/li/a[contains(text(),'Sign Out')]")
	private WebElement signout;

	public WebElement getUserGreeting() {
		return userGreeting;
	}

	public WebElement getUserOptions() {
		return userOptions;
	}
	
	public WebElement getSignout() {
		return signout;
	}
	
	public HomePage(WebDriver driver) {

		this.driver = driver;
		
		PageFactory.initElements(this.driver, this);
	
	}
	

}
