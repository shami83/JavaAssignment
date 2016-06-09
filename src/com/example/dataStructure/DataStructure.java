package com.example.dataStructure;

import java.util.BitSet;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Stack;
import java.util.Vector;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

public class DataStructure {
	
	public void vector()
	{
		Vector vec= new Vector();
		vec.add("Shamik Mitra");
		vec.add("Samir Mitra");
		vec.add("Swastika Mitra");
		
		printVectorUsingEnumeration(vec);
		
		
	}
	
	public void printVectorUsingEnumeration(Vector v)
	{
		System.out.println("Enumeration Demo ::");
		for(Enumeration e=v.elements();e.hasMoreElements(); )
		{
			String name = (String)e.nextElement();
			System.out.println("name is " + name);
		}
	}
	
	public void bitSet()
	{
		BitSet bit =new BitSet(8);
		BitSet bit1 =new BitSet(8);
		
		for(int i=0;i<8;i++)
		{
			bit1.set(1);
			if(i%2==0)
			{
				bit.set(i);
			}
			
		}
		
		System.out.println("BitSet pattern is " + bit);
		System.out.println("Doing operation on BitSet");
		
		 bit.or(bit1);
		 System.out.println("Now BitSet pattern is " + bit);
	}
	
	
	public void stack()
	{
		Stack st = new Stack();
		System.out.println("Stack Push");
		st.push(1L);
		st.push(2L);
		st.push(3L);
		System.out.println("Stack Push" + st);
		
		System.out.println("Stack pop");
		
		for(int i=0;i<=2;i++)
		{
			System.out.println("POP : " + st.pop());
		}
		
		
		
		
	}
	
	public void hastable()
	{
		Hashtable tb = new Hashtable();
		
		tb.put("name", "shamik Mitra");
		tb.put("Job", "IBM");
		tb.put("hobby", "photography");
		System.out.println("Hashtable " + tb);
		for(Enumeration e=tb.keys();e.hasMoreElements(); )
		{
			String key = (String)e.nextElement();
			String value = (String)tb.get(key);
			System.out.println("Key is " + key + " value is "+ value);
		}
		
	}
	
	public void properties()
	{
		Properties tb = new Properties();
		
		tb.put("INDIA", "DELHI");
		tb.put("BANGLADESH", "DHAKA");
		tb.put("AMERICA", "WASHINGTON DC");
		System.out.println("Hashtable " + tb);
		for(Enumeration e=tb.keys();e.hasMoreElements(); )
		{
			String key = (String)e.nextElement();
			String value = (String)tb.get(key);
			System.out.println("Key is " + key + " value is "+ value);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		DataStructure dt = new DataStructure();
		dt.vector();
		dt.bitSet();
		dt.stack();
		dt.hastable();
		dt.properties();
		
	}
	
	
	
	

}
