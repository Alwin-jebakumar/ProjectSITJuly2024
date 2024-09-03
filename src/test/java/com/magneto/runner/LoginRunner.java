package com.magneto.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/magneto/feature/MagnetoScenario.feature", 
				glue = "com.magneto.stepdefinition")


public class LoginRunner extends BaseClass{
	
public static WebDriver driver;
	
	@BeforeClass
	public static void set_Up() {

		driver = browserLaunch("chrome");
		
	}
	
	@AfterClass
	public static void tear_Down() {

		allWindowClose();
		
	}

}
