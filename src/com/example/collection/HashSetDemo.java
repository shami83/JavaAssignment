package com.example.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	
	HashSet set = new HashSet();
	
	public void init()
	{
		Employee emp1 = new Employee();
		emp1.setName("Shamik");
		emp1.setJob("IT");
		
		Employee emp2 = new Employee();
		emp2.setName("Samir");
		emp2.setJob("GOVT");
		
		set.add(emp1);
		set.add(emp2);
		
		System.out.println("SET is " + set);
	}
	
	
	public void addelement(Employee emp)
	{
		set.add(emp);
		System.out.println("After adding " + set);
	}
	
	public void removeElement(Employee emp)
	{
		set.remove(emp);
		System.out.println("After removing " + set);
	}
	
	public void travarse()
	{
		for(Iterator it=set.iterator();it.hasNext();)
		{
			Employee emp =(Employee)it.next();
			System.out.println("Employee " + emp.getName() + ": JOB : "+ emp.getJob());
		}
		
	}
	
	public static void main(String[] args) {
		
		HashSetDemo demo = new HashSetDemo();
		demo.init();
		
		Employee emp1 = new Employee();
		emp1.setName("Shamik");
		emp1.setJob("IT");
		demo.addelement(emp1);// try to add duplicate element
		
		Employee emp2 = new Employee();
		emp2.setName("Shamik");
		emp2.setJob("IT");
		
		demo.removeElement(emp2);
		
		demo.travarse();
		
	}

}
