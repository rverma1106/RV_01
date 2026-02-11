package javaPackage;

public class Variable5 {

	public static void main(String[] args) {
		
		int a []= {1,100,1000,20,200,2000};//array
		System.out.println(a[3]);
		System.out.println(a[5]);
		
		String b[] = {"hi","People","first","string"};//array
		System.out.println(b[3]);
		System.out.println(b[1]);
		
		Object c[]= {0,110,120,"Rushali",'c',10>100}; //all data type
		System.out.println(c[5]);
		System.out.println(c[2]);
		
		u1(); //calling method
		u2(); //calling method
	}
	
	public static void u1() {  //user defined method
		int d =10;
		System.out.println(d);
		
	}
		
		public static void u2() {//user defined method
			int e =10;
			System.out.println(e);	
	}

}
