package javaPackage;

public class Constructor {

	
	//Default Constructor
	 Constructor(){
		System.out.println("Default Constructor");
	}
	
	 
	 
	int roll;
	String  name;
	//Parameterized Constructor
	Constructor (int r, String n){
		roll = r;
		name = n;
		
		System.out.println("Parameterized constructor"+ " "+r +" "+ n);
	}
	
	public static void main(String[] args) {
		Constructor c1 = new Constructor();
		Constructor c2 = new Constructor(1, "Rushali");
	}

}
