//StepFirst//
package com.eBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	//Create Driver Object//
	WebDriver ldriver;
	
	//Constructor:Take Driver as a parameter//
	public LogInPage(WebDriver rdriver){
		ldriver=rdriver; //InitiateDriver
		PageFactory.initElements(rdriver, this);
	}
	
	//Identify element which are present in the LogInPage//
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	@CacheLookup
	WebElement lnkLogout;
   
	//For this above element we have to write ActionMethod//
	public void  setUserName(String uname) {
		txtUserName.clear();
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}
	
	public void  clickSubmit() {
		btnLogin.click();
	}
	
	public void clickLogout() {
		lnkLogout.click();
	}
	
	//With this we have done PageObjectClass for LogInPage//	
}
