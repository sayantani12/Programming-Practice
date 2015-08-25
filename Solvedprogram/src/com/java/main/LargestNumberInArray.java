package com.java.main;

public class LargestNumberInArray {

	

		public static int largest(int[] arr)
		{
			int max = arr[0];
			for(int i=1;i<arr.length;i++)
			{
				if(arr[i]>max)
				{
					max = arr[i];
				}
			}
			
			return max;
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int arr []=new int[]{79,80,90,72,90,67,90,56,2,47,88};
			int largest=largest(arr);
			System.out.println("The largest number is"+largest);

}
}
