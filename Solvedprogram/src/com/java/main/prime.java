package com.java.main;

import java.util.Scanner;

public class prime {

	public static boolean isPrimeNumber(int number){
        if (number<=1){
        	return false;
        }
        for(int i=2; i<=Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
     
    public static void main(String a[]){
       
    	Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = s.nextInt();
        if (isPrimeNumber(n)) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }
}
