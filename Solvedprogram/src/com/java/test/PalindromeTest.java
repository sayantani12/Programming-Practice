package com.java.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.java.main.Palindrome;

public class PalindromeTest {
	@Test
	  public void testpositive()
	  {
		 boolean actual=Palindrome.pal("madam");
		  Assert.assertEquals(actual, true);
}  
	@Test
	  public void testnegative()
	  {
		 boolean actual=Palindrome.pal("hello");
		  Assert.assertEquals(actual, false);
	  }
	@Test
	  public void testblank()
	  {
		 boolean actual=Palindrome.pal(" madam");
		  Assert.assertEquals(actual, false);
	  }
	@Test
	  public void testsingle()
	  {
		 boolean actual=Palindrome.pal("s");
		  Assert.assertEquals(actual, true);
	  }
	@Test
	  public void testblank2()
	  {
		 boolean actual=Palindrome.pal(" ");
		  Assert.assertEquals(actual, true);
	  }
		  @Test
		  public void testblankbtw()
		  {
			 boolean actual=Palindrome.pal(" mad am");
			  Assert.assertEquals(actual, false);
		  }
	  }

