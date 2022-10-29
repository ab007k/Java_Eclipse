package com.TestNG05parameterization02;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestWithDataProviderAnno {
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
	
	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]>testData=TestUtil.getDataFromExcel();
		return testData.iterator();	
	}
	@Test(priority=2,groups= {"Sanity"},dataProvider="getTestData")
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
