package i.ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AC5_resizeable {
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\chromedriver.exe");
		WebDriver dr=new ChromeDriver(); //object creation for browser & then invoke the browser
		
		dr.get("https://jqueryui.com/resizable/");
		dr.manage().window().maximize();
		dr.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		//Resizable
		//identify WebElement:iframe
		WebElement iframe=dr.findElement(By.xpath("//iframe[@class='demo-frame']"));
		//Switch to iframe
		dr.switchTo().frame(iframe);
		
		//identify WebElement:resizable SH:>//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']
		WebElement resizable=dr.findElement(By.xpath("//body/div[@id='resizable']/div[3]"));
		
		//ActionsClass
		Actions act=new Actions(dr);
		act.moveToElement(resizable).dragAndDropBy(resizable, 75, 75).build().perform();//MoveTargetOutOfBoundsException:if SizeOfOffset OutOFRange
		
		//dr.quit();
		
	}	

}
