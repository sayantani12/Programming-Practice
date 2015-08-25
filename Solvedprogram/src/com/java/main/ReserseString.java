package com.java.main;

import java.util.Scanner;

public class ReserseString {

	public static String reverse(String str)
	{
		String reverse = "";
	    int length = str.length();
	    for( int i = length - 1 ; i >= 0 ; i-- ) {
	       reverse = reverse + str.charAt(i);
	    }
	    return reverse;
		
	}
	public static void main(String[] args) {		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner in=new Scanner(System.in);
		String original=in.nextLine();
		String reversestring=reverse(original);
		System.out.println("Reverse string is"+" "+reversestring);

	}

}
