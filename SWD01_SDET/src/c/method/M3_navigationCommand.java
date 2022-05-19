package c.method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class M3_navigationCommand {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\chromedriver.exe");
		WebDriver dr=new ChromeDriver(); //object creation for browser & then invoke the browser
		
	//1
		dr.get("https://demo.guru99.com/test/newtours/"); //open the URL
		System.out.println(dr.getTitle());
	//2	
		dr.navigate().to("https://www.fb.com");
		System.out.println(dr.getTitle());
	//3	
		dr.navigate().back();
		System.out.println(dr.getTitle());
	//4	
		dr.navigate().forward();
		System.out.println(dr.getTitle());
	//5	
		dr.navigate().refresh();
		
		dr.close();
	}

}
