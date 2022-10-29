package testNG_1_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC7_Assertation {
	
	  WebDriver dr;
	
	  @BeforeMethod
	  public void seUp() {
		  System.setProperty("webdriver.chrome.driver", "D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\chromedriver.exe");
		  dr=new ChromeDriver();//upcasting
		  dr.manage().window().maximize();
		  dr.manage().deleteAllCookies();
		  dr.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
		  dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  dr.get("http://www.google.com");
	  } 
	  
	  @Test(priority=1)
	  public void googleTitleTest() {
		  String expTitle="Google123";
		  String actTitle=dr.getTitle();
		  Assert.assertEquals(actTitle, expTitle, "Assertation/Validation");
		  //java.lang.AssertionError: Assertation/Validation expected [Google123] but found [Google]
		  //FailureException:it will show ActualTitle in firstLine or also DoubleClick on FirstLine 
		  //or also there is one symbol at the RightCorner of FailureException.
	  }
	  
	  @Test(priority=2)
	  public void googleLogoTest() {
		  boolean gLogo=dr.findElement(By.xpath("//body/div[1]/div[2]/div[1]/img[1]")).isDisplayed();
		  Assert.assertTrue(gLogo);//if gLogo==true:>Pass,else Fail//
	  }
	  
	  @Test(priority=3)
	  public void gmailLinkTest() {
	  boolean gLink=dr.findElement(By.xpath("//a[contains(text(),'Gmaal')]")).isDisplayed();//Gmail//NoSuchElementException//
	  Assert.assertEquals(gLink, true);
	  }
  
	  @AfterMethod
	  public void tearDown() {
		  dr.quit();
	  }
}
