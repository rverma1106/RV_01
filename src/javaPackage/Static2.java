package javaPackage;

public class Static2 {
	
	int roll;
	String Name;
	String College = "IIT";
	
	public static void main (String[] args) {
		
		Static2 s2 = new Static2();
		
		System.out.println(s2.roll);//op=0
		System.out.println(s2.Name);
		System.out.println(s2.College);
		
	}

}
