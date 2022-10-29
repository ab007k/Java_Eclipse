package com.TestNG06parallelTesting;

import org.testng.annotations.Test;

public class Demo4 {
	
	@Test
	public void testcase41() {
		System.out.println("TC41"+"#"+Thread.currentThread().getId());
	}
	
	@Test
	public void testcase42() {
		System.out.println("TC42"+"#"+Thread.currentThread().getId());
	}

}
