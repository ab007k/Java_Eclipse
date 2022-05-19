/*<not run all TC>
 *1>Go to the homepage and verify its title.
 *2>Click REGISTER and verify the title of its target page.
 *3>Go back to the homepage and verify if it still has the correct title.
 *4>Click SUPPORT and verify the title of its target page.
 *5>Go back to the homepage.
 */
package p.TestNG1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TC2_Annotations {
	String dr="webdriver.gecko.driver";
	String drPath="D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\geckodriver.exe";
	public WebDriver driver;
	public String baseURL="http:demo.guru99.com/test/newtours/";
	public String expdTitle=null;
	public String actlTitle=null;

  @BeforeTest//Before all the @Test/methods/TC
  public void launchBrowser() {
		 System.setProperty(dr,drPath);
		 driver=new FirefoxDriver();
		 driver.get(baseURL);
		  }	

  @BeforeMethod//Before each @Test/methods/TC
  public void verifyHomepageTitle() {
	 String expTitle="Welcome: Mercury Tours";
	 String actTitle=driver.getTitle();	  
	  Assert.assertEquals(actTitle,expTitle);	 
  }
  
  @Test(priority=0)//Parameters are the keywords that modify the annotations function//
  public void register() {
	  driver.findElement(By.linkText("REGISTER")).click();
	  expdTitle="Register: Mercury Tours";
	  actlTitle=driver.getTitle();	  
	  Assert.assertEquals(actlTitle,expdTitle);	 	  
  }

  @Test(priority=1)
  public void support() {
	  driver.findElement(By.linkText("SUPPORT")).click();
	  expdTitle="Under Construction: Mercury Tours";
	  actlTitle=driver.getTitle();	  
	  Assert.assertEquals(actlTitle,expdTitle);	 
  }

  @AfterMethod//After each @Test/methods/TC
  public void goBackHomepage() {
	  driver.findElement(By.linkText("Home")).click();
  }

  @AfterTest//After all the @test/methods/TC
  public void terminateBrowser() {
	  driver.quit();
  }

}
