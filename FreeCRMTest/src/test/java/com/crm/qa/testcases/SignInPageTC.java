package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.SignInPage;

public class SignInPageTC extends TestBase {
	SignInPage signInPage ;
	HomePage homePage;
	public SignInPageTC() {
		//super class constructor:call cont of TestBase Class
		//it will help to initialize the property
		super();
	}
	
	@BeforeMethod
	public  void setUp() {
		
		initialization();
		
		//Object creation>>>to  access method of Class SignInPage
		signInPage= new SignInPage(); 
	}
	
	@Test
	public void signInPageTitleTest(){
		String title=signInPage.validateSignInPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Zoho Accounts");
	}
	
	@Test
	public void signInTest() {
		//this credientials get from config.properties file//
		homePage=signInPage.signIn(pr.getProperty("email"),pr.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		dr.quit();
	}

}
