package com.java.main;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=0;
		System.out.println("Enter the number");
		Scanner in=new Scanner(System.in);
		number=in.nextInt();
		int result=factorial(number);
		System.out.println("factorial is"+result);

	}

	public static int factorial(int number) {
		// TODO Auto-generated method stub
		if(number==0)
		{
			return(1);
		}
		else
		{
			return number* factorial(number-1);
		}
	}

}
