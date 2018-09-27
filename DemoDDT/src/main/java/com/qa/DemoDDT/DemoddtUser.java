package com.qa.DemoDDT;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoddtUser {


	@FindBy(xpath = ("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"))
	 
	private WebElement userBox;
	
	
	 @FindBy(xpath = ("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"))
	
	private WebElement passBox; 
	
	 @FindBy(xpath = ("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"))
	
	 
	 private WebElement saveButton;
	  public void createFor(String user, String pass ) {
		 userBox.sendKeys(user);
		 passBox.sendKeys(pass);
		 saveButton.click();
	 
	 }
}
