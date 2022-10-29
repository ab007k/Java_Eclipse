package com.TestNG05parameterization01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WithParametersAnno {
	WebDriver dr;
	@BeforeSuite(groups= {"Sanity"})
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		
	}
	
	@Parameters({"url"})
	@Test(priority=1,groups= {"Sanity"})
	public void launchApp(String url) {
		dr.get(url);
		boolean img1 = dr.findElement(By.xpath("//tbody/tr/td/div[1]/img")).isDisplayed();
		Assert.assertTrue(img1);
	}
	
	@Parameters({"uname","pword"})
	@Test(priority=2,groups= {"Sanity"})
	public void logInTest(String uname,String pword) {
		dr.findElement(By.name("username")).sendKeys(uname);
		dr.findElement(By.name("pwd")).sendKeys(pword);
		dr.findElement(By.id("loginButton")).click();
		boolean img2 = dr.findElement(By.xpath("//tbody/tr/td/div/div[2]/img")).isDisplayed();
		Assert.assertTrue(img2);		
	}
	
	@AfterSuite(groups= {"Sanity"})
	public void tearDown() {
		dr.quit();
	}

}
