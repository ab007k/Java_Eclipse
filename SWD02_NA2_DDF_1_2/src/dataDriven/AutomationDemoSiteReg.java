package dataDriven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import excelUtility.Xls_Reader;

public class AutomationDemoSiteReg {

	public static void main(String[] args) {
	//Webdriver code:		
		System.setProperty("webdriver.chrome.driver","D:\\@Qspider\\@SOFTWARE\\Java\\Drivers\\chromedriver.exe");
		WebDriver dr=new ChromeDriver(); //object creation for browser & then invoke the browser
		dr.manage().window().maximize();
		dr.get("http://demo.automationtesting.in/Register.html");
	//DataDrivenApproach(parameterization):>used to Create DDF:driving data from excel!	
		Xls_Reader reader=new Xls_Reader("D:\\@Qspider\\Java_Eclipse\\SWD_NA2_DDF_TestNG\\src\\testData\\AutomationDemoSite.xlsx");
		int rowCount=reader.getRowCount("RegTestData");
		System.out.println(rowCount);
		
	//Add col...cont.at the loop end
		reader.addColumn("RegTestData", "Status");
		
	//Parameterization
		//getData from excel:
		for	(int rowNum=2;rowNum<=rowCount;rowNum++) {
		
			System.out.println("=======================");
			
			String FirstName=reader.getCellData("RegTestData","FirstName",rowNum);
			System.out.println(FirstName);
				
			String LastName=reader.getCellData("RegTestData","LastName",rowNum);
			System.out.println(LastName);
			
			String Address=reader.getCellData("RegTestData","Address",rowNum);
			System.out.println(Address);
				
			String Email=reader.getCellData("RegTestData","Email",rowNum);
			System.out.println(Email);
				
			String Phone=reader.getCellData("RegTestData","Phone",rowNum);
			System.out.println(Phone);
						
			String Language=reader.getCellData("RegTestData","Language",rowNum);
			System.out.println(Language);
				
			String Skill=reader.getCellData("RegTestData","Skill",rowNum);
			System.out.println(Skill);
			
			//enterData:
			WebElement eFirstName=dr.findElement(By.xpath("//input[@placeholder='First Name']"));
			eFirstName.clear();
			eFirstName.sendKeys(FirstName);
			
			WebElement eLastName=dr.findElement(By.xpath("//input[@placeholder='Last Name']"));
			eLastName.clear();
			eLastName.sendKeys(LastName);
			
//			WebElement eAddress=dr.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-valid ng-touched']"));
//			eAddress.clear();
//			eAddress.sendKeys(Address);
			
			WebElement eEmail=dr.findElement(By.xpath("//input[@type='email']"));
			eEmail.clear();
			eEmail.sendKeys(Email);
			
			//InvalidElementStateException
//			WebElement ePhone=dr.findElement(By.xpath("//input[@type='tel']"));
//			ePhone.clear();
//			ePhone.sendKeys(Phone);
			
//			WebElement eLanguage=dr.findElement(By.xpath("//div[@id='msdd']"));
//			eLanguage.clear();
//			eFirstName.sendKeys(Language);

			Select s=new Select(dr.findElement(By.xpath("//select[@id='Skills']")));
			s.selectByValue(Skill);	
			
			//Set data
			reader.setCellData("RegTestData", "Status", rowNum, "Pass");
		}		

	}

}
