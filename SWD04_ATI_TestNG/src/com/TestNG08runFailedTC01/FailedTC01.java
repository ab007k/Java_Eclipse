package com.TestNG08runFailedTC01;

import org.testng.annotations.Test;

import graphql.Assert;

public class FailedTC01 {
	@Test
	public void testCase1() {
		System.out.println("TC1");
		Assert.assertTrue(false);
	}
	@Test
	public void testCase2() {
		System.out.println("TC2");
		Assert.assertTrue(false);
	}
}
