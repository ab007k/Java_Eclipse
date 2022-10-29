package testNG_3ParametersAnno_PropertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class TC2_ReadPropertiesFile {
	
	static WebDriver dr;
	
	public static void main(String[]args) throws IOException {
		//1//java.util.Properties//
		Properties pr=new Properties();
	
		
		//2//java.io.FileInputStream//
		FileInputStream ip=new FileInputStream("D:\\@Qspider\\Java_Eclipse\\SWD_TestNG_NaveenA\\src\\testNG_3\\config.properties");
		
		//3//
		pr.load(ip);
		
		//4//
		System.out.println(pr.getProperty("name"));
		
		System.out.println(pr.getProperty("age"));

		String url=pr.getProperty("URL");
		System.out.println(url);
		
		String browserName=pr.getProperty("browser");
		System.out.println(browserName);
		
	}

}
