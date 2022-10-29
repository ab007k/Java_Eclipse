package com.TestNG08runFailedTC01;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.AfterTest;

public class FailedTestRunner {
	
	@AfterTest
	public void runFailedTC() {

		TestNG obj=new TestNG();

		List<String>list=new ArrayList<String>();

		list.add("D:\\@Qspider\\Java_Eclipse\\SWD04_ATI_TestNG\\test-output\\SuiteRunFailedTC\\testng-failed.xml");

		obj.setTestSuites(list);

		obj.run();

	}

}
