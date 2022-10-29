package h1.Handling_Frames_IFrames;
/*
 *List<WebElement> iFrame=dr.findElements(By.tagName("iframe"));
 *dr.switchTo().frame("id/index");
 *dr.switchTo().frame("name");
 *dr.switchTo().frame(WEiframe);
 *dr.switchTo().parentFrame();
 *dr.switchTo().defaultContent();	
 */
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HF1 {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		
//		System.setProperty("webdriver.gecko.driver", "D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\geckodriver.exe");
//		WebDriver dr=new FirefoxDriver();
		
		//dr.get("https://demoqa.com/frames");
		dr.get("http://demo.automationtesting.in/Frames.html");
			
		dr.manage().window().maximize();//>>no need  of this statement if you are use FireFox:It will maximize Automatically.
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Finding all iframe on WebPage
		List<WebElement> iFrame=dr.findElements(By.tagName("iframe"));
		int NoOfiFrame=iFrame.size();
		System.out.println("No of iFrame:>"+NoOfiFrame);
			
//		//1//Switch to the iframe using the id or index value
//		dr.switchTo().frame("singleframe");	
//		WebElement TextBox=dr.findElement(By.xpath("//input[@type='text']"));//iframeXpath:>iframe[@id='singleframe'] //cssSt:>input[type='text']
//		TextBox.sendKeys("jayhari");
		
//		//2//Switch to the iframe using the name
//		dr.switchTo().frame("SingleFrame");	
//		WebElement TextBox=dr.findElement(By.xpath("//input[@type='text']"));//iframeXpath:>iframe[@id='singleframe'] //cssSt:>input[type='text']
//		TextBox.sendKeys("JayHari");
				
		//3//Switch to the iframe using the WebElement:iframe
		WebElement iframe=dr.findElement(By.id("singleframe"));//iframeXpath:>iframe[@id='singleframe'] //cssSt:>input[type='text']	
		dr.switchTo().frame(iframe);		
		WebElement TextBox=dr.findElement(By.xpath("//input[@type='text']"));//iframeXpath:>iframe[@id='singleframe'] //cssSt:>input[type='text']
		TextBox.sendKeys("Krushna");
				
		//Switch back to Parent or Ancestor Frame
		dr.switchTo().parentFrame();
		
		//Switch back to main Frame (WebPage)
		dr.switchTo().defaultContent();

		//dr.quit();		
	}
}
