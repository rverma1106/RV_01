package TestFramework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FB_001 {
	 
	WebDriver driver;
	@BeforeTest
	public void preRequisite() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rusha\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\\\chromedriver.exe");
	 driver = new ChromeDriver();
	
	 driver.get("https://www.facebook.com/");
	 
	 driver.manage().window().maximize();
}
	
	@Test
	
	//(dependsOnMethods = "preRequisite")
	public void A_enterUsername()
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rverma");
	}
	
	@Test
	//(dependsOnMethods = "A_enterUsername")
	public void B_enterPassword()
	{
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("guest");
	}
	
	@Test
	public void Login()
	{
		
		driver.findElement(By.xpath("//button[@name='login"
				+ "']")).click();
	}
}
