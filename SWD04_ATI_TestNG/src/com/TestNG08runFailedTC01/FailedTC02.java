package com.TestNG08runFailedTC01;

import org.testng.annotations.Test;

import graphql.Assert;

public class FailedTC02 {
	@Test
	public void testCase3() {
		System.out.println("TC3");
		Assert.assertTrue(true);
	}
	@Test
	public void testCase4() {
		System.out.println("TC4");
		Assert.assertTrue(true);
	}
}
