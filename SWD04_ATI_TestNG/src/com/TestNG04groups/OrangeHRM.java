package com.TestNG04groups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OrangeHRM {
	WebDriver dr;
	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		
	}
	
	@Test
	public void launchApp() {
		dr.get("https://opensource-demo.orangehrmlive.com/");
		boolean img1 = dr.findElement(By.xpath("//div[@id='divLogo']/img")).isDisplayed();
		Assert.assertTrue(img1);
	}
	
	@Test
	public void logInTest() {
		dr.findElement(By.id("txtUsername")).sendKeys("Admin");
		dr.findElement(By.id("txtPassword")).sendKeys("admin123 ");
		dr.findElement(By.id("btnLogin")).click();
		boolean img2 = dr.findElement(By.xpath("//div[@id='branding']/a[1]/img")).isDisplayed();
		Assert.assertTrue(img2);		
	}
	
	@Test
	public void currentUrlTest() {
		String actUrl=dr.getCurrentUrl();
		String expUrl="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		Assert.assertEquals(actUrl, expUrl);		
	}
	
	@Test
	public void titleTest() {
		String actTitle=dr.getTitle();
		String expTitle="OrangeHRM";
		Assert.assertEquals(actTitle,expTitle);		
	}
	
	@Test
	public void logoutTest() {
		dr.findElement(By.id("welcome")).click();
		dr.findElement(By.id("//a[.='Logout']")).click();
		String ActUrl=dr.getCurrentUrl();
		String ExpUrl="https://opensource-demo.orangehrmlive.com/index.php/auth/login";
		Assert.assertEquals(ActUrl, ExpUrl);		
	}

}
