package com.benisonmuller;

class Demo
{
	int a1;     // instance variable
	int a2;
	int sum;
	
	public Demo()    // Default constructor
	{
		a1 = 5;
		a2 = 5;
		System.out.println("Hello");
	}
	
	// this keyword
	public Demo(int a1, int a2)   // this keyword means if the local variable and
	                        // instance variable are same then we use this keyword
	{
		this.a1 = a1;   // current instance
		this.a2 = a2;
	}
	public Demo(int k)  // Parameterized constructor with one parameter
	{                   // local variable
		a1 = k;
		a2 = k;
	}
	
	public Demo(double d, int k)  // Parameterized constructor with two parameter
	{
		a1 = (int)d;
		a2 = k;
	}
}
public class ConstructorExample {

	public static void main(String[] args) {
		
		Demo obj = new Demo(5,5);
		
		System.out.println(obj.a1);
		System.out.println(obj.a2);
	}

}
