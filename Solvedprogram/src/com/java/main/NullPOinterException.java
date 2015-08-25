package com.java.main;

public class NullPOinterException {
	
	public static void nullexp(String s)
	{
		
		
		try
		{
			int len=s.length();
		}
				catch(NullPointerException ex)
		{
		System.out.println("null ponter exception"+ex.getMessage());
	}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nullexp(null);

	}

}
