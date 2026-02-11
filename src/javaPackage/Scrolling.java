package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	
	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\rusha\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://demoqa.com/automation-practice-form");
		 
		 driver.manage().window().maximize();
		 
		 
		 Thread.sleep(3000);
		 
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 
		 
		 //using pixel
		 js.executeScript("window.scrollBy(0,500)");
		 Thread.sleep(3000);
		 
		 js.executeScript("window.scrollBy(0,-500)");
		 Thread.sleep(3000);
		 
		 
		 //until found the element
		 WebElement x = driver.findElement(By.xpath("//button[@id=\"submit\"]"));
		 js.executeScript("arguments[0].scrollIntoView()", x);
		 
		 
		 
		 
		 

	}

}
