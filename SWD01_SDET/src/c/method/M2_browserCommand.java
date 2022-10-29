/*
 * browserCommand
 * close()>close the current window
 * quit()>close the browser
 */
package c.method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class M2_browserCommand {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\chromedriver.exe");
		WebDriver dr=new ChromeDriver(); //object creation for browser & then invoke the browser
		
		
		dr.get("https://demoqa.com/browser-windows"); //open the URL
		WebElement NewTab=dr.findElement(By.id("tabButton"));
		NewTab.click();
		Thread.sleep(3000);		
		dr.close(); //close the current window
		//dr.quit();//close the browser
				

	}

}
