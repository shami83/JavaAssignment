package com.example.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListUsingGenerics {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Cat");
		list.add("Dog");
		//list.add(new Integer(10));
		
		for(Iterator<String> it=list.iterator();it.hasNext();)
		{
			String obj = it.next();
			System.out.println(obj);
		}
		
		
	}

}
