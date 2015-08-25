package com.java.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MyMap {

	public static Map<Integer,String> createMap()
	{
		Map<Integer,String> map= new HashMap<Integer,String >();

		map.put(1, "tim");
		map.put(2, "Lee");
		map.put(3, "jerry");
		return map;
	
	}
	
	/*
	 * public static String val(Map<Integer,String> map)
	 
	{
		int key;
		String value = null;
		Set<Integer> s=map.keySet();
		System.out.println(s);
				Iterator<Integer>  it=s.iterator();
				
				
				
				while(it.hasNext())
				{
					key=it.next();
					value=map.get(key);
					System.out.println(fname+" "+lastname);
				}
				return value;
				}
		
	*/

	
	public static int printval(Map<Integer,String> map)
	{
		int count=0;
		Set<Entry<Integer,String>> mySet=map.entrySet();
		Iterator<Entry<Integer,String>> it=mySet.iterator();
		while(it.hasNext()){
		Entry<Integer,String> element=it.next();
		System.out.println("key="+element.getKey()+"value="+element.getValue());
		count++;
		}
		return count;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer,String> map=createMap();
int val=printval(map);
	}

}
