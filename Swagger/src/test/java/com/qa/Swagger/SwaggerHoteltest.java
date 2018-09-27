package com.qa.Swagger;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Ignore;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;

public class SwaggerHoteltest {
	
	private Response response;
	private RequestSpecification request;
	private ValidatableResponse json;
	
	JSONObject requestparam = new JSONObject();
	
	@Test
	public void GetSwagger() {
		
request = 	given().content(ContentType.JSON);
		response = request.when().get(SwaggerConstant.SHURI);
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
		
	}

	
	
	
	@Test
	@Ignore
	public void PostSwagger() {
		RestAssured.baseURI = SwaggerConstant.SHURI2;
		request = RestAssured.given();
		request.header("Content-Type","application/JSON");
		
		requestparam.put("city", "London");
		requestparam.put("description", "Best Hotel EUW");
		requestparam.put("id", 0);
		requestparam.put("name", "Hotel Pop");
		requestparam.put("rating", 10 );
	
		System.out.println(request.body(requestparam.toString()));
			 response = request.post("/");
		System.out.println(response.getStatusCode());
		
		
	}
	
	
	@Test
	@Ignore
	public void DeleteSwagger() {
		response = given().contentType(ContentType.JSON).when().delete("http://localhost:8090/example/v1/hotels/");
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
		
	}
	
	
	@Test
	public void PutSwagger() {
		RestAssured.baseURI = SwaggerConstant.SHURI3;
		request = RestAssured.given();
		request.header("Content-Type", "application/json");
		
		requestparam.put("city", "Manchester");
		requestparam.put("description", "This is a test of the put method");
		requestparam.put("name", "Royal Manchester");
		requestparam.put("id", 2);
		requestparam.put("rating", 10);
		System.out.println(request.body(requestparam.toString()));
		 response = request.post("/");
	System.out.println(response.getStatusCode());
	}
}
