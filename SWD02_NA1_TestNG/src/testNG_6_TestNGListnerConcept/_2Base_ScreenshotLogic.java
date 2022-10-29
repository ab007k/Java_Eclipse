package testNG_6_TestNGListnerConcept;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class _2Base_ScreenshotLogic {
	
	public static WebDriver dr;

	public static void initialization() {
		
		 System.setProperty("webdriver.chrome.driver", "D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\chromedriver.exe");
		  dr=new ChromeDriver();//upcasting
		  dr.manage().window().maximize();
		  dr.manage().deleteAllCookies();
		  dr.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
		  dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  dr.get("http://www.google.com");
	}

	public void failed(String testMethodName) {
		File srcFile=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(srcFile,new File("D:\\@Qspider\\Java_Eclipse\\SWD_TestNG_NaveenA\\screenshot\\"+testMethodName+".png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
//	public void failed(String testMethodName) throws IOException {
//		TakesScreenshot ts=(TakesScreenshot)dr;
//		File src=ts.getScreenshotAs(OutputType.FILE);
//		File dest=new File("./screenshot/"+testMethodName+".png");
//		Files.copy(src,dest);
//	}
}
