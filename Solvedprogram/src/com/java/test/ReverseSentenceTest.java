package com.java.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.java.main.ReverseEachWord;

public class ReverseSentenceTest {
	 @Test
	  public void testpositive()
	  {
		boolean actual=ReverseEachWord.ReverseSentence("hello world");
		  Assert.assertEquals(actual, "true");
}
}
