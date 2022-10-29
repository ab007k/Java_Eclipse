package testNG_6_TestNGListnerConcept;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(_3CustomListener.class)
public class _1ScreenshotFailedTC extends _2Base_ScreenshotLogic {
	
	@BeforeMethod
	public void setUp() {
		initialization();
	}
	
	@AfterMethod
	public void teardown() {
		dr.quit();
	}
	
	//_1.if @Test getting fail:@Listener
	//_3.failed(result.getMethod().getMethodName());-->called it
	//_2.failed(){Take Screenshot and Store in CreatedFolder}
	@Test
	public void takeScreenshotTest1() {
		Assert.assertEquals(false, true);		
	}
	
	@Test
	public void takeScreenshotTest2() {
		Assert.assertEquals(false, true);		
	}
	
	@Test
	public void takeScreenshotTest3() {
		Assert.assertEquals(false, true);		
	}
	
}
