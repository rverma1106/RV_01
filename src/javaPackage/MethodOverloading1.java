package javaPackage;

public class MethodOverloading1 {

	
		//One action can be performed in multiple ways
		//Types - Method Overloading, Method Overriding
		//Method Overloading - 
		//1. It can take place in same class or child class
		//2. It is also known as compile time polymorphism
		//3. 2 or more than 2 method name are same in the same class but the parameters are different (type of parameter or number of parameter)

	
	public void sum (int a , int b)  // user defined non-static method - does not need return type
	{
		System.out.println(a+b);
	}
	
	public void sum (int a, int b, int c)  // user defined non-static method - does not need return type
	{
		System.out.println(a+b+c);
	}

}
