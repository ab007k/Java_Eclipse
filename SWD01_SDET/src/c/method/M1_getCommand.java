/*getCommand
 * get()
 * getTitle()
 * getCurrentUrl()
 * getText()
 * getPageSource()
 */
package c.method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class M1_getCommand {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\chromedriver.exe");
		WebDriver dr=new ChromeDriver(); //object creation for browser & then invoke the browser
		
		
		dr.get("https://demo.guru99.com/test/newtours/"); //open the URL
		
		System.out.println(dr.getTitle()); //return the Title of Page
		
		System.out.println(dr.getPageSource());//return PageSource
		
		System.out.println(dr.getCurrentUrl()); //return the URL
		
		String text=dr.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[1]/td/font/b"))
		.getText(); //return the text value of element
		
		System.out.println(text);
		
		dr.close(); //close current window
		//dr.quit(); //close/quit multiple windows
	}

}
