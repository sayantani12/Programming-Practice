package com.java.main;

public class enumdisp {

	public enum months {

		Jan,Feb,Mar,April,May,Jun,Jul,Aug,Sep,Oct,Nov,Dec;
	}
	
	public static void main(String args[])
	{
	for(months mon:months.values())
	
	
		
System.out.println("months in the enum are :"+mon);
	
	}

	}


