package com.example.InnerClass;

import com.example.InnerClass.Outer.Inner;

public class OtherClass {
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		
		Inner inner= outer.new Inner();
		System.out.println(inner.msg);
	}

}
