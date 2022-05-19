/*TestCase
 >Open the browser
 >Open url "https://demo.guru99.com/test/newtours/index.php"
 >Enter UserName
 >Enter Password
 >Click on OK
 >Check the page title
 */
package a.basic_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BT1_Chrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\chromedriver.exe");
		WebDriver dr=new ChromeDriver(); //object creation for browser & then invoke the browser
		
//		dr.get("http://www.amazon.com");
//		System.out.println(dr.getTitle());
//		dr.quit();
		
		dr.get("https://demo.guru99.com/test/newtours/index.php"); //open URL in browser
		
		dr.manage().window().maximize(); //maximize the browser window
		
		dr.findElement(By.name("userName")).sendKeys("mercury"); //find UserName element and enter username
		dr.findElement(By.name("password")).sendKeys("password"); //find Password element and enter password
		dr.findElement(By.name("submit")).click(); //find element and click on Submit button/link
		
		//String exp_title="Login: Mercury Tours"; //passed
		String exp_title="Welcome: Mercury Tours"; //Take title from source code //failed
		String act_title=dr.getTitle(); //return the "title of page"
		System.out.println("exp_title:>"+exp_title);
		System.out.println("act_title:>"+act_title);
		
		//validation
		if(exp_title.equals(act_title))    //;
		{
			System.out.println("passed");			
		}
		else {
			System.out.println("Failed");	
		}
		dr.close();	//close the browser	
	}

}
