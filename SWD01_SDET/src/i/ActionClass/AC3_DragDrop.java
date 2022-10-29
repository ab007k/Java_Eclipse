package i.ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AC3_DragDrop {
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\chromedriver.exe");
		WebDriver dr=new ChromeDriver(); //object creation for browser & then invoke the browser
		
		dr.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		dr.manage().window().maximize();
		dr.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		//Drag and Drop
		//identify source ang target (WebElement)
		WebElement source=dr.findElement(By.id("box1"));
		WebElement target=dr.findElement(By.id("box106"));
		
		//ActionClass
		Actions act=new Actions(dr);
		//act.clickAndHold(source).moveToElement(target).release().build().perform();
		act.dragAndDrop(source, target).build().perform();
		
		//dr.quit();

	}

}
