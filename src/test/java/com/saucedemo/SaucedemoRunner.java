package com.saucedemo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.BaseClass;
import com.helper.DataReader;
import com.helper.DataReaderManager;
import com.pageobjectmanager.PageObjectManager;
import com.pom.LoginPage;

public class SaucedemoRunner extends BaseClass{
	
	public static WebDriver driver;
	
	public static WebDriverWait explicitWait;
	
	public static PageObjectManager pom;
	
	public static void main(String[] args) throws IOException {
		
		driver = browserLaunch("chrome");
		
		explicitWait = explicitWait(10);
		
		pom = new PageObjectManager(driver);
		
		urlLaunch(DataReaderManager.getInstanceDRM().getInstanceDR().getPropertyUrl());
		
		inputValueOnElement(pom.getInstanceLP().getUsername(),
				DataReaderManager.getInstanceDRM().getInstanceDR().getPropertyUsername());
		
		inputValueOnElement(pom.getInstanceLP().getPass(),
				DataReaderManager.getInstanceDRM().getInstanceDR().getPropertyPassword());
		
		clickOnElement(pom.getInstanceLP().getLoginButton());
		
	}
	
}
