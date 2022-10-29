package l.JavaScriptExecutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {
	public static void main(String[]args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://www.twoplugs.com/");
		
		dr.manage().window().maximize();
		dr.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
		
		//Identify WebElement//
		WebElement JoinNowForFree=dr.findElement(By.xpath("//header/div[1]/ul[1]/li[2]/a[1]"));
		
//		//1:Flashing//
//		JavaScriptUtil.flash(JoinNowForFree, dr);
		
//		//2:DrawBorder//
//		JavaScriptUtil.drawBorder(JoinNowForFree, dr);
//		
//		//3*:TakeScreenshot//java.io.File//org.openqa.selenium.TakesScreenshot//org.openqa.selenium.OutputType//
//		File src=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
//		File trg=new File("D:\\@Qspider\\AutoIT_file\\twoplugs.png");
//		//org.apache.commons.io.FileUtils
//		FileUtils.copyFile(src,trg);
		
//		//4:CaptureTitleOfPage//
//		//WebDriver
//		System.out.println(dr.getTitle());
//		//JavaScriptExecutor
//		String title=JavaScriptUtil.getTitleByJs(dr);
//		System.out.println(title);
		
//		//5:ClickingOnElement//
//		WebElement LogInBtn=dr.findElement(By.xpath("//header/div[1]/ul[1]/li[1]/a[1]"));
//		//WebDriver//
//		LogInBtn.click();
//		//JavaScriptExecutor//
//		JavaScriptUtil.clickElementByJs(LogInBtn, dr);
		
//		//6:GenerateAlert//
//		JavaScriptUtil.generateAlert(dr, "You are Great,u generate Alert Successfully!!!");
//		
//		//7:RefreshBrowserPage//
//		//WebDriver
//		dr.navigate().refresh();
//		JavaScriptUtil.refreshBrowserByJs(dr);
		
		//8a:ScrollDownUptoSelectedElement//
		WebElement img=dr.findElement(By.xpath("//img[@src='/newlayout/images/screen.png']"));
		JavaScriptUtil.scrollIntoView(img, dr);
		
		//8b:ScrollDownPageTillEnd//
		JavaScriptUtil.scrollPageDown(dr);		
	}
	
}
