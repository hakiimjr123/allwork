package com.qa.quickstart.katalon;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
 WebDriver driver;
 String url = "https://www.skysports.com";
 final String cDFilePath = "C:\\Testing\\chromedriver.exe";
	final String driverType = "webdriver.chrome.driver";	 
	@Before
	public void setup() {
		System.setProperty(driverType, cDFilePath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		

		
	}
	@Test
	public void test() {
		
WebElement checkElement = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div/div/div/div/a"));
		
		
		checkElement.click();
		
	
	try {
		Thread.sleep(30000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	
	@After
	public void teardown() {
		driver.quit();
		
	}
	
}

//try {
	//Thread.sleep(5000);
//} catch (InterruptedException e) {
	//// TODO Auto-generated catch block
	//e.printStackTrace();
//}
