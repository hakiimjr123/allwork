package com.qa.DemoDDT;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoddtLogin {



	@FindBy(xpath = ("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"))
	 
	private WebElement userBox;
	
	
	 @FindBy(xpath = ("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"))
	
	private WebElement passBox; 
	
	 @FindBy(xpath = ("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input"))
	
	 
	 private WebElement loginButton;
	  public void loginFor(String user, String pass ) {
		 userBox.sendKeys(user);
		 passBox.sendKeys(pass);
		 loginButton.click();

}
}

