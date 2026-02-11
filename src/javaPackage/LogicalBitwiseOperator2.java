package javaPackage;

public class LogicalBitwiseOperator2 {

	public static void main(String[] args) {
//verify if logical operator does not exec second statement and bitwise does
		int a=10;
		int b= 20;
		
		System.out.println(a>b && ++a<b); //logical operator wont execute second statement if the first is false
		System.out.println(a);
		
		System.out.println(a>b & ++a<b); //bitwise operator will execute both the statement even if the first is true or false
		System.out.println(a);
	}

}
