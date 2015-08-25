package com.java.main;

import java.util.Scanner;

public class FibonociSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter number");
		int n=s.nextInt();
		
		// TODO Auto-generated method stub

for (int i=0;i<=n;i++)
{
	int answer=fibo(i);
	System.out.println(answer+" ");
	}
}


public static int fibo(int number)
{
	if (number==0)
	{
		return 0;
		}
	else if(number==1)
	{
		return 1;
		}
	
	else
	{
		return fibo(number-1)+fibo(number-2);
	}
	}
}