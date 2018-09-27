package com.qa.CucumberTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import static org.junit.Assert.assertEquals;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PassionTeaTests {

	WebDriver driver;
	public static ExtentReports report;
	public ExtentTest test;
	
	@Before
	public void setup() {
		CucumConstants.CuCumCount++;
		CuCumExcel.DataManage(CucumConstants.Path_DemoData + CucumConstants.File_DemoData,0);
		report = Testrunner.report;
		test = report.startTest("Looking For tea Test" +CucumConstants.CuCumCount);
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Testing\\\\\\\\chromedriver.exe");
		driver = new ChromeDriver();
	
	}
	
	
	
	@Given("^the correct web address$")
	public void the_correct_web_address()  {
		driver.get(CucumConstants.url);
		test.log(LogStatus.INFO, "You Have opened Passion Tea WebPage!");
	}

	@When("^I navigate to the 'Menu' page$")
	public void i_navigate_to_the_Menu_page()  {
		CucumMenu Menuselect = PageFactory.initElements(driver,CucumMenu.class);
		Menuselect.selectMenu();
		test.log(LogStatus.INFO, "Here You Have Selected The Menu and Should be Taken To See Beverage Options!");
	}

	@Then("^I can browse a list of the available products\\.$")
	public void i_can_browse_a_list_of_the_available_products() {
	
		WebElement GreenT = driver.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000453230000\"]/div/p/span/span/strong"));
		if(GreenT.getText().equals("Green Tea")) {
			test.log(LogStatus.PASS, "If You See The First Option That Is Green Tea, Then You Have Successfully Navigated To The Menu Page!");
			CuCumExcel.setCellData("PASS", CucumConstants.CuCumCount, 1);
		}
		else{
			test.log(LogStatus.FAIL, "YOU HAVE FAILED TO NAVIGATE PLEASE CHECK CODE!");
			CuCumExcel.setCellData("FAIL", CucumConstants.CuCumCount, 1);
		}
	    assertEquals("Green Tea", GreenT.getText());
	    
	}

	@When("^I click the checkout button$")
	public void i_click_the_checkout_button(){
	
	CucumGotoCheck getCheck =  PageFactory.initElements(driver, CucumGotoCheck.class);
		getCheck.Checkselect();
		test.log(LogStatus.INFO, "From the Main Passion Tea WebPage Select the Checkout Button on the side Navigation Bar");
	}

	@Then("^I am taken to the checkout page$")
	public void i_am_taken_to_the_checkout_page() {
	   WebElement  CheckOut = driver.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000451989411\"]/div/p/span/strong"));
	   if(CheckOut.getText().equals("Pay with Credit Card or Log In")) {
			test.log(LogStatus.PASS, "On The Top Of The Page We should see Pay With Credit Card Or Log In, if we do Congrats my G!");
			CuCumExcel.setCellData("PASS", CucumConstants.CuCumCount, 1);
		}
		else{
			test.log(LogStatus.FAIL, "YOU HAVE FAILED TO NAVIGATE PLEASE CHECK CODE!");
			CuCumExcel.setCellData("FAIL", CucumConstants.CuCumCount, 1);
			
		}
	   
	   assertEquals("Pay with Credit Card or Log In",CheckOut.getText());
	   
	    
	}

	@After
	public void tearDown() {
		
		driver.close();
		driver.quit();
		report.endTest(test);
		report.flush();
	
	
	
	}
	
}
