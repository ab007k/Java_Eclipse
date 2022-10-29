package a.assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckFB_Title {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://www.facebook.com");
		String exp_title="Facebook – log in or sign up";
		String act_title=dr.getTitle();
		System.out.println("exp_title:>"+exp_title);
		System.out.println("act_title:>"+act_title);
		
		if (exp_title.equals(act_title)){
			System.out.println("passed");
		}
		else {
			System.out.println("failed");
		}
		dr.close();		
	}

}
