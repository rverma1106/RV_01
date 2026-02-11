package javaPackage;

public class Variable9 {

	static int a =10;
	static int b = 20;
	//identification phase - static variables are allocated first and then rest
	
	//execution phase - however it prints based on tthe sequence of syso statement
	
	public static void main(String[] args) {
	
		int c = 30;
		int d = 40;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(a);
		System.out.println(b);
		
	}

}
