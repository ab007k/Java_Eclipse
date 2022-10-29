package i.ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AC4_slider {
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\chromedriver.exe");
		WebDriver dr=new ChromeDriver(); //object creation for browser & then invoke the browser
		
		dr.get("https://jqueryui.com/slider/");
		dr.manage().window().maximize();
		dr.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		//Slider
		//Switch to iframe
		WebElement iframe=dr.findElement(By.xpath("//iframe[@class='demo-frame']"));
		dr.switchTo().frame(iframe);
		
		//identify WebElement:slider SH:>//span[@class='ui-slider-handle ui-corner-all ui-state-default']
		WebElement slider=dr.findElement(By.xpath("//body/div[@id='slider']/span[1]"));
		
		//ActionClass
		Actions act=new Actions(dr);
		act.moveToElement(slider).dragAndDropBy(slider, 300, 0).build().perform();
		
		//dr.quit();
	}
}
