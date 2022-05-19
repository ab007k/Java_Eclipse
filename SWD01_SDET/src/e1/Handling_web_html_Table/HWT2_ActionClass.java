//1.Open url:https://opensource-demo.orangehrmlive.com/index.php/auth/login
//2.LogIn(U:Admin,P:admin123)
//3.PIM>Employees List
//Retrive all the details from table.
package e1.Handling_web_html_Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HWT2_ActionClass {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\chromedriver.exe");
		WebDriver dr=new ChromeDriver(); //object creation for browser & then invoke the browser
//		System.setProperty("webdriver.gecko.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\geckodriver.exe");
//		WebDriver dr=new FirefoxDriver();
	//1.Open url			
		dr.get("https://opensource-demo.orangehrmlive.com/");
	//2.LogIn	
		dr.findElement(By.id("txtUsername")).sendKeys("Admin");
		dr.findElement(By.id("txtPassword")).sendKeys("admin123");
		dr.findElement(By.id("btnLogin")).click();
	//3.PIM>Employees List	
		WebElement PIM=dr.findElement(By.id("menu_pim_viewPimModule"));
		WebElement EmpList=dr.findElement(By.id("menu_pim_viewEmployeeList"));
		
		//ActionsClass for MouseOver Action
		Actions act=new Actions(dr);
		act.moveToElement(PIM).build().perform();
		act.moveToElement(EmpList).click().build().perform();
		
		int r=dr.findElements(By.xpath("//tbody[1]/tr")).size();
		System.out.println(r);
		
		int c=dr.findElements(By.xpath("//tbody[1]/tr[1]/td")).size();
		System.out.println(c);
		for(int hr=1; hr==1; hr++) {
			for(int hc=2; hc<=6; hc++) {				
				System.out.print(dr.findElement(By.xpath("//thead[1]/tr["+hr+"]/th["+hc+"]")).getText()+"<> ");
			}
			System.out.println();
		}
		for(int br=2; br<=r; br++) {
			for(int bc=2; bc<=c; bc++) {				
				System.out.print(dr.findElement(By.xpath("//tbody/tr["+br+"]/td["+bc+"]")).getText()+"<> ");
			}
			System.out.println();
		}		
		dr.close();
	}
		
}
