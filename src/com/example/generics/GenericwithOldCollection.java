package com.example.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericwithOldCollection {
	
	public void testSubtype(List list)
	{
		Car v = new Car();
		v.setName("Four Wheeler");
		v.setBrand("BMW");
		
				
		list.add(v);
		list.add(new Integer(2));
		for(Object c : list)
		{
			Car car= (Car)c;
			
			System.out.println("Element is " + car);
		}
		
	}
	
	public void testRaw(List<Car> list)
	{
		System.out.println("element is " + list);
	}
	
	
	public static void main(String[] args) {
		List<Vehicle> carList = new ArrayList<Vehicle>();
		Car car = new Car();
		car.setBrand("Audi");
		car.setName("Four Wheeler");
		
		carList.add(car);
		
		GenericwithOldCollection test = new GenericwithOldCollection();
		test.testSubtype(carList);
		
		
		List list = new ArrayList();
		list.add(new Integer(23));
		test.testRaw(list);
	}


}
