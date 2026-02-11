package javaPackage;


import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class testNG6 {
	
	@Test
	public void a() {
		AssertJUnit.assertTrue(10>200);
		System.out.println("True, hence going to second");
	}
	
	@Test(dependsOnMethods = "a")
	public void b()
	{
		System.out.println("method b is also pass");
	}
	

}
