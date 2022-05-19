package a.basic_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BT2_FireFox {
	
	public static void main(String[]args) {
		
		//System.setProperty("webdriver.gecko.merionette","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\geckodriver.exe");
		WebDriver dr=new FirefoxDriver();
		
//		dr.get("http://www.amazon.com");
//		System.out.println(dr.getTitle());
//		dr.quit();
		
		dr.get("https://demo.guru99.com/test/newtours/index.php");
			
		dr.findElement(By.name("userName")).sendKeys("mercury");
		dr.findElement(By.name("password")).sendKeys("password");
		dr.findElement(By.name("submit")).click();
		
		String exp_title="Welcome: Mercury Tours";
		String act_title=dr.getTitle();
		
		if(exp_title.equals(act_title))    //;
		{
			System.out.println("passed");			
		}
		else {
			System.out.println("failed");	
		}
		//dr.close(); //not work for firefox
		dr.quit();
		
		
	}
	
	
}
