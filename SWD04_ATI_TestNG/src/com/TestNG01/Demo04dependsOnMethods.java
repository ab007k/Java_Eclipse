package com.TestNG01;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo04dependsOnMethods {
	WebDriver dr;
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@Test
	public void openUrl() {
		dr.get("https://ww.a.com");
	}
	//The list of Methods this Method depends on//
	@Test(dependsOnMethods= {"openUrl"})//(dependsOnMethods= {"openUrl,logIn"})
	public void titleTest() {
		String title=dr.getTitle();
		System.out.println(title);
	}

	@AfterTest
	public void closeBrowser() {
		dr.close();
	}

}
