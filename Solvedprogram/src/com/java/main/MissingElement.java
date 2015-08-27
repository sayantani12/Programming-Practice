package com.java.main;

public class MissingElement {

	public static int missingelemenarr(int[]arr,int n){
		 int sumofn=(n*(n+1))/2;
		 int sumofarr=0;
		 for(int i=0;i<arr.length;i++){
			 sumofarr=sumofarr+arr[i];
		 }
		 int missingno=sumofn-sumofarr;
		System.out.println(missingno);
		return missingno;
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[]{1,2,3,5,6,7,};
		int n=7;
		missingelemenarr(arr, n);

	}

}
