package com.qa.ShoppingSite;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class ShoppingTestings {

	
	
	
 WebDriver driver = null;
 public static ExtentReports report;
	public ExtentTest test;
	
	
	
	String url = "http://automationpractice.com/index.php";
	final String cDFilePath = "C:\\Testing\\chromedriver.exe";
	final String driverType = "webdriver.chrome.driver";
	
	@BeforeClass
	public static void initial() {
		report = new ExtentReports("C:\\Users\\Admin\\Desktop\\testPage.html", false);
	}
	
	
	@Before
	public void setup() {
		System.setProperty(driverType, cDFilePath);
		driver = new ChromeDriver();
		driver.get(url);
}
	
	@Test
	public void test()	{
	
		test = report.startTest("Dress Browsing");
		
		test.log(LogStatus.INFO, "We will search for dresses by entering 'Dress'");
		
		Shoppinghome firstPage = PageFactory.initElements(driver,Shoppinghome.class);
		firstPage.searching("Dress");
		
	
		ShoppingResults secondPage = PageFactory.initElements(driver, ShoppingResults.class);
		secondPage.myDress(driver);
		
		
		WebElement checker = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div/div[3]/h1"));
		
		
		if(checker.getText().equals("Printed Summer Dress")) {
			test.log(LogStatus.PASS, "Dress search was succesful! Meaning text box and search button work very well");
		}
		else {
			test.log(LogStatus.FAIL, "the Select key may not be working ");
		}
		assertEquals("Printed Summer Dress", checker.getText());
		report.endTest(test);
		
	
		
		
		
	}


@After
public void teardown() {
	driver.quit();

}
@AfterClass
public static void end() {
	report.flush();
}
}

