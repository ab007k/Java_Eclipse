package k.AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AIT1_Upload {
	public static void main(String[]args) throws IOException, InterruptedException {
//		System.setProperty("webdriver.chrome.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\chromedriver.exe");
//		WebDriver dr=new ChromeDriver();
//		
		System.setProperty("webdriver.gecko.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\geckodriver.exe");
		WebDriver dr=new FirefoxDriver();

		dr.get("http://demo.automationtesting.in/Register.html");
		
		//Exception in thread "main" org.openqa.selenium.InvalidArgumentException: Cannot click <input type=file> elements
		//dr.findElement(By.id("imagesrc")).click();//this is failed so alternate for JavaScriptExecutor//
		
		//We need to use //JavaScriptExecutor// for click it//
		WebElement button=dr.findElement(By.xpath("//input[@id='imagesrc']"));
				
		JavascriptExecutor js=(JavascriptExecutor)dr;//downcasting<CastOperator>//
		
		//org.openqa.selenium.JavascriptException: ReferenceError: argument is not defined//"argument[0].click();"//
		js.executeScript("arguments[0].click();", button);
		
		
		Runtime.getRuntime().exec("D:\\@Qspider\\AutoIT_file\\Chhatrapati.exe"+" "+"D:\\@Qspider\\AutoIT_file\\Chhatrapati.jpg");
		//something wrong in above statement//
		
		
	}
}
