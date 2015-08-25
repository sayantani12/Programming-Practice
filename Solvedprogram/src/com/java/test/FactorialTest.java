package com.java.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.java.main.Factorial;
import com.java.main.FibonociSeries;

public class FactorialTest {
   @Test
  public void testNumberZero() {
	  
	
	  int actual=Factorial.factorial(0);
	  Assert.assertEquals(actual, 1);
	  
  }
 
  @Test
	public void testNumberOne()
	{
	  int actual=Factorial.factorial(1);
	  Assert.assertEquals(actual, 1);
	}
  @Test
	public void testPositiveNumber()
	{
	  
	  int actual=Factorial.factorial(4);
	  Assert.assertEquals(actual, 24);
}
  @Test(expectedExceptions=StackOverflowError.class)
	public void testNegativeNumber()
	{
	  
	  int actual=Factorial.factorial(-4);
	  
}
}