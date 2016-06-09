package com.example.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSortManager {
	
	public static void main(String[] args) {
		
		List empList = new ArrayList();
		Employee emp1  = new Employee();
		emp1.setJob("IT");
		emp1.setName("Shamik");
		
		Employee emp2  = new Employee();
		emp2.setJob("GOVT");
		emp2.setName("Samir");
		
		Employee emp3  = new Employee();
		emp3.setJob("IT");
		emp3.setName("Swastika");
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		
		System.out.println("Before Sorting" + empList);
		
		Collections.sort(empList);
		
		System.out.println("After Sorting" + empList);
		
		
		
	}

}
