package com.java.main;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class SearchWordCount {
	 public static int sameword() throws IOException
	 {
		String searchword="programming";
		int searchoccurance=0;
        
        String s="C:/Users/Bappa/Programming-Practice/test.txt";
       
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        ;
        //s=buf.readLine();
        buf=new BufferedReader(new FileReader("C:/Users/Bappa/Programming-Practice/test.txt"));
        while((s=buf.readLine())!=null)
         {
          
          StringTokenizer st = new StringTokenizer(s," ,;:.");
          while(st.hasMoreTokens())
           {
             int word_count = 0;
			word_count++;
             s=st.nextToken();
             if(s.equalsIgnoreCase(searchword))
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




