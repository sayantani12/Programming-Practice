package com.java.main;

public class mergearr {

	
	public static int[] merge2arr(int[] arr1,int[] arr2)
	{
		int i=0;int j=0;int k=0;
	
		int []finarr=new int [arr1.length+arr2.length];
		for(k=0;k<(arr1.length+arr2.length);k++)
		{
		if(i>=arr1.length)
		{
			finarr[k]=arr2[j];
			j++;
		}
		else if
		(j>=arr2.length)
		{
			finarr[k]=arr1[i];
			i++;
		}
		else
		{
			if(arr1[i]<arr2[j])
			{
				finarr[k]=arr1[i];
			i++;
		}
			else
		
		{
			finarr[k]=arr2[j];
		j++;
		}
		}
		}
		
		return finarr;
		
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]={4,6, 9, 20, 56,90,100,200,300,400};
		int arr2[]={1, 7, 25, 45, 70,90,100};
		int[] result=merge2arr(arr1, arr2);
		for (int j=0; j<result.length;j++)
		System.out.print(result[j]+ " ");
		}
	}


