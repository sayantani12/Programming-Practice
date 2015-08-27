package com.java.main;

import java.util.Scanner;

public class linsearch {

	public static int linsearch(int arr1[],int search)
	{
		int i=0;
		for( i=0;i<arr1.length;i++)
		{
			if(arr1[i]==search)
			{
				System.out.println(i+1);
				return i+1;
			}
					
		}
		System.out.println("not present");
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]={4,6, 9, 20, 56,90,100,200,300,400};
		
		System.out.println("enter the number");
		Scanner in=new Scanner(System.in);
		int search=in.nextInt();
		int result=linsearch(arr1,search);
		
		}
	
	}


