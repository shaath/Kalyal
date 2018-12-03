package com.SeleniumProject.javaprogrammes;

public class InteraceReuseEg {

	public static void main(String[] args) 
	{
		InterfaceEg ii=new InterfaceImplements();
		
		ii.ship();
		
		InterfaceEg kayal=new InterfaceImplements2();
		kayal.ship();
		

	}

}
