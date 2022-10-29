package com.TestNG06parallelTesting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {
	WebDriver dr;
	@Test
	public void testCase1() throws InterruptedException {
		System.out.println("TC1"+"#"+Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);
		dr.get("https://www.amazon.com/");
	}

	@Test
	public void testCase2() throws InterruptedException {
		System.out.println("TC2"+"#"+Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		Thread.sleep(3000);
		dr.get("https://flipkart.com/");
	}
}

