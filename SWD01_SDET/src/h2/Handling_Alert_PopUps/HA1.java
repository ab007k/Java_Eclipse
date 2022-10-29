package h2.Handling_Alert_PopUps;
/*
 	<Method/Command>
  	dr.switchTo().alert().getText();
	dr.switchTo().alert().accept();
	dr.switchTo().alert().dismiss();
	dr.switchTo().alert().sendKeys(null);
 */
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HA1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		
		dr.get("http://demo.automationtesting.in/Alerts.html");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	//1//AlertBox with OK button	
		
		//Alert with OK Link
		dr.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		//Alert with OK Button
		dr.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]")).click();
		
		//Switch to AlertBox and getText()
		String AlertMsg=dr.switchTo().alert().getText();
		System.out.println(AlertMsg);
		
		//Switch to AlertBox and click OK button and close the AlertBox
		dr.switchTo().alert().accept();
		
	//2//Alert with OK and Cancel button 
		
		//Alert with OK & Cancel Link
		dr.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
		
		//OK//
		//Alert with OK & Cancel Button 
		dr.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]")).click();
		
		//Switch to AlertBox and Click OK button and close the AlertBox
		dr.switchTo().alert().accept();
		
		String ExpOKmsg="You pressed Ok";
		String ActOKmsg=dr.findElement(By.id("demo")).getText();
		System.out.println(ActOKmsg);
		
		if(ExpOKmsg.equals(ActOKmsg)==true) {
			System.out.println("TestPass");
		}else {
			System.out.println("Testfail");	
		}
		
		//Cancel//
		//Alert with OK & Cancel Button 
		dr.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]")).click();
				
		//Switch to AlertBox and Click OK button and close the AlertBox
		dr.switchTo().alert().dismiss();
				
		String ExpCancelMsg="You Pressed Cancel";
		String ActCancelMsg=dr.findElement(By.id("demo")).getText();
		System.out.println(ActCancelMsg);
				
		if(ExpCancelMsg.equals(ActCancelMsg)==true) {
					System.out.println("TestPass");
				}else {
					System.out.println("Testfail");	
				}
		
	//3//Alert with TextBox
		dr.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		//a//
		dr.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box')]")).click();
		
		dr.switchTo().alert().sendKeys("JayHo");
		dr.switchTo().alert().accept();
		
		String ExpMsg="Hello JayHo How are you today";
		String ActMsg=dr.findElement(By.xpath("//p[@id='demo1']")).getText();
		System.out.println(ActMsg);
		
		if(ExpMsg.equals(ActMsg)==true) {
					System.out.println("TestPass");
				}else {
					System.out.println("Testfail");	
				}
		//b//
		dr.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box')]")).click();
		
		dr.switchTo().alert().sendKeys("JayHo");
		dr.switchTo().alert().dismiss();
	
		
	}

}
