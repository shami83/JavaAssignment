package com.example.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
	
	
	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add("Cat");
		list.add("Dog");
		list.add(new Integer(10));
		
		for(Iterator it=list.iterator();it.hasNext();)
		{
			String obj = (String)it.next();
			System.out.println(obj);
		}
		
		
	}

}
