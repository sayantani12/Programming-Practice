package com.java.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CountWord {
	public static int count() throws IOException
	{
		int word_count=0;
        
        String s="C:/Users/Bappa/Programming-Practice/test.txt";
        StringTokenizer st;
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        ;
        //s=buf.readLine();
        buf=new BufferedReader(new FileReader("C:/Users/Bappa/Programming-Practice/test.txt"));
        while((s=buf.readLine())!=null)
         {
          
          st=new StringTokenizer(s," ,;:.");
          while(st.hasMoreTokens())
           {
             word_count++;
             s=st.nextToken();
            
           }
        }
       
       System.out.println("Word Count : "+word_count);
       
       buf.close();
	return word_count;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		count();

	}
}


