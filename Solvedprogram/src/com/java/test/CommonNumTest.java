package com.java.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.java.main.CommonNumber;

public class CommonNumTest {
  @Test
  public void testPositiveNumbers()
	{
		int[] arr1 = {79,80,90,72,90,67,90,56,2,47,88};
		int[] arr2 = {7,8,9,6,10,47};
		int actual = CommonNumber.common(arr1,arr2);
		Assert.assertEquals(actual,47);
	}
	
	@Test
	public void testNegativeNumbers()
	{
		int[] arr1 = {-9,-57,-20,-10};
		int[] arr2 = {-4,-5,-100,-57};
		int actual = CommonNumber.common(arr1,arr2);
		Assert.assertEquals(actual,-57);
	}
	
	@Test
	public void testnocommon()
	{
		int[] arr1 = {9,8,79,6,50,79};
		int[] arr2= {1,2,5,25,34,70};
		int actual =CommonNumber.common(arr1,arr2);;
		Assert.assertEquals(actual,0);
	}
	
	@Test
	public void testnullarray()
	{
		int[] arr1 = {};
		int[] arr2= {};
		int actual =CommonNumber.common(arr1,arr2);;
		Assert.assertEquals(actual,0);
	}
}