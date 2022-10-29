package com.TestNG02ignore;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore //at class level
public class Demo07ignore {

	@Ignore  //at test level
	@Test
	public void ignore() {}
}
