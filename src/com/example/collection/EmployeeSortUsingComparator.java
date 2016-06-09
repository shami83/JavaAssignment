package com.example.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSortUsingComparator {
	
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
		
		Collections.sort(empList,new EmployeeReverseComparator());
		
		System.out.println("After reverse Sorting" + empList);
		
		Collections.sort(empList,new EmployeeJobComparator());
		
		System.out.println("After Sorting by job" + empList);
		
		
		
	}

}
