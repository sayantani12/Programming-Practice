package com.java.main;

import java.util.Scanner;

public class ArmstrongNum {
	
	public static int armno(int n)
	{
		int result=0;int rem;
		int o=n;
		
		while (n!=0)
		{
		rem=n%10;
		result=result+rem*rem*rem;
		n=n /10;
		}
		System.out.println(result);
		
		if(result==o){
		System.out.println("armstrong");
		}
		else
		{
			System.out.println("not armstong");
		}
		return result;
				
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		Scanner in=new Scanner(System.in);
		int ori=in.nextInt();
		int num=armno(ori);
		System.out.println("number"+num);

	}

}
