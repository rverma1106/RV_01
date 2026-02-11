package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Booking {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\rusha\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\\\chromedriver.exe");
		
		 WebDriver x = new ChromeDriver();
		 x.get("https://www.facebook.com/");
		 
		 x.manage().window().maximize();
		 
		 Thread.sleep(2000);
		 
		 x.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		 Thread.sleep(2000);
		 
		 x.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rushali");
		 x.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Verma");
		 
		 
		 List <WebElement> BirthDate = x.findElements(By.xpath("//select[@id=\"day\"]/option"));
		 BirthDate.get(5).click();
		 
		 List <WebElement> BirthMonth = x.findElements(By.xpath("//select[@id=\"month\"]/option"));
		 BirthMonth.get(5).click();
		 
		 List <WebElement> BirthYear = x.findElements(By.xpath("//select[@id=\"year\"]/option"));
		 BirthYear.get(21).click();
	
		 
		 
		 
		 
		 
		// Select day = new Select(x.findElement(By.xpath("//select[@name='birthday_day']")));
		 //day.selectByVisibleText("1");
		 //Select month = new Select(x.findElement(By.xpath("//select[@name='birthday_month']")));
		 //month.selectByVisibleText("Jan");
		 //Select year = new Select(x.findElement(By.xpath("//select[@name='birthday_year']")));
		 //year.selectByVisibleText("1993");
		 
		 x.findElement(By.xpath("//input[@value='1']")).click();
		 x.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567890");
		 x.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("123456");
		 x.findElement(By.xpath("//button[@name='websubmit']")).click();
		 
		 Thread.sleep(20000);
		 String actualText = x.findElement(By.id("reg_error_inner")).getText();
		 String expectedText = "An error occurred. Please try again.";

		 if (actualText.equals(expectedText)) 
		 {
		     System.out.println("PASS: Text is verified");
		 } else {
		     System.out.println("FAIL: Expected -> " + expectedText +
		                        " | Actual -> " + actualText);
		 }
		 	}
}
