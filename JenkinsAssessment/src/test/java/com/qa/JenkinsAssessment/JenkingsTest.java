package com.qa.JenkinsAssessment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JenkingsTest {

	
	WebDriver driver;
	
	
	
	
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Testing\\\\\\\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
	@Given("^that you are on the create UserScreen$")
	public void that_you_are_on_the_create_UserScreen()  {
		driver.get(JenkinsConstants.Jurl);
	    
	}

	@When("^the User details are entered on the Create UserScreen$")
	public void the_User_details_are_entered_on_the_Create_UserScreen()  {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^the details are submitted on the Create UserScreen$")
	public void the_details_are_submitted_on_the_Create_UserScreen() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^the Username should be visible on the UsersScreen$")
	public void the_Username_should_be_visible_on_the_UsersScreen()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^the User details \"([^\"]*)\" username, \"([^\"]*)\" password, \"([^\"]*)\" confirm Password, \"([^\"]*)\" Fullname and \"([^\"]*)\" EmailAddress are entered on the Create UserScreen$")
	public void the_User_details_username_password_confirm_Password_Fullname_and_EmailAddress_are_entered_on_the_Create_UserScreen(String arg1, String arg2, String arg3, String arg4, String arg5)  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^the \"([^\"]*)\" username should be visible on the UsersScreen$")
	public void the_username_should_be_visible_on_the_UsersScreen(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Given("^the \"([^\"]*)\" username is visible on the UsersScreen$")
	public void the_username_is_visible_on_the_UsersScreen(String arg1)  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^the \"([^\"]*)\" username is clicked on the UserScreen$")
	public void the_username_is_clicked_on_the_UserScreen(String arg1)  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^the User Profile should display the \"([^\"]*)\" username on the ProfileScreen$")
	public void the_User_Profile_should_display_the_username_on_the_ProfileScreen(String arg1)  {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@Given("^the \"([^\"]*)\" Username's profile page has been loaded$")
	public void the_Username_s_profile_page_has_been_loaded(String arg1)  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("^the configure button has been clicked on the profile page$")
	public void the_configure_button_has_been_clicked_on_the_profile_page() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^I change the old email address on the Configure Page to a new email address \"([^\"]*)\"$")
	public void i_change_the_old_email_address_on_the_Configure_Page_to_a_new_email_address(String arg1)  {
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@When("^I save the changes to the Configure Page$")
	public void i_save_the_changes_to_the_Configure_Page() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^the Configure Page should show the new email address \"([^\"]*)\"$")
	public void the_Configure_Page_should_show_the_new_email_address(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@After
	public void tearDown() {
		
}
}