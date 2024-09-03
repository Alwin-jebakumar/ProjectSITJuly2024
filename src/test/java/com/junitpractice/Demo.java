package com.junitpractice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Demo {
	
	@BeforeClass
	public static void browserLaunch() {

		System.out.println("browser launch Success");
		
	}
	
	@Before
	public void signIn() {

		System.out.println("Sign in is exeucted....");
		
	}
	
	@Test
	public void myOrder() {

		System.out.println("My Order is exeucted....");
		
	}
	
	@Test
	public void myCoupon() {

		System.out.println("My Coupon is exeucted....");
		
	}
	
	@After
	public void signOut() {

		System.out.println("Sign Out is exeucted....");
		
	}
	
	@AfterClass
	public static void closeTheBrowser() {

		System.out.println("browser closed Success");
		
	}
	

}
