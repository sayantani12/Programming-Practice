package com.java.main;

import java.util.Scanner;

public class PingPong {

	public static void pingpong(int number)
	{
		if(number%3==0&&number%5==0)
		
			System.out.println("pingpong");
		else if(number%5==0)
		
			System.out.println("pong");
		
		else if(number%3==0)
		
			System.out.println("ping");
	
		else
				System.out.println(number);
		
		
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		System.out.println("enter number");
		Scanner in=new Scanner(System.in);
		num=in.nextInt();
		pingpong(num);

	}

}
