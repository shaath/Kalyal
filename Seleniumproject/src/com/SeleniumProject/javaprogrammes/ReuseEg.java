package com.SeleniumProject.javaprogrammes;

public class ReuseEg {

	public static void main(String[] args)
	{
		MethodsEg m=new MethodsEg();

		int res=m.sum(600,400);
		System.out.println(res);
		
		res=m.sum(600,400,500);
		System.out.println(res);

//		boolean flag=m.Comp(60, 400);
//		System.out.println(flag);
	}

}
