package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\rusha\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			 driver.get("https://demoqa.com/droppable");
			 
			 driver.manage().window().maximize();
			 
			 
			 Thread.sleep(3000);
			 
			 WebElement SourceElement = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
			 WebElement TargetElement = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
	
			 Actions act = new Actions(driver);
			 
			 act.dragAndDrop(SourceElement, TargetElement).perform();		 
	
			 driver.manage().deleteAllCookies();
	}

	}


