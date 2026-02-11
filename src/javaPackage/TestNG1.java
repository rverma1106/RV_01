package javaPackage;

import org.testng.annotations.*;

public class TestNG1 {

	
	@Test
	public void a() {
		System.out.println("Method a passed");
	}
	
	
	@Test
	public void b() {
		System.out.println("Method b passed");
	}
	
	@Test
	public void c() {
		int a=5;
		int b = 10;
		if (a>b) {
		System.out.println("a greater than b");	
		}
		else {
			System.out.println("b greater than a");
		}
		
	}
}
