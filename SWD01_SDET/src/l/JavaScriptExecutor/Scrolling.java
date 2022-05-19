package l.JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
	public static void  main(String[]args) {
		System.setProperty("webdriver.chrome.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://www.countries-ofthe-world.com/all-countries.html");
		
		dr.manage().window().maximize();
		dr.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
		
		//Scrolling with the help of JavaScriptExecutor//
		JavascriptExecutor js=(JavascriptExecutor)dr;
		
		//Scn1.Scrolling  by using pixal
//		js.executeScript("window.scrollBy(0,1000)","");
		
		//Scn2.Scrolling till we find element
//		WebElement India=dr.findElement(By.xpath("//li[contains(text(),'India')]"));//SH:>//li[normalize-space()='India']
//		js.executeScript("arguments[0].scrollIntoView();", India);
		
		//Scn3.Scrolling till the bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
}
