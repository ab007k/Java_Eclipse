package com.TestNG04groups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ActiTime {
	WebDriver dr;
	@BeforeSuite(groups= {"Sanity"})
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		
	}
	
	@Test(priority=1,groups= {"Sanity"})
	public void launchApp() {
		dr.get("http://127.0.0.1/login.do");
		boolean img1 = dr.findElement(By.xpath("//tbody/tr/td/div[1]/img")).isDisplayed();
		Assert.assertTrue(img1);
	}
	
	@Test(priority=2,groups= {"Sanity"})
	public void logInTest() {
		dr.findElement(By.name("username")).sendKeys("admin");
		dr.findElement(By.name("pwd")).sendKeys("manager");
		dr.findElement(By.id("loginButton")).click();
		boolean img2 = dr.findElement(By.xpath("//tbody/tr/td/div/div[2]/img")).isDisplayed();
		Assert.assertTrue(img2);		
	}
	
	@Test(priority=3,groups= {"Regression"})
	public void titleTest() {
		String actTitle=dr.getTitle();
		String expTitle="actiTIME - Enter Time-Track";
		Assert.assertEquals(actTitle,expTitle);		
	}
	
	@Test(priority=4,groups= {"Sanity"})
	public void logoutTest() {
		dr.findElement(By.xpath("//a[.='Logout']")).click();
		String ActUrl=dr.getCurrentUrl();
		String ExpUrl="http://127.0.0.1/login.do";
		Assert.assertEquals(ActUrl, ExpUrl);		
	}
	
	@AfterSuite(groups= {"Sanity"})
	public void tearDown() {
		dr.quit();
	}


}
