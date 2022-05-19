package testNG_6_TestNGListnerConcept;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class _3CustomListener extends _2Base_ScreenshotLogic implements ITestListener{
	@Override
	public void onTestStart(ITestResult result) {
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("FailedTest");
		failed(result.getMethod().getMethodName());
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

}
