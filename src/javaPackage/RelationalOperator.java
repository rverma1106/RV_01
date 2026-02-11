package javaPackage;

public class RelationalOperator {

	public static void main(String[] args) {
		int p=100;
		int q=300;
		
		
		if(p!=q) {
		System.out.println(true);
		}
		else {
		System.out.println(false);
		}
		
		
		String a="rushali";
		String b="RUSHALI";
		if(a==b) {
			System.out.println(true);
			}
			else {
			System.out.println(false);
			}
			
		if(a.equalsIgnoreCase(b)) {
			System.out.println(true);
			}
			else {
			System.out.println(false);
			}
			
	}

}
