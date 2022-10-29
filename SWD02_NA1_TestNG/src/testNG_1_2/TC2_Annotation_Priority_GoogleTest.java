package testNG_1_2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TC2_Annotation_Priority_GoogleTest {
  WebDriver dr;
  //1//4//7//
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
  //If priority not set then it excuted in Alphabatical Order//Link>Logo>Title//
  //2//
  @Test(priority=1)
  public void googleTitleTest() {
	  String title=dr.getTitle();
	  System.out.println(title);
  }
  //5//
  @Test(priority=2)
  public void googleLogoTest() {
	  boolean gLogo=dr.findElement(By.xpath("//body/div[1]/div[2]/div[1]/img[1]")).isDisplayed();
	  System.out.println(gLogo);
  }
  //8//
  @Test(priority=3)
  public void gmailLinkTest() {
  boolean gLink=dr.findElement(By.xpath("//a[contains(text(),'Gmaal')]")).isDisplayed();//Gmail//
  System.out.println(gLink);
  }
  //3//6////9//
  @AfterMethod
  public void tearDown() {
	  dr.quit();
  }

}
