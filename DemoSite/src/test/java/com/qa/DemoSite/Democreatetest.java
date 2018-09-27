package com.qa.DemoSite;



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


public class Democreatetest {
	
	public static ExtentReports report;
	public ExtentTest test;
	
	
	WebDriver driver = null;
	String url = "http://thedemosite.co.uk/";
	String url2 = "http://thedemosite.co.uk/login.php";
	final String cDFilePath = "C:\\\\Testing\\\\chromedriver.exe";
	final String driverType = "webdriver.chrome.driver";
	
	@BeforeClass
	public static void initial() {
		report = new ExtentReports("C:\\Users\\Admin\\Desktop\\DemotestPage.html", true);
	}
	
	
	@Before
	public void setup() {
		System.setProperty(driverType, cDFilePath);
		driver = new ChromeDriver();
		
	}

		@Test
		public void Demosee() {
			test = report.startTest("Demo Site Tests!");
			
			driver.get(url);
			test.log(LogStatus.INFO, "Demo site will go to Homepage");
			WebElement checkElement = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]"));
			
			
			checkElement.click();
			
			
			
			
			DemoSite page = PageFactory.initElements(driver,DemoSite.class);
			page.createFor("MyCat123","GoesMeow!");
			
			driver.get(url2);
			
			
			DemoLogin page1 = PageFactory.initElements(driver,DemoLogin.class);
			page1.loginFor("MyCat123","GoesMeow!");
			
			WebElement checker = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));
			if(checker.getText().equals("**Successful Login**")) {
				test.log(LogStatus.PASS, "YOU HAVE SUCCESFULLY SIGNED UP AND WERE FAST ENOUGH TO LOG IN!");
			}
			else {
				test.log(LogStatus.FAIL, "YOU HAVE FAILED TRY AGAIN!");
			}
		
			
			assertEquals("**Successful Login**", checker.getText());
			report.endTest(test);
		}
			
			
			
			
			@Test
			public void Demoseen() {
				test = report.startTest("Demo Site Test(2)");

				
				driver.get(url);
				test.log(LogStatus.INFO, "Demo site will go to Homepage Part2");

				WebElement checkElement = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]"));
				
				
				checkElement.click();
				
				
				
				
				DemoSite page = PageFactory.initElements(driver,DemoSite.class);
				page.createFor("MyCat123","GoesMeow!");
				
				driver.get(url2);
				
				
				DemoLogin page1 = PageFactory.initElements(driver,DemoLogin.class);
				page1.loginFor("MyCat123","GoesMe!!");
				
				WebElement checker1 = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));
				if(checker1.getText().equals("**Successful Login**")) {
					test.log(LogStatus.PASS, "YOU HAVE SUCCESFULLY SIGNED UP AND WERE FAST ENOUGH TO LOG IN!");
				}
				else {
					test.log(LogStatus.FAIL, "YOU HAVE FAILED TRY AGAIN!");
				}
			
				
				assertEquals("**Successful Loginn**", checker1.getText());
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
