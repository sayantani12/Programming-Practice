package com.java.main;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataInput {
	public static int multi() throws NumberFormatException, IOException {
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Enter the first number");
		
		int num1 = Integer.parseInt(dis.readLine());
		System.out.println("Enter the second number");
		int num2 = Integer.parseInt(dis.readLine());
		int result= num1*num2;
		System.out.println("Multiplied ! " + result);
		return result;
	}

	public static void main(String[] args) throws NumberFormatException, IOException  {
		// TODO Auto-generated method stub
		multi();
	}

}


