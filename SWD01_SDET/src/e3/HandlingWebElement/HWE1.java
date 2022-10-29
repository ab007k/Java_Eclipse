package e3.HandlingWebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HWE1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\chromedriver.exe");		
		WebDriver dr=new ChromeDriver(); //object creation for browser & then invoke the browser
		dr.manage().window().maximize();
		
//		System.setProperty("webdriver.gecko.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\geckodriver.exe");
//		WebDriver dr=new FirefoxDriver();
		
		//open url
		dr.get("https://demoqa.com/automation-practice-form");
		
		//1.TextBox/InputBox
		dr.findElement(By.id("firstName")).sendKeys("Ravi");
		dr.findElement(By.id("lastName")).sendKeys("Verma");
		dr.findElement(By.id("userEmail")).sendKeys("raviverma@gmail.com");
		dr.findElement(By.id("userNumber")).sendKeys("7778899665");
		
		//2.radio button selection
		//male
		System.out.println(dr.findElement(By.id("gender-radio-1")).isSelected());
		dr.findElement(By.xpath("(//div[@class='custom-control custom-radio custom-control-inline'])[1]")).click();
		System.out.println(dr.findElement(By.id("gender-radio-1")).isSelected());
		//female
		System.out.println(dr.findElement(By.id("gender-radio-2")).isSelected());
		dr.findElement(By.cssSelector("div[id='genterWrapper'] div[class='col-md-9 col-sm-12'] div:nth-child(2)")).click();
		System.out.println(dr.findElement(By.id("gender-radio-2")).isSelected());
		//male
		System.out.println(dr.findElement(By.id("gender-radio-1")).isSelected());
		
//ElementClickInterceptedException		//3.check  box selection
		dr.findElement(By.cssSelector("div[id='hobbiesWrapper'] div[class='col-md-9 col-sm-12'] div:nth-child(1)")).click();
		dr.findElement(By.cssSelector("div[id='hobbiesWrapper'] div[class='col-md-9 col-sm-12'] div:nth-child(2)")).click();
		dr.findElement(By.cssSelector("div[id='hobbiesWrapper'] div:nth-child(3)")).click();
		
//ElementClickInterceptedException		//4.select from dropdown
		WebElement st=dr.findElement(By.xpath("//div[@id='state']//div[@class=' css-1hwfws3']"));
		System.out.println(st);
		Select s=new Select(st);
		//out of these three use one
		//s.selectByIndex(1);
	    //s.selectByValue();
		s.selectByVisibleText("NCR");
		
//ElementClickInterceptedException		//5.DOB
		dr.findElement(By.cssSelector("div[id='dateOfBirth-wrapper'] div[class='col-md-3 col-sm-12']")).click();
	}
	
}
