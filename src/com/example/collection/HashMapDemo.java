package com.example.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {
	
	Map map = new HashMap();
	
	
	public void init()
	{
		map.put("Shamik", "IT");
		map.put("Samir", "Govt");
		System.out.println("Map is" + map);
	}
	
	public void addElement(String key,String value)
	{
		map.put(key, value);
		System.out.println("After add Map is" + map);
	}
	
	public void removeElement(String key)
	{
		map.remove(key);
		System.out.println("After remove Map is" + map);
	}
	
	public void traverseThroughEntrySet()
	{
		System.out.println("Traverse through entryset");
		for(Iterator it=map.entrySet().iterator();it.hasNext();)
		{
			Entry obj = (Entry) it.next();
			System.out.println("Key: " + obj.getKey()+ " value : "+ obj.getValue());
			
		}
		
	}
	
	public void traverseThroughKeySet()
	{
		System.out.println("Traverse through keyset");
		for(Iterator it=map.keySet().iterator();it.hasNext();)
		{
			String key = (String) it.next();
			String value=(String) map.get(key);
			System.out.println("Key: " + key+ " value : "+ value);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		HashMapDemo demo = new HashMapDemo();
		demo.init();
		demo.addElement("Swastika", "IT");
		demo.removeElement("Swastika");
		demo.traverseThroughEntrySet();
		demo.traverseThroughKeySet();
		
	}
	
	
	
	
	

}
