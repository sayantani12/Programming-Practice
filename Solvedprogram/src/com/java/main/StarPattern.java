package com.java.main;

import java.util.Scanner;

public class StarPattern {
	
	public static void pattern(int n)
	{
		for(int i =0; i < 4; i++){
		    for(int j=i+1;j>0;j--){
		        System.out.print("*");
		}
		System.out.println();
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter the no of lines");
		int n=s.nextInt();
		pattern(n);

	}

}
