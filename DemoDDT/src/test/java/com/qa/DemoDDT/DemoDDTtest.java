package com.qa.DemoDDT;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class DemoDDTtest {
	WebDriver driver = null;
	public static ExtentReports report;
	public ExtentTest test;
	
	@BeforeClass
	public static void initial() {
		report = DemoDdtTestSuite.report;
	}
	@Before
	public void setup() throws Exception{
		DemoDDtDataManage.DataManage(ConstantsDemo.Path_DemoData + ConstantsDemo.File_DemoData,0);
		System.setProperty(ConstantsDemo.driverType, ConstantsDemo.cDFilePath);
		driver = new ChromeDriver();
		
		
		
	}
	
	@Test
	public void Demosee1() throws InterruptedException {

		
		
		for(int i=1; i<DemoDDtDataManage.getDemoDataSheet().getPhysicalNumberOfRows(); i++) {
			
			test = report.startTest("Data User Test" +i);
			driver.get(ConstantsDemo.url);
			test.log(LogStatus.INFO, "Demo Site Has Been Opened");
			
			
			DemoddtUser firstPage = PageFactory.initElements(driver, DemoddtUser.class);
			DemoddtLogin secondPage = PageFactory.initElements(driver, DemoddtLogin.class);
			
WebElement checkElement = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]"));
		checkElement.click();
		
		test.log(LogStatus.INFO,"Navigate to add users");
		firstPage.createFor(DemoDDtDataManage.getCellData(i, 0), DemoDDtDataManage.getCellData(i, 1));
		test.log(LogStatus.INFO, "Creating User and Password!");
		
		driver.get(ConstantsDemo.url2);
		secondPage.loginFor(DemoDDtDataManage.getCellData(i, 0), DemoDDtDataManage.getCellData(i, 1));
		WebElement checker = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));
		if(checker.getText().equals("**Successful Login**")) {
			test.log(LogStatus.PASS, "YOU HAVE SUCCESFULLY SIGNED UP AND WERE FAST ENOUGH TO LOG IN!");
		DemoDDtDataManage.setCellData("PASS", i, 2);
		}
		else{
			test.log(LogStatus.FAIL, "YOU HAVE FAILED TRY AGAIN!");
			DemoDDtDataManage.setCellData("Fail", i, 2);
		}
		assertEquals("**Successful Login**", checker.getText());
		report.endTest(test);
			
			
		}
		
	}
	@After
	public void teardown() throws Exception{
		driver.quit();
	
}

	@AfterClass
	public static void end() {
		report.flush();
	}}