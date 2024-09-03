package com.magneto.runner;

import org.junit.AfterClass;

import org.junit.BeforeClass;

import org.junit.runner.RunWith;

import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/java/com/magneto/feature/MagnetoBackground.feature", 
				glue = "com.magneto.stepdefinition", 
				monochrome = false, 
				dryRun = false, 
				strict = true, 
				tags = {"@smoke"}, 
				plugin = {
						"html:HtmlMagnetoReport", 
						"pretty",
						"json:JsonMagnetoreport/BackgoundReport.json", 
						"com.cucumber.listener.ExtentCucumberFormatter:MagnetoExtentReport/BackgroundMagneto.html"
				})

public class BackgroundRunner extends BaseClass{
	
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
