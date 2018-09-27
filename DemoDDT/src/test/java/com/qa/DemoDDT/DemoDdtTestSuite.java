package com.qa.DemoDDT;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.relevantcodes.extentreports.ExtentReports;

@RunWith(Suite.class)

@Suite.SuiteClasses({DemoDDTtest.class})

public class DemoDdtTestSuite {
	public static ExtentReports report = new ExtentReports(ConstantsDemo.reportURL, true);
	
}
