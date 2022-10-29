package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {
	
	public static Properties pr;
	public static WebDriver dr;
		
	public TestBase() {
		//to accesss prop from config.properties file, we need to create following  two object//
		try {
			pr=new Properties();
			FileInputStream ip=new FileInputStream("D:\\@Qspider\\Java_Eclipse\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			pr.load(ip);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		String browserName=pr.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\chromedriver.exe");
			dr=new ChromeDriver(); //object creation for browser & then invoke the browser
		}else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\geckodriver.exe");
			dr=new FirefoxDriver();
			
		}else if(browserName.equals("IE")){
			System.setProperty("webdriver.ie.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\IEDriverServer.exe");
			dr=new InternetExplorerDriver();		
		}
		
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PageLoadTimeout));
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.ImplicitWait));
		
		dr.get(pr.getProperty("url"));
	}

}
