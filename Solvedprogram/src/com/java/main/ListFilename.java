package com.java.main;

import java.io.File;

public class ListFilename {
	public static int filename()
	
	{
		int count=0;
	File file = new File("C:/Users/Bappa/Programming-Practice");
    File[] files = file.listFiles();
    for(File f: files){
        System.out.println(f.getName());
        if(f.isFile())
        {
        	count++;
        }
        System.out.println(count);
    }
    
	return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
filename();
	}

}
