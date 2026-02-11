package javaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogleChrome1 {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\rusha\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\\\chromedriver.exe");
		//System -predefined class in java
		//set property - method (method in chrome driver)
		//webdriver.chrome.driver - chrome driver property
		//path - executable path of chrome driver
		
		
		
		 WebDriver driver = new ChromeDriver();
		 //Webdriver - Interface which is allowing us to go outside the eclipse and explore the other properties of chrome
		 //driver is reference name - it can be anything
		 //new - Keyword
		 //chromedriver - class
		 
		 driver.get("https://www.facebook.com//");
		 //driver - can be anything as it is just a reference name
		 //get - method (implemented inside the chromedriver class)- to open the url
		 
	}

}
//Ctrl+A and CTRL+SHIFT+O is shortcut to import all libraries
//Webdriver - Interface
//Chromedriver - class
