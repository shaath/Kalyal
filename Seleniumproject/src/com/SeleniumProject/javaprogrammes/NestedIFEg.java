package com.SeleniumProject.javaprogrammes;

public class NestedIFEg {

	public static void main(String[] args)
	{
		int a=30;
		int b=200;
		int c=10;
		
		if (a > b & a > c)
		{
			System.out.println("a is greater");
		}
		else if(b > a & b > c)
		{
			System.out.println("b is greater");
		}
		else if (c > a & c > b)
		{
			System.out.println("c is greater");
		}

	}

}
