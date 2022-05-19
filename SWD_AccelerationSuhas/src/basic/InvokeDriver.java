package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeDriver {
	public  static void main (String[]args) throws InterruptedException {
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
		
		Thread.sleep(3000);
		
		WebElement ChooseaRediffmailID=dr.findElement(By.xpath("//tbody/tr[7]/td[3]/input[1]"));
		ChooseaRediffmailID.sendKeys("JanuMeriJan@reddifmail.com");
		
		Thread.sleep(3000);
		
		//org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element
		//WebElement Password=dr.findElement(By.name("passwd47fd86d8"));
		WebElement Password=dr.findElement(By.xpath("//tbody/tr[9]/td[3]/input[1]"));
		Password.sendKeys("Only4@u");
			
		//close the browser
		//dr.close();
	}
}
