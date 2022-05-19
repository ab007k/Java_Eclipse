package com.eBanking.testCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.eBanking.utilities.ReadConfig;

public class BaseClass {
	/*
	//common var  req for every TC//
	public String baseURL="https://demo.guru99.com/V4/";
	public String username="mngr399533";
	public String password="emezApU";
	*/
	
	//If you want to get var value,we have to call the method which is created for that var.
	//How we can call this method?
	//We have to create an object for Class ReadConfig.java 
	//as soon as we created obj what happned?>it will invoke the constructor and load congiguration file.
	//and then using obj_ref call the method whichever you want.
	ReadConfig readconfig=new ReadConfig();
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	
	public static WebDriver driver;
	public static Logger logger;	
//	@BeforeClass
//	public void setUp() {
//		System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		//configuration for log4j
		logger=Logger.getLogger("eBanking");
		PropertyConfigurator.configure("log4j.properties");
		
		if(br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		
		else if(br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxPath());
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
		else if(br.equals("ie")) {
			System.setProperty("webdriver.ie.driver", readconfig.getIEPath());
			driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(baseURL);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	//Capture Screen on Test Failure
	public void captureScreen(WebDriver driver, String tname) throws IOException {	
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot Taken");
	}
}
