package com.java.test;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.java.main.MyMap;
public class MapTest {
	@Test
	  public void testPositive()
		{
	  Map<Integer,String> map=MyMap.createMap();
	  int actual=MyMap.printval(map);
	  Assert.assertEquals(actual, 3);
  }
}
