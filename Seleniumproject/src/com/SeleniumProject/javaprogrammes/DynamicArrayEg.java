package com.SeleniumProject.javaprogrammes;

public class DynamicArrayEg {

	public static void main(String[] args)
	{
		Object[] x=new Object[5];

		System.out.println(x.length);
		
		x[4]=60000;
		x[2]="Selenium";
		x[4]="Kayal";
		
		
		for (int i = 0; i < x.length; i++) 
		{
			System.out.println(x[i]);
		}
	}

}
