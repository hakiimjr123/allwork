package com.qa.JenkinsAsees;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.assertEquals;

import java.util.List;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class JenkinsTest {

	WebDriver driver;
	public static ExtentReports report;
	public ExtentTest test;
	
	
	@Before
	public void setup() {
		JenkinsConstants.JenkinsCount++;
		JenkinsExcel.DataManage(JenkinsConstants.Path_DemoData + JenkinsConstants.File_DemoData, 0);
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Testing\\\\\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		report = JtestRunner.report;
		test = report.startTest("Logging Users In Jenkins!" +JenkinsConstants.JenkinsCount);
		
		driver.get(JenkinsConstants.Jurl1);
		JenkinsAdminLog firstLogin = PageFactory.initElements(driver, JenkinsAdminLog.class);
		firstLogin.firstLog("Admin", "704264254317464cb50a7dedd84ea762");
		test.log(LogStatus.INFO, "Log in as an admin First Please!");
		
	}

@Given("^that you are on the create UserScreen$")
public void that_you_are_on_the_create_UserScreen() {
    driver.get(JenkinsConstants.Jurl);
    test.log(LogStatus.INFO, "you have navigated to the create user page");
}

@When("^the User details are entered on the Create UserScreen$")
public void the_User_details_are_entered_on_the_Create_UserScreen()  {
    JenkinsCreateUser createPage = PageFactory.initElements(driver, JenkinsCreateUser.class);
    createPage.createuser("hellokitty", "kittygoMeow", "kittygoMeow", "Cat Johnson", "cats12@kttens.com");
    test.log(LogStatus.INFO, "Here You Have input details in to the field and also selected to submit these details!");
}

@When("^the details are submitted on the Create UserScreen$")
public void the_details_are_submitted_on_the_Create_UserScreen()  {
	
    
    }

@Then("^the Username should be visible on the UsersScreen$")
public void the_Username_should_be_visible_on_the_UsersScreen()  {
	WebElement catuser = driver.findElement(By.xpath("//*[@id=\"people\"]/tbody/tr[3]/td[2]/a"));
	if(catuser.getText().equals("hellokitty")) {
		test.log(LogStatus.PASS, "You have successfully logged a new user");
		JenkinsExcel.setCellData("PASS", JenkinsConstants.JenkinsCount, 1);
		
	}
	else{
		test.log(LogStatus.FAIL, "YOU HAVE FAILED TO NAVIGATE PLEASE CHECK CODE!");
		JenkinsExcel.setCellData("Fail", JenkinsConstants.JenkinsCount, 1);
	}
	assertEquals("hellokitty", catuser.getText());
    
    
}

@When("^the User details \"([^\"]*)\" username, \"([^\"]*)\" password, \"([^\"]*)\" confirm Password, \"([^\"]*)\" Fullname and \"([^\"]*)\" EmailAddress are entered on the Create UserScreen$")
public void the_User_details_username_password_confirm_Password_Fullname_and_EmailAddress_are_entered_on_the_Create_UserScreen(String arg1, String arg2, String arg3, String arg4, String arg5)  {
	ParamCreateUser createPage1 = PageFactory.initElements(driver, ParamCreateUser.class);
	createPage1.createuser(arg1, arg2, arg3, arg4, arg5);
    
}

@Then("^the \"([^\"]*)\" username should be visible on the UsersScreen$")
public void the_username_should_be_visible_on_the_UsersScreen(String arg1)  { 
	WebElement table = driver.findElement(By.id("people"));
	if(table.getText().equals(arg1)) {
		test.log(LogStatus.PASS, "this is the correct user!");
		JenkinsExcel.setCellData("PASS", JenkinsConstants.JenkinsCount, 1);
	}
	else {
		test.log(LogStatus.FAIL, "YOU HAVE FAILED TO NAVIGATE PLEASE CHECK CODE!");
		JenkinsExcel.setCellData("Fail", JenkinsConstants.JenkinsCount, 1);
		
		
		assertEquals(arg1, table.getText());
		
		
	
		
	}

	   
   
	   
   }
    


@Given("^the \"([^\"]*)\" username is visible on the UsersScreen$")
public void the_username_is_visible_on_the_UsersScreen(String arg1) {
    
    
}

@When("^the \"([^\"]*)\" username is clicked on the UserScreen$")
public void the_username_is_clicked_on_the_UserScreen(String arg1) {
    
    
}

@Then("^the User Profile should display the \"([^\"]*)\" username on the ProfileScreen$")
public void the_User_Profile_should_display_the_username_on_the_ProfileScreen(String arg1) {
    
    
}

@Given("^the \"([^\"]*)\" Username's profile page has been loaded$")
public void the_Username_s_profile_page_has_been_loaded(String arg1)  {
   
  
}

@Given("^the configure button has been clicked on the profile page$")
public void the_configure_button_has_been_clicked_on_the_profile_page()  {
 

}

@When("^I change the old email address on the Configure Page to a new email address \"([^\"]*)\"$")
public void i_change_the_old_email_address_on_the_Configure_Page_to_a_new_email_address(String arg1) {
   
   
}

@When("^I save the changes to the Configure Page$")
public void i_save_the_changes_to_the_Configure_Page()  {

    
}

@Then("^the Configure Page should show the new email address \"([^\"]*)\"$")
public void the_Configure_Page_should_show_the_new_email_address(String arg1) {
   
   
}
@After
public void tearDown() {
	
	driver.close();
	driver.quit();
	report.endTest(test);
	report.flush();
}
	
}
