package j.RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RC1_OSdownloadpopup {
	
	public static void main(String[]args) throws AWTException {
		System.setProperty("webdriver.gecko.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\geckodriver.exe");
		WebDriver dr=new FirefoxDriver();//chrome:no download popup
		
		dr.get("");
		dr.manage().window().maximize();
		dr.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		dr.findElement(By.xpath("")).click();
		
		//RobotClass//
		Robot robot=new Robot();
		/*
		 * DownArrowKey
		 * 3times TabKey
		 * EnterKey
		 */
		robot.keyPress(KeyEvent.VK_DOWN);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		dr.quit();
	}
}
