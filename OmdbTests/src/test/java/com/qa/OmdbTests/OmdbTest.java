package com.qa.OmdbTests;

import org.junit.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static org.hamcrest.Matchers.equalTo;

public class OmdbTest {
	
	private Response response;
	private RequestSpecification request;
	private ValidatableResponse json;
	
	@Test
	public void RestassureStatus() {
		
		given().content(ContentType.JSON)
		.when()
		.get("http://www.omdbapi.com/?apikey=7e871fdf&t=IT&y=2017")
		.then().body("Rated", equalTo("R"))
;
		
	
	

	}
	}
