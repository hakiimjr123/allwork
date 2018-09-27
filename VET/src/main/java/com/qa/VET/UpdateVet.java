package com.qa.VET;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class UpdateVet {
	
	@FindBy(xpath = "//*[@id=\"vets\"]/tbody/tr[1]/td[3]/button[1]")
	private WebElement EditVet;
	
	@FindBy(xpath = "//*[@id=\"spec\"]/div/div[1]")
	private WebElement Dropdown;
	
	@FindBy(xpath = "//*[@id=\"mat-option-6\"]/mat-pseudo-checkbox")
	private WebElement CheckBox;
	
	@FindBy(xpath = "//*[@id=\"vet_form\"]/div[5]/div/button[2]")
	private WebElement Save;
	
	public void update(WebDriver driver2) {
		
		EditVet.click();
		
		Dropdown.click();
		
		Actions Check = new Actions(driver2);
		Check.moveToElement(CheckBox).click().perform();
		
		Save.click();
		
	}
	

}
