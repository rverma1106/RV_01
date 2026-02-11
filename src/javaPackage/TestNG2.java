package javaPackage;
import org.testng.annotations.*;

public class TestNG2 {
	
	//sequence of execution is in alphanumeric order
	
	@Test(enabled = false) // to skip the method
	public void a()
	{
		System.out.println("a method passed");
	}
	
	@Test (priority = -1) //to set the priority
	public void c()
	{
		System.out.println("c method passed");	
	}
	
	@Test (dependsOnMethods={"c"}) // dependency on other method
	public void b()
	{
		System.out.println("b method passed");
	}
}