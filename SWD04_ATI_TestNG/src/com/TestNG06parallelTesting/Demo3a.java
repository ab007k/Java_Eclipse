package com.TestNG06parallelTesting;

import org.testng.annotations.Test;

public class Demo3a {
	
	@Test
	public void testcase3a1() {
		System.out.println("TC3a1"+"#"+Thread.currentThread().getId());
	}
	
	@Test
	public void testcase3a2() {
		System.out.println("TC3a2"+"#"+Thread.currentThread().getId());
	}
}
