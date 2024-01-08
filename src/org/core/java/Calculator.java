package org.core.java;

public class Calculator {
	
	//variable,data type
	//data members
	//member function/ methods
	//int a=10;
	
	//int b=20;
	String name="Preeti";
	public int add(int a,int b)
	{
		int c= a+b;
		System.out.println(c);
		return c;
	}
	public void display(String message) {
		System.out.println("Welcome to java class!");
	}
	public int sub(int a,int b)
	{
		 int c= b-a;
		System.out.println(c);
		return c;
	}
	public static void main(String[] args) {
		Calculator obj = new Calculator();
		obj.add(10,20);
		obj.sub(20,15);
		obj.display("hello");
	}
	
	
	
	

}
