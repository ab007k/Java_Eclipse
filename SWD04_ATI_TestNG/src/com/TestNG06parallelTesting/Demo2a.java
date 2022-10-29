package com.TestNG06parallelTesting;

import org.testng.annotations.Test;

public class Demo2a {
	
	@Test
	public void testcase2a() {
		System.out.println("TC2a"+"#"+Thread.currentThread().getId());
	}
}
