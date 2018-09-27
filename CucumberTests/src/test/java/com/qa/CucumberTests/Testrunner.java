package com.qa.CucumberTests;

import org.junit.runner.RunWith;

import com.relevantcodes.extentreports.ExtentReports;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Admin\\eclipse-workspace\\CucumberTests\\src\\test\\java\\TeaTesting.feature")

public class Testrunner {

	public static ExtentReports report = new ExtentReports(CucumConstants.reportURL, true);
}
