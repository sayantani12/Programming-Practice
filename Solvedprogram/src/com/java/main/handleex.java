package com.java.main;

public class handleex {

	 void nullexp(String s) throws Exception{
		
			
		System.out.println("null ponter exception");
	}
		
	
	 class TestChild extends handleex
{
	void nullexp(String s)
	{
		int len=s.length();
	}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		handleex p=new handleex();  
		   try{  
		   p.nullexp(null);  
		   }catch(Exception e)
		   {
			System.out.println(e.getMessage());   
		   }  
		  }  
		
	}




