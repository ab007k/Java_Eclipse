package i.ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AC2_rightClick {
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\chromedriver.exe");
		WebDriver dr=new ChromeDriver(); //object creation for browser & then invoke the browser
		
		dr.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		dr.manage().window().maximize();
		dr.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		//identify element
		WebElement RightClickMe=dr.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		//ActionClass
		Actions act=new Actions(dr);
		//RightClick on element
		act.contextClick(RightClickMe).build().perform();
		//Click on copy options
		dr.findElement(By.xpath("//body/ul[1]/li[3]")).click();
		
		//Switch to AlertBox and Capture the Text
		String Text=dr.switchTo().alert().getText();
		System.out.println(Text);
		//Close the AlertBox
		dr.switchTo().alert().accept();	
		
		dr.quit();

	}

}
