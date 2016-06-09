package com.example.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo {	
	
	List arrayList=new ArrayList(); 
	
	public void addelement()
	{
		arrayList.add("Shamik");
		arrayList.add("Samir");
		System.out.println("After add collection" + arrayList);
		
	}
	public void addelement(int index,String name)
	{
		arrayList.add(index, name);
		System.out.println("After add name" + arrayList);
		
	}
	
	
	public void addelement(Collection c)
	{
		arrayList.addAll(c);
		System.out.println("After add collection" + arrayList);
		
	}
	
	public void getIndex(String name)
	{
		int index = arrayList.indexOf(name);
		System.out.println("Index pos:" + index);
	}
	
	public void getElement(int index)
	{
		String name =(String)arrayList.get(index);
		System.out.println("element : " + name);
	}
	

	public void removeElement(int index)
	{
		arrayList.remove(index);
		System.out.println("After Remove : " + arrayList);
	}
	public void removeElement(String name)
	{
		arrayList.remove(name);
		System.out.println("After Remove  by Object: " + arrayList);
	}
	
	public void toArray()
	{
		for(Object a:  arrayList.toArray())
		{
			System.out.println("Element : " + a.toString());
		}
		
		
	}
	
	
	public static void main(String[] args) {
		ArrayListDemo demo =new ArrayListDemo();
		demo.addelement();
	    demo.addelement(2,"Swastika");
	    Collection c= new ArrayList();
	    c.add("Mayukh");
	    c.add("Ajanta");
	    
	    demo.addelement(c);
	    
	    demo.getIndex("Shamik");
	    demo.getElement(3);
	    demo.removeElement(3);
	    demo.removeElement("Ajanta");
	    demo.toArray();
	    
	}
	

}
