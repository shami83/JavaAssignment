package com.example.FileandIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFileUsingBuferdStream {
	String body="";
	
	public void read() throws Exception
	{
		FileInputStream fin=null;
		BufferedInputStream bin=null;
		
		try{
			
			fin=new FileInputStream("content.txt");  
		    bin=new BufferedInputStream(fin);  
		    int i;  
		    
		    while((i=bin.read())!=-1){  
		    // System.out.print((char)i);
		     System.out.println(new Character((char)i).toString()); 
		     body = body + new Character((char)i).toString();
		    } 
		    
		    System.out.println("String is " + body);
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			fin.close();
			bin.close();
		}
		
		
		
	}
	
	public void write() throws Exception
	{
		FileOutputStream fout=null;
		 BufferedOutputStream bout=null;
		
		try
		{
			fout=new FileOutputStream("contentCopy.txt");  
		    bout=new BufferedOutputStream(fout); 
		    byte[] buff = body.getBytes();	     
		    bout.write(buff);
		    bout.flush(); 
		    System.out.println("Done");
			
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
		
		CopyFileUsingBuferdStream stream = new CopyFileUsingBuferdStream();
		try
		{
			stream.read();
			stream.write();
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		
		
	}

}
