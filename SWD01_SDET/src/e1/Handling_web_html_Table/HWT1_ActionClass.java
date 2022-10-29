//1.open url:https://opensource-demo.orangehrmlive.com/index.php/auth/login
//2.LogIn(U:Admin,P:admin123)
//3.Admin>usermanagement>user
//4.validation:count no of user are enable?

package e1.Handling_web_html_Table;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HWT1_ActionClass {

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
	//3.Admin>usermanagement>user	
		WebElement Admin=dr.findElement(By.id("menu_admin_viewAdminModule"));
		WebElement UserM=dr.findElement(By.id("menu_admin_UserManagement"));
		WebElement User=dr.findElement(By.id("menu_admin_viewSystemUsers"));
		
		//ActionsClass for MouseOver Action
		Actions act=new Actions(dr);
		act.moveToElement(Admin).build().perform();
		act.moveToElement(UserM).build().perform();
		act.moveToElement(User).click().build().perform();
	//4.validation:count no of user are enable?	
		//xpath from table
		//for count no of row:>
		//Take Absolute xpath of last row(take first or any col)
		//:>/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr[45]/td[2]/a[1]
		//Realtive xpath:>//tbody[1]/tr
	
		//for count no of column:>
		//Take Absolute xpath of first row(take first or any col)
		//tbody:>/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/a[1]
		//Realtive xpath:>//tbody[1]/tr[1]/td
		//thead:>/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[4]/table[1]/thead[1]/tr[1]/th[2]/a[1]
		//Realtive xpath:>//thead[1]/tr[1]/th	
		int r=dr.findElements(By.xpath("//tbody[1]/tr")).size();
		System.out.println(r);
		
		int c=dr.findElements(By.xpath("//tbody[1]/tr[1]/td")).size();
		System.out.println(c);
	
		int statuscount=0;
		for(int i=1; i<=r; i++) {
			String status=dr.findElement(By.xpath("//tbody[1]/tr["+i+"]/td[5]")).getText();
			
			if(status.equals("Enabled")) {
				statuscount+=1;				
			}
		}
		System.out.println("No of employess Enabled:"+statuscount);
		
		dr.quit();
		//note:dr.close();  //not work for FireFox

	}

}
