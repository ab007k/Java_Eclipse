package e2.Calender;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class C1_Dropdown {
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
	//3.Time>Attendance>MyRecords	
		WebElement Time=dr.findElement(By.id("menu_time_viewTimeModule"));
		WebElement Attendance=dr.findElement(By.id("menu_attendance_Attendance"));
		WebElement MyRecords=dr.findElement(By.id("menu_attendance_viewMyAttendanceRecord"));
		
		//ActionsClass for MouseOver Action
		Actions act=new Actions(dr);
		act.moveToElement(Time).build().perform();
		act.moveToElement(Attendance).build().perform();
		act.moveToElement(MyRecords).click().build().perform();
	//4.open the calender view and select the date	
		WebElement Calender=dr.findElement(By.cssSelector("img.ui-datepicker-trigger"));
		Calender.click();
		
		//SelectClass for Dropdown Element
		WebElement Dropdown1=dr.findElement(By.cssSelector("select.ui-datepicker-month"));
		Select Month=new Select(Dropdown1);
		Month.selectByVisibleText("Aug");
		//Month.selectByValue("11");
		//Month.selectByIndex(0);
		
		WebElement Dropdown2=dr.findElement(By.cssSelector("select.ui-datepicker-year"));
		Select Year=new Select(Dropdown2);
		Year.selectByVisibleText("1947");
		
		WebElement Day=dr.findElement(By.linkText("15"));
		Day.click(); //how print the enter date
		
		

		
		
//		for(int i=1; i<=6;  i++) {
//			dr.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //move>>>foreward
//			//String st=dr.findElement(By.linkText("Aug")).getText(); //here this logic not work because of st contain all months
//			//if(st.equals("Aug")){}
//			if(i==6) {
//			
//				dr.findElement(By.linkText("15")).click();
//				//how print the enter date
//				break;
//			}
//		}
		
		//dr.close();
	}

}
