package testNG_3ParametersAnno_PropertiesFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC1_ParameterAnnotation {
	
	WebDriver dr;
	
  @Test
  @Parameters({"browser","url","emailId"})//1//
  public void yahooLogInTest(String browser,String url,String emailId) {//2//Pass Args//
	  //Configure//
	  if(browser.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\chromedriver.exe");
		dr=new ChromeDriver();
	  }else{
		System.setProperty("webdriver.gecko.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\geckodriver.exe");
		dr=new FirefoxDriver();
	  }
		dr.get(url);//dr.get("https://login.yahoo.com/");
		
		dr.findElement(By.xpath("//input[@id='login-username']")).clear();
		dr.findElement(By.xpath("//input[@id='login-username']")).sendKeys(emailId);//("testyahoo.com");//Get EnviVar from xml file;
		dr.findElement(By.xpath("//input[@id='login-signin']")).click();
  }
}
