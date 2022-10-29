package e2.Calender;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class C2 {
	@SuppressWarnings("deprecation")
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();//To Avoid ElementClickInterceptedException
		dr.get("https://demos.telerik.com/kendo-ui/datetimepicker/index");
		//dr.get("http://127.0.0.1/login.jsp");

		//ElementClickInterceptedException:>Failed to load resource: the server responded with a status of 403 ()
		WebElement Calender=dr.findElement(By.xpath("//span[@class='k-icon k-i-calendar k-button-icon']"));
		Calender.click();
		
		//Select Date of Current Year
		for(int i=5;i>0;i--) {
			//Alert: This element is not interactable through selenium(automation) as it is not visible in UI.Try any near by element. 
			//ElementNotInteractableException//ElementClickInterceptedException
			WebDriverWait wait1= (new WebDriverWait(dr, 10));
			wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='k-icon k-i-arrow-60-right']")));
			dr.findElement(By.xpath("//span[@class='k-icon k-i-arrow-60-right']")).click();			
		}
		WebDriverWait wait2= (new WebDriverWait(dr, 5));
		wait2.until(ExpectedConditions. invisibilityOfElementLocated(By.xpath("//a[contains(text(),'August 2022')]")));
		String my=dr.findElement(By.xpath("//a[contains(text(),'August 2022')]")).getText();//a[normalize-space()='December 2022']
		if(my.equals("August 2022")) {
			WebDriverWait wait3= (new WebDriverWait(dr, 10));
			wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'15')]")));
			dr.findElement(By.xpath("//a[contains(text(),'15')]")).click();//a[normalize-space()='15'
		}
	}
}
