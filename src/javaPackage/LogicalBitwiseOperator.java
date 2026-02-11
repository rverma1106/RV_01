package javaPackage;

public class LogicalBitwiseOperator {

	public static void main(String[] args) {

		int a=10;
		int b= 20;
		
		System.out.println(a>b && a<b); //logical operator wont execute second statement if the first is false
		

		System.out.println(a>b & a<b); //bitwise operator will execute both the statement even if the first is true or false
	}

}
