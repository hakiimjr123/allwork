package com.qa.JenkinsAsees;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JenkinsAdminLog {

	@FindBy(xpath = ("//*[@id=\"j_username\"]"))
	private WebElement AdminUser;
	
	@FindBy(xpath = ("//*[@id=\"main-panel\"]/div/form/table/tbody/tr[2]/td[2]/input"))
	private WebElement AdminPass;
	
	@FindBy(xpath = ("//*[@id=\"yui-gen1-button\"]"))
	private WebElement Adminsubmit;
	
	public void firstLog(String Adminbox, String Pass) {
		AdminUser.sendKeys(Adminbox);
		AdminPass.sendKeys(Pass);
		Adminsubmit.click();
	}
}
