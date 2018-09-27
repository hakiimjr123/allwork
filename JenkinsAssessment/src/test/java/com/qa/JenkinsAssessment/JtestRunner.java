package com.qa.JenkinsAssessment;

import org.junit.runner.RunWith;

import com.relevantcodes.extentreports.ExtentReports;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Admin\\eclipse-workspace\\JenkinsAssessment\\src\\test\\java\\com\\qa\\JenkinsAssessment\\FridayAssessment.feature")

public class JtestRunner {
	
	public static ExtentReports report = new ExtentReports(JenkinsConstants.reportURL, true);
	}

