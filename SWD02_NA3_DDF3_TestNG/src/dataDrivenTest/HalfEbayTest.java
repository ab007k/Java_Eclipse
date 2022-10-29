package dataDrivenTest;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testUtility.TestUtil;

public class HalfEbayTest {
	
	WebDriver dr;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\chromedriver.exe");
		dr=new ChromeDriver();
		
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		dr.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2Fhelp%2Faccount%2Fsigning-ebay-account%2Fsigning-ebay-account%3Fid%3D4191");		
	}
	//2//
	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]>testData=TestUtil.getDataFromExcel();
		return testData.iterator();
	}
	//1//
	@Test(dataProvider="getTestData")
	public void halfEbayRegPageTest(String FirstName, String LastName, String Email, String Password) {
		
		WebElement eFirstName=dr.findElement(By.xpath("//input[@id='firstname']"));
		eFirstName.clear();
		eFirstName.sendKeys(FirstName);
		
		WebElement eLastName=dr.findElement(By.xpath("//input[@id='lastname']"));
		eLastName.clear();
		eLastName.sendKeys(LastName);
		
		WebElement eEmail=dr.findElement(By.xpath("//input[@id='Email']"));
		eEmail.clear();
		eEmail.sendKeys(Email);
		
		WebElement ePassword=dr.findElement(By.xpath("//input[@id='password']"));
		ePassword.clear();
		ePassword.sendKeys(Password);
	}
		
	@AfterMethod
	public void teardown() {
		dr.quit();
	}
	
}
