package com.SeleniumProject.javaprogrammes;

public class ForEg {

	public static void main(String[] args)
	{		//initialization;condition; Incrementor
		
						   //i=i+1
//		for(int i=1;i <=10;i++)
//		{
//			System.out.println("Hi");
//		}
		System.out.println("Incrementor loop");
		for(int i=1; i<=100 ; i++)
		{
			System.out.println(i);
		}
		
		System.out.println("Decrementor loop");
		for(int i=100; i > 0; i--)
		{
			System.out.println(i);
			if(i == 70)
			{
				break;
			}
		}
	}

}
