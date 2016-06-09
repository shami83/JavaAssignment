package com.example.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsMethodTestUpdated {
	
	public void testSubtype(List<? extends Vehicle> list)
	{
		//list.add(new Integer(2));
		System.out.println("List is " + list);
	}
	
	
	public static void main(String[] args) {
		List<Car> carList = new ArrayList<Car>();
		Car car = new Car();
		car.setBrand("Audi");
		car.setName("Four Wheeler");
		
		carList.add(car);
		
		GenericsMethodTestUpdated test = new GenericsMethodTestUpdated();
		test.testSubtype(carList);
		
	}


}
