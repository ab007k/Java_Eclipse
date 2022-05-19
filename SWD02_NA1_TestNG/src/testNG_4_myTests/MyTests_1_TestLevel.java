package testNG_4_myTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTests_1_TestLevel {
	
  @Test(retryAnalyzer=testNG_4_Analyzer.RetryAnalyzer.class)
  public void Test1() {
	  Assert.assertEquals(false, true);
  }
  
  @Test(retryAnalyzer=testNG_4_Analyzer.RetryAnalyzer.class)
  public void Test2() {
	  Assert.assertEquals(false, true);
  }
}
