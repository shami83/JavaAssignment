package com.example.collection;

import java.util.Comparator;

public class EmployeeJobComparator implements Comparator{

	public int compare(Object o1, Object o2) {
		Employee arg0 = (Employee)o1;
		Employee arg1 = (Employee)o2;
		return arg0.getJob().compareTo(arg1.getJob());
	}

}
