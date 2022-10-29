package b.headless_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HT2_FireFox {
	public static void main(String[] args) {
		
		//set the driver server x_path
		System.setProperty("webdriver.gecko.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\geckodriver.exe");
		
		//set firefox as Headless
		FirefoxOptions op=new FirefoxOptions();
		op.setHeadless(true);
		//op.addArguments("--headless");
		
		//Instantiate FireFox driver
		WebDriver dr=new FirefoxDriver(op);
		
		dr.get("https://demo.nopcommerce.com/");
		System.out.println("Title of Page:>"+dr.getTitle());
		System.out.println("Url of Page:>"+dr.getCurrentUrl());	
		
	}

}
