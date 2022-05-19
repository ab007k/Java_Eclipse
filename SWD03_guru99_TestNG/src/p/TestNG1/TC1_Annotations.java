package p.TestNG1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class TC1_Annotations {
	String dr="webdriver.gecko.driver";
	String drPath="D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\geckodriver.exe";
	WebDriver driver;
	public String baseURL="http:demo.guru99.com/test/newtours/";
	
 @BeforeTest//Before all the @Test/methods/TC
 public void launchBrowser() {
	 System.setProperty(dr,drPath);
	 driver=new FirefoxDriver();
	 driver.get(baseURL);
	  }	
 
  @Test//Method:verifyHomepageTitle(),Under the @Test,it is an our TestCase.
  public void verifyHomepageTitle() {
	  String expTitle="Welcome: Mercury Tours";
	  String actTitle=driver.getTitle();	  
	  Assert.assertEquals(actTitle,expTitle);	 
  }
  
  @AfterTest//After all the @test/methods/TC
  public void terminateBrowser() {
	  driver.quit();
  }

}
