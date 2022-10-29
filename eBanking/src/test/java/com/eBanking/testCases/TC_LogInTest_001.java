//StepSecond:
//TC contain 3part:1>@BeforeClass:setUp():specify_prerequisite 
//2>@Test:test():steps 3>AfterClass:tearDown():exit activities
//For every test setUp() and tearDown() same
//so Create BaseClass and here i will put all common things/stuf which is required for every TC like above methods// 
//extends this BaseClass in every TC.
package com.eBanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.eBanking.pageObjects.LogInPage;

public class TC_LogInTest_001 extends BaseClass{
	
	@Test
	public void loginTest() throws IOException {
		//UnhandledAlertException: unexpected alert open:User or Password is not valid
		driver.get(baseURL);
		logger.info("url is open");
		
		LogInPage lp=new LogInPage(driver);
		
		lp.setUserName(username);
		logger.info("Entered UserName");
		
		lp.setPassword(password);
		logger.info("Entered Password");
		
		lp.clickSubmit();
		logger.info("clicked submit btn");
		
		if(driver.getTitle().equals("Guru99 Bank Home Page")) {
			Assert.assertTrue(true);
			logger.info("LogInTest_001 passed");
		}else {
			captureScreen(driver,"loginTest");//Call from BaseClass
			Assert.assertTrue(false);
			logger.info("LogInTest_001 failed");
		}		
	}
}
