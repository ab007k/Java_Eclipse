package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class SignInPage extends TestBase {

	//Define PageFactory-OR:
	//InvalidSelectorException
	@FindBy(xpath="//input[@id='login_id']")
	WebElement EmailId;
	
	@FindBy(xpath="//form[@id='login']//button[@id='nextbtn']")
	WebElement NextBtn;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement Password;
	
	@FindBy(xpath="//button[@id='nextbtn']//span[contains(text(),'Sign in')]")
	WebElement SignInBtn;
	
	//Initialize the all define object by using constructor and method :
	public SignInPage() {
		PageFactory.initElements(dr, this);
	}
	
	//Actions:
	public String validateSignInPageTitle() {
		return dr.getTitle();
	}
	
	//This method returning the obj of redirecting page:HomePage//
	//for that we need to create Class:to avoid error//
	public HomePage signIn(String emailid, String password) {
		EmailId.sendKeys(emailid);
		NextBtn.click();
		Password.sendKeys(password);
		SignInBtn.click();
		return new HomePage();
	}
	
	

}
