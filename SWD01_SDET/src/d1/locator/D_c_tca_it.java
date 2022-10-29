package d1.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D_c_tca_it {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://www.facebook.com/");
		//locating by tag & class
		dr.findElement(By.cssSelector("input.inputtext _55r1 _6luy")).sendKeys("dil_mere_bata_kaha_hai_tu.2"); //Email or Phone TextBox		
		dr.findElement(By.cssSelector("input.inputtext _55r1 _6luy _9npi")).sendKeys("tere_aaspass.2");  //Password TextBox
		
		dr.get("https://www.facebook.com/");
		//locating by tag & class & attribute
		dr.findElement(By.cssSelector("input.inputtext _55r1 _6luy[placeholder=\"Email address or phone number\"]")).sendKeys("dil_mere_bata_kaha_hai_tu.4"); //Email or Phone TextBox		
		dr.findElement(By.cssSelector("input.inputtext _55r1 _6luy _9npi[placeholder=\"Password\"]")).sendKeys("tere_aaspass.4");  //Password TextBox
	
		dr.get("https://www.facebook.com/pages/create/?ref_type=registration_form");
		//locating by innertext
		dr.findElement(By.cssSelector("span:contains(Business or brand)"));	
		
		dr.close();
	}

}
