package com.java.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.java.main.FibonociSeries;

public class test {
  @Test
  public void testNumberOne() {
	  
	  int n=1;
	  int actual=FibonociSeries.fibo(n);
	  Assert.assertEquals(actual, 1);
	  
  }
 
  @Test
	public void testNumberZero()
	{
	  int n=0;
	  int actual=FibonociSeries.fibo(n);
	  Assert.assertEquals(actual, 0);
	}
  @Test
 	public void testPositiveNumber()
 	{
 	  
 	  int actual=FibonociSeries.fibo(4);
 	  
 	}
  @Test(expectedExceptions=StackOverflowError.class)
	public void testNegativeNumber()
	{
	  
	  int actual=FibonociSeries.fibo(-4);
	  
}
}