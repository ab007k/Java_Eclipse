package testNG_1_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC3_Group_GoogleTest { 
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
	  @Test(priority=1,groups="Title")
	  public void googleTitleTest() {
		  String title=dr.getTitle();
		  System.out.println(title);
	  }
	  //5//
	  @Test(priority=2,groups="Logo")
	  public void googleLogoTest() {
		  boolean gLogo=dr.findElement(By.xpath("//body/div[1]/div[2]/div[1]/img[1]")).isDisplayed();
		  System.out.println(gLogo);
	  }
	  //8//
	  @Test(priority=3,groups="Link")
	  public void gmailLinkTest() {
	  boolean gLink=dr.findElement(By.xpath("//a[contains(text(),'Gmaal')]")).isDisplayed();//Gmail//
	  System.out.println(gLink);
	  }
	  
	  @Test(priority=4,groups="Test")
	  public void Test1() {
	  System.out.println("Test1");
	  }
	  
	  @Test(priority=5,groups="Test")
	  public void Test2() {
	  System.out.println("Test2");
	  }

	  //3//6////9//
	  @AfterMethod
	  public void tearDown() {
		  dr.quit();
	  }

	}
