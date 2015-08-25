package com.java.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.java.main.LargestNumberInArray;

/**
 * Test Cases for largest number in array
 */
public class LargestTest {

	@Test
	public void testPositiveNumbers()
	{
		int[] arr = {79,80,90,72,90,67,90,56,2,47,88};
		int actual = LargestNumberInArray.largest(arr);
		Assert.assertEquals(actual,90);
	}
	
	@Test
	public void testNegativeNumbers()
	{
		int[] arr = {-1,-90,-40,-3,-87};
		int actual = LargestNumberInArray.largest(arr);
		Assert.assertEquals(actual,-1);
	}
	
	@Test
	public void testDuplicateNumbers()
	{
		int[] arr = {9,8,79,6,50,79};
		int actual = LargestNumberInArray.largest(arr);
		Assert.assertEquals(actual,79);
	}
	
	@Test
	public void testallnum()
	{
		int[] arr = {9,80,-6,67,4,-9};
		int actual = LargestNumberInArray.largest(arr);
		Assert.assertEquals(actual,80);
	}
}