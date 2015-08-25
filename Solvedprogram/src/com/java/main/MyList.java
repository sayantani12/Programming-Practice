package com.java.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyList {
	public List createArrayList()
	{
		List list=new ArrayList();
		list.add(10);
		list.add(30);
		list.add(80);
		return list;
	}
public int printList(List list){
	int count = 0;
	for(Object ob:list)
	{
		System.out.println(ob);
		count++;
	}
	return count;
}


public int printList2(List<Integer> ls2){
	//  1,2 ,3 
	int count = 0;
	{
	System.out.println("Inside print2");
	Iterator<Integer> it = ls2.iterator();
	while (it.hasNext()) {
		Integer x  = it.next(); // gives the object value
		System.out.println(x);
		count++;
	}
	}
	return count;
}
// print the elements in reverse order
public int printList3(List<Integer> ls3){
	int count=0;
	{
	System.out.println("Inside print3");
	int n = ls3.size();
	ListIterator<Integer> it = ls3.listIterator(n); // nth element in the lisr
	while (it.hasPrevious()) {
		Integer x  = it.previous();
		System.out.println(x);
		count++;
	}
	}
	return count;
	
}

public boolean search(List<Integer> ls4,int ele)
{
	boolean element=ls4.contains(ele);
	int ind=ls4.indexOf(ele);
	System.out.println("Does arrayList contain " +ele +"?" + element);
	System.out.println("Index of the" +ele +"?" + ind);
	
	return element;
	}



public static void main(String[] args) {
	MyList ls=new MyList();
	ls.search(ls.createArrayList(),30);
}
}
