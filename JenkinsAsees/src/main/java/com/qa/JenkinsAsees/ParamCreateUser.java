package com.qa.JenkinsAsees;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ParamCreateUser {


	@FindBy(xpath = ("//*[@id=\"username\"]"))
	
	private WebElement UserBox;
	
	@FindBy(xpath = ("//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[2]/td[2]/input"))
	
	private WebElement PassBox;
	
	@FindBy(xpath = ("//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[3]/td[2]/input"))
	
	private WebElement ConpassBox;
	
	@FindBy(xpath = ("//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[4]/td[2]/input"))
	
	private WebElement FullName;
	
	@FindBy(xpath = ("//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[5]/td[2]/input"))
	
	private WebElement Email;
	
	@FindBy(xpath = ("//*[@id=\"yui-gen3-button\"]"))
	
	private WebElement Submitb;
	
	
	public void createuser(String user, String pass, String Cpass, String Fullnam, String email ) {
		UserBox.sendKeys(user);
		PassBox.sendKeys(pass);
		ConpassBox.sendKeys(Cpass);
		FullName.sendKeys(Fullnam);
		Email.sendKeys(email);
		Submitb.click();
}
}