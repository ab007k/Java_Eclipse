package testNG_1_2;

import org.testng.annotations.Test;

public class TC6_expectedException {
  @Test(expectedExceptions=NumberFormatException.class)
  public void handleException() {
	  String x="100A";
	  Integer.parseInt(x);	  
  }
}
