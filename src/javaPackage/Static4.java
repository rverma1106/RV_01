package javaPackage;

public class Static4 {
	
	static int z=11;
	static int y=10;
	

	public static void a1() {
		z=10;
		System.out.println(z);
	}
	
	public void a2() {
		z=1;
		System.out.println(z);
	}
	
	public static void main(String[] args) {

		Static4 f = new Static4();
		a1();
		f.a2();
		
	}

}
