package com.java.main;

public class Swap {
	
public static void swapping(int a,int b)
{
	System.out.println("initial value of a"+a+"b"+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("final value of a"+a+"b"+b);
	
	
}
public static void thirdvar(int x,int y)
{
	int v=0;
	System.out.println("initial value of x"+x+"y"+y);	
	v=x;
	x=y;
	y=v;
	System.out.println("final value of x"+x+"y"+y);
	
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
swapping(100,200);

thirdvar(6,9);
	}

}
