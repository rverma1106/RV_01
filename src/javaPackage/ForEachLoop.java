package javaPackage;

public class ForEachLoop {

	public static void main(String[] args) {
		// it is used to traverse array
		
		Object i []= {0,1,"hi",'i', 10>12, 5,60};
		String j[]= {"hi","my","name","is","Rushali"};
		
		//print array using for loop
		
		for(Object a: i) {//when number of iteration is fixed
			System.out.println(a);
		}
		
		for(String b:j) {
			System.out.println(b);
		}
		
		

	}

}
