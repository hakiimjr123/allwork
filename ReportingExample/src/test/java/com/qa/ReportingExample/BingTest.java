package com.qa.ReportingExample;

import static org.junit.Assert.assertEquals;

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


public class BingTest {


	
	WebDriver driver= null;
	public static ExtentReports report;
	public ExtentTest test;
	
	
	String url = "http://www.bing.com/";
	final String cDFilePath = "C:\\\\Testing\\\\chromedriver.exe";
	final String driverType = "webdriver.chrome.driver";
	
	@BeforeClass
	public static void initial() {
		report = new ExtentReports("C:\\Users\\Admin\\Desktop\\testPage.html", false);
	}
	
	
	@Before 
	public void setup() {
		System.setProperty(driverType, cDFilePath);
		driver = new ChromeDriver();
		
	}
	
	
	@Test
	public void bingSearchBox() {
		test = report.startTest("bingSearchBox");
		driver.get(url);
		test.log(LogStatus.INFO, "BING Opened");
		BingPage page = PageFactory.initElements(driver,BingPage.class);
		page.searchFor1("selenium");
		
		WebElement checkElement = driver.findElement(By.xpath("//*[@id=\"b_context\"]/li[1]/div/div[1]/h2"));
		if(checkElement.getText().equals("Selenium")) {
			test.log(LogStatus.PASS, "Search Text Was Found!");
		}
		else {
			test.log(LogStatus.FAIL, "Search Text Was Not found");
		}
		assertEquals("Selenium", checkElement.getText());
		report.endTest(test);
		
	}
	
	@After
	public void tearDown() throws InterruptedException{
		Thread.sleep(5000);
		driver.close();
	}
	
	
	@AfterClass
	public static void end() {
		report.flush();
	}
}



