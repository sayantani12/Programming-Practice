package com.java.main;

import java.util.Scanner;

public class IsNice {

	
public static void Stringsplit(String s) {
		
	StringBuffer bfr=new StringBuffer();
	String[] str=s.split(" ");
	
	int i=1;
	for( String word:str)
				{
		//System.out.println(word);
	bfr.append(word).append(i).append(" ");
	i++;
	
	}
	
	System.out.println(bfr.toString());
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stringsplit("This is original");
		
	}

}
