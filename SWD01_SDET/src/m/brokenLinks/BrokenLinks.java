package m.brokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	public  static void main(String[]args) throws IOException{//MalformedURLException:ReplaceBy>IOException
		//Initiate Driver
		System.setProperty("webdriver.chrome.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\chromedriver.exe");
		WebDriver dr=new ChromeDriver(); 
		
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		//Open Url
		dr.get("https://demo.guru99.com/test/newtours/");
		
		//Capture links from the WebPage
		List<WebElement>links=dr.findElements(By.tagName("a"));
		
		//No of Links
		System.out.println(links.size());
		
		//By using "href" attribute we can get URL of required link
		for(int i=0;i<links.size();i++) {
			WebElement element=links.get(i);
			String url=element.getAttribute("href");
			
			//java.net.URL//java.net.MalformedURLException//
			URL link=new URL(url);
			
			//Create Connection using URL object 'link'
			//java.net.HttpURLConnection//java.io.IOException//
			HttpURLConnection httpConn=(HttpURLConnection) link.openConnection();
			
			//Established Connection
			httpConn.connect();
			
			//return responce code,if res code is above 400:broken
			int rescode=httpConn.getResponseCode();
			
			if(rescode>=400) {
				System.out.println(url+"-"+"is broken link");
			}else {
				System.out.println(url+"-"+"is valid link");
			}
						
		}
		
	}

}
