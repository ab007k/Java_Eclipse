package com.TestNG06parallelTesting;

import org.testng.annotations.Test;

public class Demo2b {

	@Test
	public void testcase2b() {
		System.out.println("TC2b"+"#"+Thread.currentThread().getId());
	}
}
