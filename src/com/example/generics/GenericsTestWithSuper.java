package com.example.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsTestWithSuper {
	
	public void testSubtype(List<? super Car> list)
	{
		Car v = new Car();
		v.setName("Four Wheeler");
		v.setBrand("BMW");
		
				
		list.add(v);
		for(Object c : list)
		{
			Car car= (Car)c;
			
			System.out.println("Element is " + car);
		}
		
	}
	
	
	public static void main(String[] args) {
		List<Vehicle> carList = new ArrayList<Vehicle>();
		Car car = new Car();
		car.setBrand("Audi");
		car.setName("Four Wheeler");
		
		carList.add(car);
		
		GenericsTestWithSuper test = new GenericsTestWithSuper();
		test.testSubtype(carList);
		
	}

}
