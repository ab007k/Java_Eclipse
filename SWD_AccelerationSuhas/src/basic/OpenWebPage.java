package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWebPage {

	public static void main(String[] args) throws InterruptedException {
	//Invoke the driver
	System.setProperty("webdriver.chrome.driver", "D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\chromedriver.exe");
	WebDriver dr=new ChromeDriver();//upcasting
	
	//Open the WebPage
	dr.get("http://register.rediff.com/register/register.php?FormName=user_details");
	
	//maximize windows
	dr.manage().window().maximize();
	Thread.sleep(3000);
	
	//Find element and Enter the value in textfield	
	WebElement  FullName=dr.findElement(By.xpath("//tbody[1]/tr[3]/td[3]/input[1]"));
	FullName.sendKeys("janu");
	
	//we can write above statement in one line
	//dr.findElement(By.xpath("//tbody[1]/tr[3]/td[3]/input[1]")).sendKeys("janu");
		
	//Note:>//Element inside cross-origin iframe. Copy Selectors by right click on element or open iframe src url in new tab.
	//dr.findElement(By.xpath("//input[@name='namef88d01dc']")).sendKeys("janu"); //unable to search element,so create ur own Xpath
		
	//close the browser
	dr.close();
	}

}
