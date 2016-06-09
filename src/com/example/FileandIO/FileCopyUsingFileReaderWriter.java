package com.example.FileandIO;

import java.io.FileReader;
import java.io.FileWriter;

public class FileCopyUsingFileReaderWriter {
	
	FileReader fr;
	FileWriter fw;
	String body="";
	public void read()throws Exception
	{
		
		try
		{
			  fr=new FileReader("content.txt");  
			  int i;  
			  while((i=fr.read())!=-1)  
			  body = body + new Character((char)i).toString();
			  System.out.println(body);
			 
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			System.out.println("Always give close staement here");
			 fr.close();
		}
		
	}
	
	public void write() throws Exception
	{
		
		try
		{
			
			 fw=new FileWriter("contenCopyUsingFileWriter.txt");  
			  fw.write(body);  
			 
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			  fw.close();  
		}
		
	}
	
	public static void main(String[] args) {
		
		FileCopyUsingFileReaderWriter copy = new FileCopyUsingFileReaderWriter();
		try {
			copy.read();
			copy.write();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
