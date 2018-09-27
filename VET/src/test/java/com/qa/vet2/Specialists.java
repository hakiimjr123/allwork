package com.qa.vet2;

import static io.restassured.RestAssured.given;

import org.junit.Before;
import org.junit.Test;

import com.qa.vet2.NonfuncTestrunner;
import com.qa.VET.VetConstants;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Specialists {
		public static ExtentReports report;
	public ExtentTest test;
	
	private Response response;
	private RequestSpecification request;
	

	
	@Before
	
	
	@Test
	public void Getspecialists() {
		request = given().content(ContentType.JSON);
		
		response = request.when().get(VetConstants.Specialurl);
		System.out.println(response.getStatusCode());
		System.out.println("As a vet I would like to see the type of care available" + response.asString());
		
		
		
	
}
}