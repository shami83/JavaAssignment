package com.example.generics;

public interface AddOperation<T extends Number> {
	
	public  T add(T lhs, T rhs); 

}
