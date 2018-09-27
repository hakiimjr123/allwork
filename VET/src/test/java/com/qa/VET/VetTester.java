package com.qa.VET;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.assertEquals;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VetTester {
	
	WebDriver driver;
	public static ExtentReports report;
	public ExtentTest test;
	
	@Before
	public void setup() {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Testing\\\\\\\\chromedriver.exe");
		driver = new ChromeDriver();

		
		
	}
	
	
	@Given("^a vet$")
	public void a_vet()  {
	   driver.get(VetConstants.url);
	   
	   
	}

	@When("^I click on some records$")
	public void i_click_on_some_records() {
	    VetsPage VetIndex = PageFactory.initElements(driver, VetsPage.class);
	    VetIndex.Drops(driver);
	    
	}

	@Then("^I can see the care available for animals$")
	public void i_can_see_the_care_available_for_animals()  {
	 WebElement Surge = driver.findElement(By.xpath("//*[@id=\"vets\"]/tbody/tr[4]/td[2]/div"));
	 assertEquals("surgery", Surge.getText());

	    
	}

	@Given("^an admin$")
	public void an_admin()  {
		  driver.get(VetConstants.url2);
		
	    
	   
	}

	@When("^I update a record$")
	public void i_update_a_record() {
		UpdateVet Vetnew = PageFactory.initElements(driver, UpdateVet.class);
		Vetnew.update(driver);
		
		
	   
	  
	}

	@Then("^the correct details are now shown$")
	public void the_correct_details_are_now_shown() {
	  WebElement Radio = driver.findElement(By.xpath(" //*[@id=\"vets\"]/tbody/tr[1]/td[2]/div"));
	  assertEquals("radiology", Radio.getText());
	  
	}

	@When("^I delete a animal$")
	public void i_delete_a_animal()  {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^emails arent sent to deceased annimals$")
	public void emails_arent_sent_to_deceased_annimals()  {
	    // Write code here that turns the phrase above into concrete actions
	 
	}

	@When("^I add new records$")
	public void i_add_new_records()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^the records are correct$")
	public void the_records_are_correct()  {
	    // Write code here that turns the phrase above into concrete actions
	 
	}

	@When("^I add new owners to the records$")
	public void i_add_new_owners_to_the_records() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^the details show the change$")
	public void the_details_show_the_change()  {
	    // Write code here that turns the phrase above into concrete actions
	   
	}


	@After
	public void tearDown() {
		
		driver.close();
		driver.quit();
}
}