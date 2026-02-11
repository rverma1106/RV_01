package javaPackage;

public class Constructor1 {
 
	
	Constructor1(){
		System.out.println("Default Constructor");
	}
	
	Constructor1(int a){
		
		System.out.println("Int parameter");
	}
	
	Constructor1(String z){
		System.out.println("String parameter");
	}
	
	public static void main(String[] args) {
		Constructor1 a = new Constructor1();
		Constructor1 b = new Constructor1(3);
		Constructor1 c = new Constructor1("h");
		

	}

}
