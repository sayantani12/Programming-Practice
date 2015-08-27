package com.java.main;

public class DisplayOverriding {
	
	public void eat()
	   {
	      System.out.println("Human is eating");
	   }
	}
	class Boy extends DisplayOverriding{
	   public void eat(){
	      System.out.println("Boy is eating");
	   }
	}