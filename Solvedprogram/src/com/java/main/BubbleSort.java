package com.java.main;

public class BubbleSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={78,56,89,34,20,11,6,9};

		
		//int[] des= sortDescendingOrder(a);

		int[] asc= sortAsscendingOrder(a);
//System.out.println("Array Sorted In Descending order ");
		
	//	for(int i=0;i<des.length;i++){
		//	System.out.println(des[i]);	
		//}
		
		{
		
		System.out.println("Array Sorted in Ascending order ");
		
		for(int i=0;i<asc.length;i++){
			System.out.println(asc[i]);
		}
		
		}
	}

	public static int[] sortAsscendingOrder(int[] a){
		int swap;
		for(int i=0;i<a.length-1;i++){
			
			for(int j=0;j<a.length-1-i;j++){
				
				if(a[j]>a[j+1]){ 
					
					swap=a[j]; 
					a[j]=a[j+1];  
					a[j+1]=swap; 
				}
			} 
		}
		return a;
	}
}


