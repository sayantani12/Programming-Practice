package com.java.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SearchReplaceFile {
	 public static int searchreplace() throws IOException
	 {
		 String s="C:/Users/Bappa/Programming-Practice/test.txt";

	     FileReader fReader;
	     fReader=new FileReader(s);
		 BufferedReader buf=new BufferedReader(fReader);
	        ;
	        //s=buf.readLine();
	        //buf=new BufferedReader(new FileReader("C:/Users/Bappa/Programming-Practice/test.txt"));
		 BufferedWriter out=new BufferedWriter(new FileWriter(s,true));
	        String cursor;
	        String content="";
	        int lines=0;
	        int words=0;
	        
	        String searchword="programming";
		int searchoccurance=0;
	        String replace="java";
        
        
       
        while((cursor=buf.readLine())!=null)
         {
          //lines+=1;
          //content+=cursor;
          //StringTokenizer st = new StringTokenizer(s," ,;:.");
          //while(st.hasMoreTokens())
         String [] wordct=cursor.split(" ");
          for(String  w:wordct)
           {
             
        	  w.replaceAll(searchword, replace);
             //s=st.nextToken();
             //if(w.equalsIgnoreCase(searchword))
            	// searchoccurance++;
            
             
           }
        }
       
       System.out.println("Word Count : "+searchoccurance);
       
       buf.close();
	return searchoccurance;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		searchreplace();

	}
}






