package javaPackage;

public class MethodOverriding2 extends MethodOverriding1 {

	
	public void eat () {
		System.out.println("eat again");
	}

	public static void main(String[] args) {
		MethodOverriding2 z= new MethodOverriding2();
		z.eat();
		
		MethodOverriding1 y= new MethodOverriding1();
		y.eat();
		
	}

}
