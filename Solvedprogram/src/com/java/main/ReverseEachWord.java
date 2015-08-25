package com.java.main;


	import java.util.Scanner;

	public class ReverseEachWord {

		public static boolean ReverseSentence(String s)
		{
			int i,j=0;
			boolean val=false;
			StringBuffer sb=new StringBuffer();
			String[] str=s.split(" ");
			
			for( i=str.length-1;i>=0;i--)
			{
				sb.append(str[i]);
				sb.append(" ");
			}
			
				String st=sb.toString();
				String[] str2=st.split(" ");
				for( i=str.length-1;i>=0;i--)
				{
				for( j=0;j<=str2.length-1;j++)
				{
					if(str[i]==str2[j])
						val=true;
				}
		
			System.out.println("reverse sentence"+" "+sb.toString());
			
		}
				return val;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Enter the string");
			Scanner in=new Scanner(System.in);
			String original=in.nextLine();
			ReverseSentence(original);

		}

	}


