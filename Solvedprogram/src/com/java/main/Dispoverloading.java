package com.java.main;

public class Dispoverloading {
	
	public static int add(int a,int b)
	{
		return a+b;
		
	}
	public static int add(int a,int b,int c)
	{
		return a+b+c;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int result1=add(2,3,4);
int result2=add(9,10);
System.out.println(result1);
System.out.println(result2);
	}

}
