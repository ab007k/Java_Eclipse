
package _exception.StaleElementReferenceException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	//Find Element Again:To avoid StaleElementReferenceException//
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		//1.Open url
		dr.get("https://www.pavantestingtools.com/");
		
		dr.manage().window().maximize();
		
		//2.Identify and Click->redirect to new window/WebPage
		WebElement OnlineTraning=dr.findElement(By.xpath("//a[contains(text(),'Online Training')]"));//a[normalize-space()='Online Training']
		OnlineTraning.click();
		
		//3.Come Back to Previous Page
		dr.navigate().back();
		
		//4.Again Click on Same Link->We get Exception
		//OnlineTraning.click();//StaleElementReferenceException:stale element reference:element is not attached to the page document
		
		//ToAvoidThis:If we get Exception, Find & Click on it Once again//With the help of TryCatch//  
		try {
			OnlineTraning.click();
		}catch(StaleElementReferenceException e) {
			OnlineTraning=dr.findElement(By.xpath("//a[contains(text(),'Online Training')]"));//a[normalize-space()='Online Training']
			OnlineTraning.click();		
		}
	}

}
