package k1.WindowsAuthenticationPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUP {
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		
		//dr.get("https://the-internet.herokuapp.com/basic_auth");
		
		//Syntax:>dr.get("http://Username:Password@url);
		
		dr.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		//Validation//
		String exp="Congratulations! You must have the proper credentials.";
		
		String act=dr.findElement(By.cssSelector("p")).getText();//p[contains(text(),'Congratulations! You must have the proper credenti')]
		
		if(exp.equals(act)) {
			System.out.println("TestPassed");
		}else {
			System.out.println("TestFailed");
		}
		
		dr.quit();
	}
}
