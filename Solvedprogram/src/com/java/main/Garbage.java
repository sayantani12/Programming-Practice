package com.java.main;

public class Garbage {
	
	public void finalize()
    {
        System.out.println("Garbage Collected");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
	       Garbage t = new Garbage();
	        t=null;
	        System.gc();
	        
	    }
	}

}
