package com.qa.vet2;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.qa.VET.VetConstants;
import com.relevantcodes.extentreports.ExtentReports;

@RunWith(Suite.class)

@Suite.SuiteClasses({Userrest.class, Ownerrest.class, VisitRest.class, Specialists.class})

public class NonfuncTestSuite {
	

}


