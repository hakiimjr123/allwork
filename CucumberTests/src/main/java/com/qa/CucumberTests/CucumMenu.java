package com.qa.CucumberTests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CucumMenu {
	
	@FindBy(xpath = "//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a")
	private WebElement Menu;
	
	public void selectMenu() {
		Menu.click();
	}
	

}