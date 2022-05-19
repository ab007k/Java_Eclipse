package testNG_5_SoftAssert_HardAssert;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TC1_HA_SA {
	//Cannot make a static reference to the, 
	//non-static method assertEquals(boolean, boolean), 
	//from the type Assertion//(SoftAssert.assertEquals(false, true);)//
	
	//Create new instance of Object SoftAssert		
	//SoftAssert softAssert = new SoftAssert();
	//because of only one instance,it will show previous testResult in nextTestResult,
	//So To Avoid this SolutionForThat we need to create separate instance for each TestCase.

	@Test
	public void test1() {
		SoftAssert softAssert1 = new SoftAssert();
		System.out.println("OpenBrowser");		
		Assert.assertEquals(true, true);//HardAssert:RightPlace
			
		System.out.println("EnterUsername");
		System.out.println("EnterPassword");
		System.out.println("ClickOnSignInButton");		
		Assert.assertEquals(true, true);//HardAssertion:RightPlace
		
		System.out.println("ValidateHomePage");
		//Assert.assertEquals(false, true);//HardAssert:WrongPlace
		//Failed:test1
		softAssert1.assertEquals(false, true,"test1:");//SoftAssert
		//Passed:test1
		
		System.out.println("GoTODealPage");
		System.out.println("CreateDeal");
		softAssert1.assertEquals(false, true,"test1:");//SoftAssert
		
		System.out.println("GoToContactPage");
		System.out.println("CreateContact");
		softAssert1.assertEquals(false, true,"test1:Won't be able to create contact:>" );//SoftAssert:WithMsg
		
		//ToAvoid:>Passed:test1
		softAssert1.assertAll();
	}
		
		@Test
		public void test2() {
			SoftAssert softAssert2 = new SoftAssert();
			System.out.println("LogOut");
			softAssert2.assertEquals(false, true,"test2:");//SoftAssert
			softAssert2.assertAll();
	}
		
		@AfterClass
		public void tearDown() {
		//softAssert.assertAll();//if we write here it will show:<Passed:test1><Passed:test2><Failed:tearDown>
		}

}

