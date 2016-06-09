package com.example.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	
	StudentCustom std;
	FileOutputStream fileOut;
	FileInputStream fileIn;
	
	public void init()
	{
		std = new StudentCustom();
		std.setName("Shahrukh Khan");
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
			 fileOut =new FileOutputStream("studentCustom.ser");
	         out = new ObjectOutputStream(fileOut);
	         out.writeObject(std);
	        
	         System.out.println("Serialized data is saved in studentCustom.ser");
			
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
			fileIn = new FileInputStream("studentCustom.ser");
		    in = new ObjectInputStream(fileIn);
		    StudentCustom std1 = (StudentCustom) in.readObject();
	        System.out.println("AFTER Deserializing" + std1);
			
		}
		finally
		{
			 in.close();
	         fileIn.close();
			
		}
		
		
        
	}
	
	public static void main(String[] args) {
		
		SerializationDemo sr = new SerializationDemo();
		
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
