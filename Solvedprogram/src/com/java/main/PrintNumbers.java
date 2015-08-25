package com.java.main;

public class PrintNumbers {
	
	public static void recurprint(int n)
	{
		int count =1;
		if(n<=10)
			System.out.println(n);
		
		recurprint(n+1);
		//count++;
		//return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
recurprint(1);
	}

}
