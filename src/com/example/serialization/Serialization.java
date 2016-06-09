package com.example.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {
	
	Student std;
	FileOutputStream fileOut;
	FileInputStream fileIn;
	
	public void init()
	{
		std = new Student();
		std.setName("Salman Khan");
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
			 fileOut =new FileOutputStream("student.ser");
	         out = new ObjectOutputStream(fileOut);
	         out.writeObject(std);
	        
	         System.out.println("Serialized data is saved in student.ser");
			
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
			fileIn = new FileInputStream("student.ser");
		    in = new ObjectInputStream(fileIn);
	        Student std1 = (Student) in.readObject();
	        System.out.println("AFTER Deserializing" + std1);
			
		}
		finally
		{
			 in.close();
	         fileIn.close();
			
		}
		
		
        
	}
	
	public static void main(String[] args) {
		
		Serialization sr = new Serialization();
		
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
