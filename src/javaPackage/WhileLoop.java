package javaPackage;

public class WhileLoop {

	public static void main(String[] args) {
		int i =10;
		
		while(i<20) {//when number of iteration is fixed
			System.out.println(i);
			i++; // if this line is missed then the o/p would go into infinite loop
		
			
			//print number from 23 to 49
			int a = 23;
			while(i<50) {
				System.out.println(i);
				i++;
			}
			
		}

	}

}
