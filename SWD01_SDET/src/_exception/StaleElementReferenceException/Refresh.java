package _exception.StaleElementReferenceException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Refresh {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		//1.Open url
		dr.get("https://classic.freecrm.com/login.cfm");
		
		dr.manage().window().maximize();
		
		//2.Identify and Click->redirect to new window/WebPage
		WebElement Username=dr.findElement(By.name("username"));
		Username.sendKeys("PayalBole");
		WebElement Password=dr.findElement(By.name("password"));
		Password.sendKeys("ChanChan");

		
		//3.RefreshPage
		dr.navigate().refresh();
		
		//4.After Refreshing Element takes time to load,so thats why we get exception:
		//Username.sendKeys("PayalBole");//StaleElementReferenceException:stale element reference:element is not attached to the page document
				
		//ToAvoidThis:If we get Exception, Find & Send Once again//With the help of TryCatch//
		try {
			Username.sendKeys("PayalBole");
		}catch(StaleElementReferenceException e) {
			Username=dr.findElement(By.name("username"));
			Username.sendKeys("PayalBole");
		}
	}

}

