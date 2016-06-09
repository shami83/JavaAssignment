package com.example.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
	
	public List countryList = new ArrayList();
	
	public void init()
	{
		countryList.add("India");
		countryList.add("Pakistan");
		countryList.add("Srilanka");
		countryList.add("Nepal");
		
	}
	
	public void traverse()
	{
		for(Iterator it=countryList.iterator();it.hasNext();)
		{
			String country = (String)it.next();
			System.out.println("Country name is " + country);
		}
	}
	
	public static void main(String[] args) {
		
		IteratorDemo demo = new IteratorDemo();
		demo.init();
		demo.traverse();
		
	}

}
