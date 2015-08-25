package com.java.main;

public class CommonNumber {
	
	public static int common(int[] arr1,int[] arr2)
	{
		int com=0;
	
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			if(arr1[i]==arr2[j])
			{
				 com=arr1[i];
			}
		}
		return com;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1={};
		int [] arr2={};
		int comele=common(arr1,arr2);
		System.out.println("The common number is"+comele);
	}

}
