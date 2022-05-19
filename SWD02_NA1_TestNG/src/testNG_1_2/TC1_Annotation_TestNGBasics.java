package testNG_1_2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC1_Annotation_TestNGBasics {
	
	//PreCondition Annotations->Starting with @Before
	@BeforeSuite //1//
	public void setUp(){
		System.out.println("@BeforeSuite->setUp systemProperty for Browser(Chrome)");
	}
	
	@BeforeTest //2//
	public void launchBrowser() {
		System.out.println("@BeforeTest->launchBrowser");
	}
	
	@BeforeClass //3//
	public void logIn() {
		System.out.println("@BeforeClass->logIn to App");
	}
	
	@BeforeMethod //4//
	public void enterUrl() {
		System.out.println("@BeforeMethod->enterUrl");
	}
	
	@Test //5.1//
	public void searchText() {
		System.out.println("@Test->searchText");
	}
	
	@Test
	public void googleLogo() {
		System.out.println("@Test->googleLogo");
	}
	
	//PostConditions->Starting with @After
	@AfterMethod //6//
	public void logOut() {
		System.out.println("@AfterMethod->logOut to App");
	}
	
	@AfterClass //7//
	public void closeBrowser() {
		System.out.println("@AfterClass->closeBrowser");
	}
	
	@AfterTest //8//
	public void deleteAllCookies() {
		System.out.println("@AfterTest->deleteAllCookies");
	}
}
