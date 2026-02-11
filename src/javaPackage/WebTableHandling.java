package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rusha\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://money.rediff.com/gainers");
		List<WebElement> allCompanies = driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr/td[1]"));
		System.out.println("Total Number of companies in the table are" +" "+ allCompanies.size());
		
		for (WebElement company:allCompanies)
		{
			System.out.println(company.getText());
		}
		driver.quit();
		
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		Thread.sleep(5000);
		driver1.get("https://demoqa.com/webtables");
		List<WebElement> allCompanies1 = driver1.findElements(By.xpath("//div[@class=\"rt-tr-group\"]"));
		System.out.println("Total Number of rows in the table are" +" "+ allCompanies1.size());
		
		for(WebElement company1: allCompanies1)
		{
			System.out.println(company1.getText());
		}
		
		driver.quit();
		
	}

}
