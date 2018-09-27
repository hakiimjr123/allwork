package com.qa.JenkinsAsees;

import org.junit.runner.RunWith;

import com.relevantcodes.extentreports.ExtentReports;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Admin\\eclipse-workspace\\JenkinsAsees\\src\\test\\java\\com\\qa\\JenkinsAsees\\Assessments.feature")
public class JtestRunner {
	
	public static ExtentReports report = new ExtentReports(JenkinsConstants.reportURL, true);
}
