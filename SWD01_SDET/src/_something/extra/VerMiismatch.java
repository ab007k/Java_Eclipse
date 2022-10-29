//if ver mismatch http://jar-download.com/artifact-search/webdrivermanager/ download and add 
//use "WebDriverManager" statement instead of "System" statement,it will do everything for you,
//you don't worry about the chrome driver and chrome browser version
//this will handles the everythings automatically and you are free
					
package _something.extra;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerMiismatch {	
		public static void main(String[] args) {
			//System.setProperty("webdriver.chrome.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\chromedriver.exe");//dr loading statement
			WebDriverManager.chromedriver().setup(); //use instead of above
			
			WebDriver dr=new ChromeDriver();
			
			dr.get("https://www.phptravels.net/");
			
			dr.findElement(By.xpath("//input[@id='checkin']")).click();
		}
}
