package com.SeleniumProject.javaprogrammes;

public class ObjectEg {

	public static void main(String[] args) 
	{
		Object[] x={10000,222.22,'N',"Selenium",true};
		
		System.out.println(x.length);
		
		for(Object data: x)
		{
			System.out.println(data);
		}
	}

}
