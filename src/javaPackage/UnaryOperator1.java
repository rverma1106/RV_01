package javaPackage;

public class UnaryOperator1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println(++a); // 11,11
		System.out.println(++b); // 21,21
		System.out.println(b++); // 21,22
		System.out.println(a++); // 11,12
		
		
		System.out.println(++a - b--); //13-22 = -9
	}

}
