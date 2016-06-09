package com.example.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizableDemo {
	
	StudentExtern std;
	FileOutputStream fileOut;
	FileInputStream fileIn;
	
	public void init()
	{
		std = new StudentExtern();
		std.setName("Aamir Khan");
		std.setSubject("Java");
		std.setFee(2000);
		std.setTutionDay("Sun day");
	}
	
	public void serialize() throws IOException
	{
		System.out.println("Before Serialization" + std);
		ObjectOutputStream out=null;
		
		try
		{
			 fileOut =new FileOutputStream("studentExtern.ser");
	         out = new ObjectOutputStream(fileOut);
	         out.writeObject(std);
	        
	         System.out.println("Serialized data is saved in studentExtern.ser");
			
		}
		finally
		{
			 out.close();
	         fileOut.close();
			
		}
		
		   
	}
	
	
	public void deSerialize() throws Exception
	{
		ObjectInputStream in =null;
		try
		{
			fileIn = new FileInputStream("studentExtern.ser");
		    in = new ObjectInputStream(fileIn);
		    StudentExtern std1 = (StudentExtern) in.readObject();
	        System.out.println("AFTER Deserializing" + std1);
			
		}
		finally
		{
			 in.close();
	         fileIn.close();
			
		}
		
		
        
	}
	
	public static void main(String[] args) {
		
		ExternalizableDemo sr = new ExternalizableDemo();
		
		try
		{
			sr.init();
			sr.serialize();
			sr.deSerialize();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}


}
