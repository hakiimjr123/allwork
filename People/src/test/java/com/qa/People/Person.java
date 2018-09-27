package com.qa.People;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class Person {
	
	private Response response;
	private RequestSpecification request;
	private ValidatableResponse json;
	
	JSONObject requestparam = new JSONObject();
	JSONObject address = new JSONObject();
	JSONArray address1 = new JSONArray();
	

	
	@Test
	
	
	public void PutSwagger() {
		
		RestAssured.baseURI = Personconstants.SHURI;
		request = RestAssured.given();
		request.header("Content-Type", "application/json");
		request.header("userId", "00000000");
	
		address.put("city", "London");
		address.put("id", 0);
		address.put("line1", "55 Chruchill Walk");
		address.put("line2", "Hackney");
		address.put("state", "Carolina");
		address.put("zip", "e95sr");
		
		address1.put(address);
	
		 
		requestparam.put("addresses", address1);
		requestparam.put("dateOfBirth", "2018-09-25");
		requestparam.put("firstName", "Hakiim");
		requestparam.put("gender", "M");
		requestparam.put("id", 0);
		requestparam.put("lastName", "Junior");
		requestparam.put("middleName", "KING");
		
		System.out.println(request.body(requestparam.toString()));
		
		response = request.when().put("/");
		System.out.println(response.body().prettyPrint());
		System.out.println(response.getStatusCode());
		
	
		}
		
	

	@Test
	public void GetPerson() {
		request = 	given().content(ContentType.JSON);
		response = request.when().get("http://localhost:8080/v1/person/1");
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
	}
	@Test
	public void Getsize() {
		request = 	given().content(ContentType.JSON);
		response = request.when().get(Personconstants.SHURI2 +"/page=0&size=100");
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
		
		
	}
}
