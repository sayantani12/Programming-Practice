package com.java.main;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class SearchWordCount {
	 public static int sameword() throws IOException
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
        
        
       
        while((cursor=buf.readLine())!=null)
         {
          lines+=1;
          content+=cursor;
          //StringTokenizer st = new StringTokenizer(s," ,;:.");
          //while(st.hasMoreTokens())
          String [] wordct=cursor.split(" ");
           for(String  w:wordct)
           {
             //int word_count = 0;
			words++;
             //s=st.nextToken();
             if(w.equalsIgnoreCase(searchword))
            	 searchoccurance++;
            
           }
        }
       
       System.out.println("Word Count : "+searchoccurance);
       
       buf.close();
	return searchoccurance;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		sameword();

	}
}




