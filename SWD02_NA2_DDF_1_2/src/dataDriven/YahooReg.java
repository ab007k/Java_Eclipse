package dataDriven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import excelUtility.Xls_Reader;

public class YahooReg {
	public static void main(String[] args) {
			
//getData from excel:
		Xls_Reader reader=new Xls_Reader("D:\\@Qspider\\Java_Eclipse\\SWD_NA2_DDF_TestNG\\src\\testData\\yahooTestData.xlsx");
		
		String FirstName=reader.getCellData("RegTestData","FirstName",2);
		System.out.println(FirstName);
		
		String LastName=reader.getCellData("RegTestData","LastName",2);
		System.out.println(LastName);
		
//		String Email=reader.getCellData("RegTestData","Email",2);
//		System.out.println(Email);
		
		String Password=reader.getCellData("RegTestData","Password",2);
		System.out.println(Password);
				
//		String MobNo=reader.getCellData("RegTestData","MobNo",2);
//		System.out.println(MobNo);
		
		String CountryCode=reader.getCellData("RegTestData","CountryCode",2);
		System.out.println(CountryCode);
		
//Webdriver code:		
		System.setProperty("webdriver.chrome.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\chromedriver.exe");
		WebDriver dr=new ChromeDriver(); //object creation for browser & then invoke the browser
		dr.manage().window().maximize();
		dr.manage().timeouts().getPageLoadTimeout();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		dr.get("https://login.yahoo.com/account/create?");
		
		dr.findElement(By.id("usernamereg-firstName")).sendKeys(FirstName);
		
		dr.findElement(By.id("usernamereg-lastName")).sendKeys(LastName);
		
//		dr.findElement(By.id("usernamereg-yid")).sendKeys(Email);//it will show some other option in box?//
		
		dr.findElement(By.id("usernamereg-password")).sendKeys(Password);
		dr.findElement(By.id("usernamereg-show-button")).click();
		
//		dr.findElement(By.id("usernamereg-phone")).sendKeys(MobNo);//Print:1.23456789E9//Enter:1234567899//
		
        Select s=new Select(dr.findElement(By.name("shortCountryCode")));
		s.selectByValue("FR");//s.selectByVisibleText("Afghanistan(+93)");//>Why its not Working?//
				
	}

}
