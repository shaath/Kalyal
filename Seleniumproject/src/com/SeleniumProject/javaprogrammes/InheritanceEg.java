package com.SeleniumProject.javaprogrammes;

public class InheritanceEg extends MethodsEg
{
	public static void main(String[] args)
	{
		Function1();
		
		MethodsEg m=new MethodsEg();
		int res=m.sum(300, 500);
		System.out.println(res);

	}

	public static void Function1()
	{
		System.out.println("This is child class Finction1 code");
		
	}
	
}
