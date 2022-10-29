package com.eBanking.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.eBanking.pageObjects.LogInPage;
import com.eBanking.utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass {
	//2//This test method will take the data from @DataProvider Annotation
	//here we need to specify one Parameter for @Test(dataProvider="LoginData") 
	@Test(dataProvider="LoginData")
	public void loginDDT(String user,String  pwd) throws InterruptedException {
		LogInPage lp=new LogInPage(driver);
		lp.setUserName(user);
		logger.info("username provided");
		lp.setPassword(pwd);
		logger.info("password provided");
		lp.clickSubmit();	
		Thread.sleep(3000);		
		//4//
		//Failure Case
		if(isAlertPresent()==true) {
			driver.switchTo().alert().accept();//close alert
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);//failed TC
			logger.warning("Login failed");
		}
		//Passed Case
		else {
			Assert.assertTrue(true);//Passed TC
			logger.info("Login passed");
			Thread.sleep(3000);
			lp.clickLogout();
			driver.switchTo().alert().accept();//close logout alert
			driver.switchTo().defaultContent();
		}	
	}//same method will be repeat again and again mulitiple times
	
	//3//User defined method created to check alert is present or not
	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		}
		catch(NoAlertPresentException e){
			return false;
		}
	}
	
	//1//First Implement getData() method
	//Take the data from LoginData.xlsx
	//Store that into two dimentional Array
	//&Finally it will returns the two dimentional Array to Actual TC
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException{
		//Where is my xl or test data file present//
		String path=System.getProperty("user.dir")+"/src/test/java/com/eBanking/testData/LoginData.xlsx";
		
		//count no of rows and col//
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path, "Sheet1", 1);
		
		//We need to create 2dim Array to store the data that data taken from xl file
		//How much size:same size:no rows and col==xl file
		String logindata[][]=new String [rownum][colcount];
		
		//Read data from xl and put in 2 dim Array
		for(int i=1;i<=rownum;i++) {//i=1 because neglate header part//
			for(int j=0;j<colcount;j++) {//i=1 and j=0 so we take j<colcount//
			//A:0 0 < X:1,0//
			//A:r=i-1 c=j < xl:r=i c=j//
				logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);//1,0
			}
			
		}
		return logindata; //return the 2dim Array//
	}

}
