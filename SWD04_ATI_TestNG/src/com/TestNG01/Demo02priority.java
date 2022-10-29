/*
 * Lower priority scheduled first.
 * if priority -ve then this TC execute first.
 * default priority=0.
 * if priority same then TC will be execute in alphabetical manner.
 */

package com.TestNG01;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo02priority {
	WebDriver dr;
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Test(priority=-1)
	public void test1() {
	
		System.out.println("test1:-1");
	}
	@Test(priority=0)
	public void test2() {
	
		System.out.println("test2:0");
	}
	@Test
	public void test3() {
	
		System.out.println("test3:-");
	}
	@Test(priority=1)
	public void test4() {
	
		System.out.println("test4:1");
	}

	@AfterTest
	public void closeBrowser() {
		dr.close();
	}
}
