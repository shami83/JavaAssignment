package com.example.ObjectMethod;

public class EqualsTest {
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setName("James Bond");
		emp.setEmpId(7);
		
		
		
		Employee emp1 = emp; // two refrence point to same Object so == test will pass
		
		Employee emp2 = new Employee();
		emp.setName("James Bond");
		emp.setEmpId(7);// Create a new Object with sa,e parameters so euals test pass but == test fails as memory location is different.
		
		
		System.out.println("== test for emp and emp1 refrence which points to same object value is " + (emp==emp1));

		System.out.println("== test for emp and emp2 refrence which points to diff object value is " + (emp==emp2));

		System.out.println("equlas test for emp and emp1 they are same object so value is " + emp.equals(emp1));
		
		System.out.println("equlas test for emp and emp2 they are meaning fully equvalent but diff object so value is " + emp.equals(emp1));
		
		
		
	}

}
