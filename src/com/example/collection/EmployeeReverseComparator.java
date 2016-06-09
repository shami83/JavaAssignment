package com.example.collection;

import java.util.Comparator;

public class EmployeeReverseComparator implements Comparator{


	public int compare(Object o1, Object o2) {
		Employee arg0 = (Employee)o1;
		Employee arg1 = (Employee)o2;
		
		return arg1.getName().compareTo(arg0.getName());
	}

}
