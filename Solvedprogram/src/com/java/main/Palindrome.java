package com.java.main;

import java.util.Scanner;

public class Palindrome {

	public static boolean pal(String str1)
	{
		String reverse = "";
		boolean val=false;
	    int length = str1.length();
	    for( int i = length - 1 ; i >= 0 ; i-- ) {
	       reverse = reverse + str1.charAt(i);
	       
	       val=str1.equals(reverse);
	       
			    }
	    System.out.println("Reverse string is"+" "+reverse);
		if(str1.equals(reverse))
			System.out.println("palindrome");
		else
			System.out.println("notpalindrome");
       
	    return val;
		
	}
	public static void main(String[] args) {		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner in=new Scanner(System.in);
		String original=in.nextLine();
		pal(original);
		
	
			
		
	}

}


