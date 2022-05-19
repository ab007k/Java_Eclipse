package b.headless_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HT1_Chrome {

	public static void main(String[] args) {
		
		//set the driver server x_path
		System.setProperty("webdriver.chrome.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\chromedriver.exe");
		
		//set chrome as Headless
		ChromeOptions op=new ChromeOptions();
		op.setHeadless(true);
		//op.addArgument(--headless);

		//Instantiate chrome driver
		WebDriver dr=new ChromeDriver(op); //Remember to pass ref var
		
		dr.get("https://demo.nopcommerce.com/");
		System.out.println("Title of Page:>"+dr.getTitle());
		System.out.println("Url of Page:>"+dr.getCurrentUrl());	
		
		dr.close();
	}
}
