package com.qa.ShoppingSite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shoppinghome {

	@FindBy(xpath = ("//*[@id=\"search_query_top\"]"))
	private WebElement searchBox;

	
	@FindBy(xpath = ("//*[@id=\"searchbox\"]/button"))
	private WebElement searchButton;
	
	
	public void searching(String searchme) {
		
		searchBox.sendKeys(searchme);
		searchButton.click();
		
	
	}

}
