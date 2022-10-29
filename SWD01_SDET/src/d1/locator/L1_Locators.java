package d1.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L1_Locators {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://www.facebook.com/");
		
		//locating by id
		dr.findElement(By.id("email")).sendKeys("dil_mere_bata_kaha_hai_tu"); //Email or Phone TextBox
		
		//locating by name
		dr.findElement(By.name("pass")).sendKeys("tere_aaspass"); //Password TextBox
		
		//locating by linkText
		dr.findElement(By.linkText("Forgotten password?")).click(); //Forgotten password? link
			
		//cssSelector
		dr.get("https://www.facebook.com/");
		//locating by tag & id
		dr.findElement(By.cssSelector("input#email")).sendKeys("dil_mere_bata_kaha_hai_tu.1"); //Email or Phone TextBox		
		dr.findElement(By.cssSelector("input#pass")).sendKeys("tere_aaspass.1");  //Password TextBox
		
//		dr.get("https://www.facebook.com/");
//		//locating by tag & class
//		dr.findElement(By.cssSelector("input.inputtext _55r1 _6luy")).sendKeys("dil_mere_bata_kaha_hai_tu.2"); //Email or Phone TextBox		
//		dr.findElement(By.cssSelector("input.inputtext _55r1 _6luy _9npi")).sendKeys("tere_aaspass.2");  //Password TextBox
		
		dr.get("https://www.facebook.com/");
		//locating by tag & attribute
		dr.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("dil_mere_bata_kaha_hai_tu.3"); //Email or Phone TextBox		
		dr.findElement(By.cssSelector("input[id=pass]")).sendKeys("tere_aaspass.3");  //Password TextBox
		
//		dr.get("https://www.facebook.com/");
//		//locating by tag & class & attribute
//		dr.findElement(By.cssSelector("input.inputtext _55r1 _6luy[placeholder=\"Email address or phone number\"]")).sendKeys("dil_mere_bata_kaha_hai_tu.4"); //Email or Phone TextBox		
//		dr.findElement(By.cssSelector("input.inputtext _55r1 _6luy _9npi[placeholder=\"Password\"]")).sendKeys("tere_aaspass.4");  //Password TextBox
	
		dr.get("https://www.facebook.com/pages/create/?ref_type=registration_form");
		//locating by innertext
		dr.findElement(By.cssSelector("span:contains(Business or brand)"));	
		
		dr.close();
		
	}
}
