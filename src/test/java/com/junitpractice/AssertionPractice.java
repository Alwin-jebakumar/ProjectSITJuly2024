package com.junitpractice;

import static org.junit.Assert.assertTrue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;

public class AssertionPractice extends BaseClass{
	
	String expectedHomePageTitle = "Home Page";
	
	@Test
	public  void magnetoLogin() {

		WebDriver driver = browserLaunch("chrome");
		
		urlLaunch("https://magento.softwaretestingboard.com/");
		
		String actualHomePageTitle = driver.getTitle();
		
		assertEquals(expectedHomePageTitle, actualHomePageTitle);
		
		WebElement signInButton = driver.findElement(By.xpath("//a[normalize-space(text())='Sign In']"));
		
		assertTrue(signInButton.isDisplayed());
		
	}

}
