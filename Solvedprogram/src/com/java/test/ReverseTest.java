package com.java.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.java.main.ReserseString;

public class ReverseTest {
	  @Test
	  public void testreverse()
	  {
		  String actual=ReserseString.reverse("white");
		  Assert.assertEquals(actual, "etihw");
	  }
	  @Test
	  public void testpalindrome()
	  {
		  String actual=ReserseString.reverse("madam");
		  Assert.assertEquals(actual, "madam");
	  } 
	  @Test
	  public void testblackspace()
	  {
		  String actual=ReserseString.reverse("bo x");
		  Assert.assertEquals(actual, "x ob");
}
	  @Test
	  public void testendnull()
	  {
		  String actual=ReserseString.reverse("box\0");
		  Assert.assertEquals(actual, "\0xob");
}
	  @Test
	  public void testsingle()
	  {
		  String actual=ReserseString.reverse("s");
		  Assert.assertEquals(actual, "s");
}  
	  @Test
	  public void testnull()
	  {
		  String actual=ReserseString.reverse("\0");
		  Assert.assertEquals(actual, "\0");
}
	  @Test
	  public void testint()
	  {
		  String actual=ReserseString.reverse("bo23x");
		  Assert.assertEquals(actual, "x32ob");
}
}
