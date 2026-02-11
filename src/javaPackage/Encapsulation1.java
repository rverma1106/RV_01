package javaPackage;

public class Encapsulation1 {

	
	
	//It is the technique to wrap the code in single unit
	//keyword - final
	//variable - we cannot change the value of the variable
	//method- we cannot override the method
	//class-we cannot inherit the class
	
	String x = "hi";
	int y =10;
	final int z=50;
	
		
		public void a()
		{
			
			y=20; //overriding the non final variable
			
			// z=100; //we cannot change value of z as it is a final keyword 
		}
		
		final void b()
		{
			System.out.println("hello");
		}
	}


