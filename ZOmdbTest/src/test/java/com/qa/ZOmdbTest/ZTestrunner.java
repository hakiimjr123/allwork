package com.qa.ZOmdbTest;

import org.junit.runner.RunWith;


import com.relevantcodes.extentreports.ExtentReports;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Admin\\eclipse-workspace\\ZOmdbTest\\src\\test\\java\\zIntro.feature")
public class ZTestrunner {
	public static ExtentReports report = new ExtentReports(Zconstants.reportURL, true);
	
}
