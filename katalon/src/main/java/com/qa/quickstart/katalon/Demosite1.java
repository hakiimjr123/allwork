package com.qa.quickstart.katalon;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demosite1 {
WebDriver driver;
String url = "http://thedemosite.co.uk/addauser.php";
final String cDFilePath = "C:\\Testing\\chromedriver.exe";
final String driverType = "webdriver.chrome.driver";

WebElement name = driver.findElement("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input");
WebElement Password = 

@Before
public void setup() {
	System.setProperty(driverType, cDFilePath);
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	
	
	
	
	
	}
	
	@Test 
	public void test() {
	
	WebElement checkElement = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"));
	
	
	checkElement.click();
	

}
