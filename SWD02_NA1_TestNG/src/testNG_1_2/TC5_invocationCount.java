package testNG_1_2;

import org.testng.annotations.Test;

public class TC5_invocationCount {
  @Test(invocationCount=10)
  public void sum() {
	  int a=10;
	  int b=20;
	  int c=a+b;
	  System.out.println("sum is:>"+c);
  }
}
