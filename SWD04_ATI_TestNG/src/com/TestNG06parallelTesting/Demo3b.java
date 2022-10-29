package com.TestNG06parallelTesting;

import org.testng.annotations.Test;

public class Demo3b {

	@Test
	public void testcase3b1() {
		System.out.println("TC3b1"+"#"+Thread.currentThread().getId());
	}
	
	@Test
	public void testcase3b2() {
		System.out.println("TC3b2"+"#"+Thread.currentThread().getId());
	}
}
