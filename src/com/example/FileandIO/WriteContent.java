package com.example.FileandIO;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteContent {
	
	FileOutputStream fout=null;
	
	public void write(String str) throws IOException
	{		
		 
		try
		{	
			 fout=new FileOutputStream("content.txt");  		    
		     byte b[]=str.getBytes();//converting string into byte array  
		     fout.write(b);
		     
		     System.out.println("success...");  
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			
			 fout.close(); 
		
		}
	}
	
	public static void main(String[] args) {
		
		WriteContent content = new WriteContent();
		try {
			content.write("Java is my favourite language");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
		

}
