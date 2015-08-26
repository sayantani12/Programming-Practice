package com.java.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Bufferinput {
	public static int diff() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the first number");
		int num1 = Integer.parseInt(br.readLine());
		System.out.println("Enter the second number");
		int num2 = Integer.parseInt(br.readLine());
		int subs= num1 - num2;
		System.out.println("Difference! " + subs);
		return subs;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		diff();
	}

}