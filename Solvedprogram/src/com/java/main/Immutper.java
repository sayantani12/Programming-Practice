package com.java.main;
import java.lang.*;

public final class Immutper {

	
		  //fields are made private and final to restrict outside access
		  private final String fname;
		  private final String lname;
		  private final int age;
		 
		  private Immutper(String fname, String lname, int age)
		  {
		    this.fname = fname;
		    this.lname = lname;
		    this.age = age;
		  }
		 
		  public static Immutper createDetail(String fname, String lname, int age){
				
				return new Immutper(fname,lname,age);
			}

			
		  public String getFname()
		  { 
		    return this.fname;
		  }
		 
		  public String getLname()
		  { 
		    return this.lname;
		  }
		 
		  public int getAge()
		  {
		    return this.age;
		  }

public static void main(String[] args)
{
	
	Immutper per = Immutper.createDetail("Tim", "Lee", 25);
	String Name = per.getFname();
	System.out.println(Name);
	
}
}


