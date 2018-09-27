package com.qa.ShoppingSite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
public class ShoppingResults {

	
	
	@FindBy(xpath=("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"))
	private WebElement favedress;
	
	public void myDress(WebDriver driver) {
		Actions pickme = new Actions(driver);
		pickme.moveToElement(favedress).click().perform();
		
		
	}
}
