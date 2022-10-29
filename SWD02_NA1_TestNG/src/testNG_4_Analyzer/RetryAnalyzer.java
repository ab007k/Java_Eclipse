package testNG_4_Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{//org.testng.IRetryAnalyzer

	int counter=0;
	int retryLimit=3;
	
	public boolean retry(ITestResult result) {//org.testng.ITestResult
		if(counter<retryLimit) {
			counter++;
			return true;
		}
		return false;		
	}
}
