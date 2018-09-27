package com.qa.VET;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class VetsPage {
	
	
	@FindBy(xpath = "/html/body/app-root/div[1]/nav/div/ul/li[3]/a")
	private WebElement DropdownMenu;
	
	
	@FindBy(xpath = "/html/body/app-root/div[1]/nav/div/ul/li[3]/ul/li[1]/a")
	private WebElement DropdownVet;

	
	public void Drops(WebDriver driver) {
		
		DropdownMenu.click();
		
		Actions GetVet = new Actions(driver);
		GetVet.moveToElement(DropdownVet).click().perform();
	}
}