package c.method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class M4_conditionalCommand {
	public static void main(String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\chromedriver.exe");
		WebDriver dr=new ChromeDriver(); //object creation for browser & then invoke the browser
		
//--------------------------------part>1----------------------------------------------------------------------						
		dr.get("https://www.fb.com"); //open the URL
		
		WebElement email=dr.findElement(By.xpath("//*[@id='email']"));
		WebElement pass=dr.findElement(By.xpath("//*[@id='pass']"));
		
		if(email.isDisplayed() && email.isEnabled()) {
			email.sendKeys("janeman@gmail.com");
		}
		
		if(pass.isDisplayed() && pass.isEnabled()) {
			pass.sendKeys("merijan");
		}
		
		//for visible entered password..
		WebElement u=dr.findElement(By.xpath("//a[1]/div[1]/div[1]"));//for visible entered password..
		u.click();
		Thread.sleep(3000);
//--------------------------------part>2----------------------------------------------------------------------		
		
		dr.get("https://www.facebook.com/reg/");
		
		//female
		System.out.println(dr.findElement(By.xpath("//span[1]/span[1]/input[1]")).isSelected());
		
		//male
		System.out.println(dr.findElement(By.xpath("//span[1]/span[2]/input[1]")).isSelected());
		
		//custom
		System.out.println(dr.findElement(By.xpath("//span[1]/span[3]/input[1]")).isSelected());
		
		//select for female radio button
		if(dr.findElement(By.xpath("//span[1]/span[1]/input[1]")).isSelected()==false) {
			dr.findElement(By.xpath("//span[1]/span[1]/input[1]")).click();
			System.out.println(dr.findElement(By.xpath("//span[1]/span[1]/input[1]")).isSelected());
			
		}
		
		dr.close();
	}

}
