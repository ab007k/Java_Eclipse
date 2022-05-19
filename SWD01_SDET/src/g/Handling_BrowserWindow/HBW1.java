package g.Handling_BrowserWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HBW1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\chromedriver.exe");		
		WebDriver dr=new ChromeDriver(); //object creation for browser & then invoke the browser
		
//		System.setProperty("webdriver.gecko.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\geckodriver.exe");
//		WebDriver dr=new FirefoxDriver();
		
		//open url
		dr.get("https://demoqa.com/browser-windows"); 
		dr.findElement(By.id("tabButton")).click();
		
//		System.out.println(dr.getTitle());
		
		//getWH() return id/key value of browser/window and these are multiple<Set class> and type<String>
		Set <String> s=dr.getWindowHandles(); 
		System.out.println(s);
		
		//take one by one value form (s) and store it in (i) 
		for (String i:s) 
		{
			System.out.println(i);
			System.out.println(dr.getTitle());
			//switch from one windw to another and get the title and store it in (t)
			String t=dr.switchTo().window(i).getTitle(); 
			
			//use this logic for another url
//			if(t.contains("ToolsQA")) { 
//				dr.close();
//			}
			
		}
		dr.close(); //use for current window	
		dr.quit(); //use for all windows
	}

}
