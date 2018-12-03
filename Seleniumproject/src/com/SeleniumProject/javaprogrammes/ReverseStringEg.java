package com.SeleniumProject.javaprogrammes;

public class ReverseStringEg {

	public static void main(String[] args) 
	{
		String rev="";
		String course="madam";  // layaK
		
		//madam-----------madam
		
		int len=course.length();
//		for (int i = 0; i < len; i++)
//		{
//			System.out.println(course.charAt(i));
//		}
		
		for (int i = len-1; i >= 0; i--) 
		{
//			System.out.print(course.charAt(i));
			rev=rev+course.charAt(i);
		}
		System.out.println(rev);

		if (course.equalsIgnoreCase(rev))
		{
			System.out.println("Given string is a polyndrome");
		}
		else
		{
			System.out.println("Given string is not a polyndrome");
		}
	}

}
