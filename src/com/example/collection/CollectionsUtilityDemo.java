package com.example.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsUtilityDemo {
	
	List list;
	
	public void addToCollection()
	{
		list = new  ArrayList();
		list.add("Shamik");
		list.add("Samir");
		
		System.out.println("List is " + list);
		Collections.addAll(list, "Swastika","Mayukh");
		System.out.println("Now after adding List is " + list);
		
	}
	
	public void binarySearch()
	{
		list = new  ArrayList();
		list.add("Shamik");
		list.add("Samir");
	
		int index= Collections.binarySearch(list, "Shamik");
		System.out.println("Index of Search element is " + index);	
        index= Collections.binarySearch(list, "Swastika");
		System.out.println("Index of Search element is " + index);	//print the insertable position if the element not in the collection 	
		
	}
	
	public void dynamicTypeSafe()
	{
		list = new  ArrayList();
		list.add("Shamik");
		list.add("Samir");
		
		Collection<String> tslst= Collections.checkedList(list, String.class);
		System.out.println(tslst);
	}
	
	public void copyList()
	{
		list = new  ArrayList(2);
		list.add("Shamik");
		list.add("Samir");
		
		List destList = new ArrayList(2);
		destList.add("Swastika");
		destList.add("Mayukh");
		
		
		System.out.println("Source list before copy" + list);
		System.out.println("Destination list before copy" + destList);
		Collections.copy(destList, list);
		System.out.println("Source list after copy" + list);
		System.out.println("Destination list after copy" + destList);
		
		
		
	}
	
	public void checkCommonelement()
	{
		list = new  ArrayList(2);
		list.add("Shamik");
		list.add("Samir");
		
		List destList = new ArrayList(2);
		destList.add("Swastika");
		destList.add("Mayukh");
		
		boolean uncommon = Collections.disjoint(list, destList);
		System.out.println("List are uncommon " + uncommon);
		
	}
	
	public void findFrequency()
	{
		list = new  ArrayList();
		list.add("Shamik");
		list.add("Samir");
		list.add("Samir");
		
		int freq= Collections.frequency(list, "Samir");
		System.out.println("Frq of element is " + freq);
		
		
	}
	
	public void findMinMax()
	{
		list = new  ArrayList();
		list.add(5);
		list.add(15);
		list.add(55);
		list.add(123);
		list.add(-6);
		
		int min = Collections.min(list);
		int max=  Collections.max(list);
		
		System.out.println("Min Value is: "+ min + " -- Max value is: "+ max);
	}
	
	public void reverseList()
	{
		list = new  ArrayList();
		list.add(5);
		list.add(15);
		list.add(55);
		list.add(123);
		list.add(-6);
		
		System.out.println("Before reverse :" + list);
		Collections.reverse(list);
		System.out.println("After reverse :" + list);
		
		
	}
	
	public void rotateList()
	{
		list = new  ArrayList();
		list.add(5);
		list.add(15);
		list.add(55);
		list.add(123);
		list.add(-6);
		System.out.println("Before rotate :" + list);
		Collections.rotate(list,3);
		System.out.println("After rotate :" + list);
	}
	
	public void shuffleList()
	{
		list = new  ArrayList();
		list.add(5);
		list.add(15);
		list.add(55);
		list.add(123);
		list.add(-6);
		System.out.println("Before shuffle :" + list);
		Collections.shuffle(list);
		System.out.println("After shuffle :" + list);
		
		
	}
	
	public void sortList()
	{
		list = new  ArrayList();
		list.add(5);
		list.add(15);
		list.add(55);
		list.add(123);
		list.add(-6);
		System.out.println("Before sorting :" + list);
		Collections.sort(list);
		System.out.println("After sorting :" + list);
		
		
	}
	
	public void swapPostion()
	{
		list = new  ArrayList();
		list.add(5);
		list.add(15);
		list.add(55);
		list.add(123);
		list.add(-6);
		System.out.println("Before Swap :" + list);
		Collections.swap(list,0,3);
		System.out.println("After swap :" + list);
		
	}
	
	
	public static void main(String[] args) {
		
		CollectionsUtilityDemo demo = new CollectionsUtilityDemo();
		demo.addToCollection();
		demo.binarySearch();
		demo.dynamicTypeSafe();
		demo.copyList();
		demo.checkCommonelement(); 
		demo.findFrequency();
		demo.findMinMax();
		demo.reverseList();
		demo.rotateList();
		demo.shuffleList();
		demo.sortList();
		demo.swapPostion();
	}

}
