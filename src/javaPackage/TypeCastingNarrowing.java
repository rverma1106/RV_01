package javaPackage;

public class TypeCastingNarrowing {

	public static void main(String[] args) {
		//double to int
		
		double a = 5.2;
		int b = (int) a; //manual
		
		System.out.println(b);
		
		
		//string to int
		String c = "10";
		int d = Integer.parseInt(c);
		
		System.out.println(d);
		
		//int to string
		int e = 10;
		String f = String.valueOf(e);
		
		System.out.println(f);
				

	}

}
