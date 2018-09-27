package com.qa.Swagger;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class SwaggerPostHash {
	private Response response;
	private RequestSpecification request;
	private ValidatableResponse json;
	
	JSONObject requestparam = new JSONObject();
	
	public void hashmap() {
		RestAssured.baseURI = SwaggerConstant.SHURI4;
		request = RestAssured.given();
		request.header("Content-Type","application/JSON");
	}

}
