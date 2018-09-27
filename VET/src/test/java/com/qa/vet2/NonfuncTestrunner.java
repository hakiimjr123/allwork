package com.qa.vet2;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.qa.VET.VetConstants;
import com.relevantcodes.extentreports.ExtentReports;

public class NonfuncTestrunner {
	
	public static ExtentReports report = new ExtentReports(VetConstants.reporturl, true);
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(NonfuncTestSuite.class);
		for(Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
			
		}
		
		System.out.println(result.wasSuccessful());
	}

}
