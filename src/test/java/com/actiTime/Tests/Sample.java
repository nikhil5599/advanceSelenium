package com.actiTime.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.actiTime.Generic.BaseTest;

public class Sample extends BaseTest 
{
	@Test
	public void TestMethod()
	{
		System.out.println("passed");
		Assert.fail();
	}

}
