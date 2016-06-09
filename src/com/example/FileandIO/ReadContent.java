package com.example.FileandIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadContent {
	FileInputStream fin=null;
	public void read() throws IOException
	{
		
		 try{  
			   fin=new FileInputStream("content.txt");  
			    int i=0;  
			    while((i=fin.read())!=-1){  
			     System.out.print((char)i);  
			    }  
			    
			  }catch(Exception e){
				e.printStackTrace();
			  }
			  finally
			  {
				  fin.close(); 
			  }
		
	}
	
	public static void main(String[] args) {
		
		ReadContent content = new ReadContent();
		try {
			content.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
