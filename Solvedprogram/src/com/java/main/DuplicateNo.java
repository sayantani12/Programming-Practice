package com.java.main;
import java.util.Set;
import java.util.*;

public class DuplicateNo {
		
		public static void findduplicate(int [] arr)
		{
			int [] newarr= new int[arr.length];
			Set<Integer> s=new HashSet<Integer>();
			for(int x:arr)
			
				if(s.add(x)==false)
				{
					System.out.println(x+ "id duplicate");
			
						}
					
			
		}
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			findduplicate(new int [] {1,3,4,5,4,5});
			
		}
}
	
