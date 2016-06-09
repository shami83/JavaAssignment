package com.example.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsMethod {
	
	
	
	public void testSubtype(List<Vehicle> list)
	{
		System.out.println(list);
	}
	
	
	public static void main(String[] args) {
		List<Car> carList = new ArrayList<Car>();
		Car car = new Car();
		car.setBrand("Audi");
		car.setName("Four Wheeler");
		
		carList.add(car);
		
		GenericsMethod test = new GenericsMethod();
		//test.testSubtype(carList);
		
	}

}
