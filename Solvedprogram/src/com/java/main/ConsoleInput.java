package com.java.main;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;


public class ConsoleInput {
	public static void divcal(int num1,int num2) throws IOException {
		
		
		double div= num1 / num2;
		System.out.println("Division! " + div);
		
		
		
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Console con=null;
		con=System.console();
System.out.println("Enter the first number");
int num1 = Integer.parseInt(con.readLine());
System.out.println("Enter the second number");
int num2 = Integer.parseInt(con.readLine());
		divcal(num1,num2);
	}



}
