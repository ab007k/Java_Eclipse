//1.open url:https://opensource-demo.orangehrmlive.com/index.php/auth/login
//2.LogIn(U:Admin,P:admin123)
//3.Admin>usermanagement>user
//validation:count no of user are enable?
package i.ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AC1_mouseover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\chromedriver.exe");
		WebDriver dr=new ChromeDriver(); //object creation for browser & then invoke the browser
//		System.setProperty("webdriver.gecko.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\geckodriver.exe");
//		WebDriver dr=new FirefoxDriver();
				
		dr.get("https://opensource-demo.orangehrmlive.com/");
		
		//LogIn
		dr.findElement(By.id("txtUsername")).sendKeys("Admin");
		dr.findElement(By.id("txtPassword")).sendKeys("admin123");
		dr.findElement(By.id("btnLogin")).click();
		
		//Admin>User>UserManagement>Users
		//First find that Element by xpath or some other locators
		WebElement Admin=dr.findElement(By.id("menu_admin_viewAdminModule"));
		WebElement UserM=dr.findElement(By.id("menu_admin_UserManagement"));
		WebElement User=dr.findElement(By.id("menu_admin_viewSystemUsers"));
		
		//Action
		Actions act=new Actions(dr);
//		act.moveToElement(Admin).build().perform(); //mouseover to admin tab
//		Thread.sleep(3000);
//		act.moveToElement(UserM).build().perform(); //mouseover to UserM tab
//		Thread.sleep(3000);
//		act.moveToElement(User).click().build().perform(); //mouseover to User and click the option.
		
		//One line code for above three step
		act.moveToElement(Admin).moveToElement(UserM).moveToElement(User).click().build().perform();
		
		//validation:count no of user are enable?
		int r=dr.findElements(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr")).size();
		
		int statuscount=0;
		for(int i=1; i<=r; i++) {
			String status=dr.findElement(By.xpath("//*[@id='resultTable']/tbody/tr["+i+"]/td[5]")).getText();
			
			if(status.equals("Enabled")) {
				statuscount++;				
			}
		}
		System.out.println("No of employess Enabled:"+statuscount);
		//dr.close();  //not work for FireFox
		dr.quit();
	}
	

}
