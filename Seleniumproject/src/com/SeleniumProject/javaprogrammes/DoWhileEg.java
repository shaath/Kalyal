package com.SeleniumProject.javaprogrammes;

public class DoWhileEg {

	public static void main(String[] args)
	{
		int i=1;
		
		do
		{
			System.out.println(i);
			if (i==300)
			{
				break;
			}
			i++;
		}
		while(i<=500);
		
		
		int j=500;
		do
		{
			System.out.println(j);
			j--;
		}
		while(j>=1);

	}

}
