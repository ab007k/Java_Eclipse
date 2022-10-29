package testNG_1_2;

import org.testng.annotations.Test;

public class TC4_dependsOnMethods {
  @Test
  public void logInTest() {
	  System.out.println("logINTest");
	  int i=9/0;
  }
  
  @Test(dependsOnMethods="logInTest")
  public void homePageTest() {
	  System.out.println("homePageTest");
  }
  
  @Test(dependsOnMethods="logInTest")
  public void searchPageTest() {
	  System.out.println("searchPageTest");
  }
  
  @Test(dependsOnMethods="logInTest")
  public void regPageTest() {
	  System.out.println("regPageTest");
  }
}
