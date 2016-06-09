package com.example.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericTest {
	
	public static void main(String[] args) {
		
		List<Vehicle>list = new ArrayList<Vehicle>();
		
		Vehicle v1 = new Vehicle();
		v1.setName("Rickshaw");
		
		Car c= new Car();
		c.setName("car");
		c.setBrand("BMW");
		
		list.add(v1);
		list.add(c);
		
		for(Iterator<Vehicle> it=list.iterator();it.hasNext();)
		{
			Vehicle obj = it.next();
			System.out.println(obj.getName());
		}
		
	}

}
