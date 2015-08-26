package com.java.main;

import java.util.Scanner;

public class scaninput {

	public static int add(int n,int m)
	{
		int add;
	 add=n+m;	
	 System.out.println("add"+add);
	 return add;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println("enter two numbers");
	Scanner in=new Scanner(System.in);
	int x=in.nextInt();
	int y=in.nextInt();
	add(x,y);

	}
}





