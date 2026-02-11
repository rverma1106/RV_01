package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rusha\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@id=\"confirmButton\"]")).click();
		driver.switchTo().alert().accept();
		
		String actualText = driver.findElement(By.id("confirmResult")).getText();
		 String expectedText = "You selected Ok";
		
		 if (actualText.equals(expectedText)) 
		 {
		     System.out.println(actualText);
		 } else {
		     System.out.println("FAIL: Expected -> " + expectedText +
		                        " | Actual -> " + actualText);
		 }
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id=\"confirmButton\"]")).click();
		driver.switchTo().alert().dismiss();
		
		 String actualText1 = driver.findElement(By.id("confirmResult")).getText();
		 String expectedText1 = "You selected Cancel";
		
		 if (actualText1.equals(expectedText1)) 
		 {
		     System.out.println(actualText1);
		 } else {
		     System.out.println("FAIL: Expected -> " + expectedText1 +
		                        " | Actual -> " + actualText1);
		 }

	
	driver.quit();
	}
	

}
