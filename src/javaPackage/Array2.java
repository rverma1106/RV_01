package javaPackage;

public class Array2 {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[0][2]);
		
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println(a[1][2]);
		
		System.out.println(a[2][0]);
		System.out.println(a[2][1]);
		System.out.println(a[2][2]);

		System.out.println("Number of rows in 2d array is" + " "+ a.length);
		System.out.println("Number of columns in the 2d array is" +" "+ a[0].length);
		
	}

}
