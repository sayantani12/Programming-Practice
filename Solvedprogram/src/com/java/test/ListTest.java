package com.java.test;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.java.main.MyList;

public class ListTest {
  @Test
  public void testList() {
	 MyList ls=new MyList();
	 List finlist=ls.createArrayList();
	 int expected=ls.printList(finlist);
	 Assert.assertEquals(3, expected);
	 
	  
  }
  @Test
  public void testprntList2() {
		 MyList ls=new MyList();
		 List finlist2=ls.createArrayList();
		 int expected=ls.printList2(finlist2);
		 Assert.assertEquals(3, expected);
		 
}@Test
public void testprntList3() {
	 MyList ls=new MyList();
	 List finlist3=ls.createArrayList();
	 int expected=ls.printList2(finlist3);
	 Assert.assertEquals(3, expected);
}
}
