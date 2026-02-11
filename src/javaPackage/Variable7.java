package javaPackage;

public class Variable7 {

	int a = 10;//global- memory get alloted when object is created
	static int b = 20;//static- memory get alloted when class is created
	
	public static void main(String[] args) {
		int c = 30;//local-memory get alloted when method is created
		
		Variable7 z=new Variable7();//Object created
		
		System.out.println(z.a);
		System.out.println(Variable7.b); //calling static variable - it can also be directly called as below
		System.out.println(b);
		System.out.println(c);

	}

}
