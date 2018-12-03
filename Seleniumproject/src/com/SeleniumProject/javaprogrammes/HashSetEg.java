package com.SeleniumProject.javaprogrammes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEg {

	public static void main(String[] args)
	{
		Set<Object> s=new HashSet<>();
		
		s.add("Kayal");
		s.add("Apple");
		s.add("Boll");
		s.add("Sharath");
		s.add("Selenium");
		s.add("basket");
		s.add("Kayal");
		s.add(60000);
		s.add(true);
		
		
		Iterator<Object> it=s.iterator();
		
		while (it.hasNext())
		{
			Object data=it.next();
			System.out.println(data);
		}
	}

}
