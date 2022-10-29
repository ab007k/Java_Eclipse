package com.TestNG01;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test //at class level
public class Demo10TestAtClassLevel {
	WebDriver dr;
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		dr.get("https://www.amazon.com");
	}
	
	public void titleTest1() {
		String title=dr.getTitle();
		System.out.println(title);
	}

	public void titleTest2() {
		String url = dr.getCurrentUrl();
		System.out.println(url);
	}
	@AfterTest
	public void closeBrowser() {
		dr.close();
	}

}
