package com.TestNG06parallelTesting;

import org.testng.annotations.Test;

public class Demo5 {
	
	@Test(threadPoolSize=3, invocationCount=3, timeOut=1000)
	public void testcase51() {
		System.out.println("TC51"+"#"+Thread.currentThread().getId());
	}
	
	@Test(threadPoolSize=2, invocationCount=3, timeOut=1000)
	public void testcase52() {
		System.out.println("TC52"+"#"+Thread.currentThread().getId());
	}

}
