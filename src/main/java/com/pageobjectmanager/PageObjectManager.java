package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.pom.HomePage;
import com.pom.LoginPage;
import com.pom.MainPage;

public class PageObjectManager {

	WebDriver driver;

	LoginPage lp; // null

	MainPage mp;
	
	HomePage hp;

	public LoginPage getInstanceLP() {

		if (lp == null) {

			lp = new LoginPage(driver); // Object

		}

		return lp;

	}

	public MainPage getInstanceMP() {

		if (mp == null) {

			mp = new MainPage(driver);

		}

		return mp;

	}
	
	public HomePage getInstanceHP() {

		if(hp == null) {
			
			hp = new HomePage(driver);
			
		}
		
		return hp;
		
	}

	public PageObjectManager(WebDriver abc) {

		this.driver = abc;

	}

}
