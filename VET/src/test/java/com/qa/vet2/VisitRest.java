package com.qa.vet2;

import static io.restassured.RestAssured.given;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;

import com.qa.VET.VetConstants;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class VisitRest {
	
	private Response response;
	private RequestSpecification request;
	
	
	JSONObject requestparam = new JSONObject();
	
	JSONObject petto = new JSONObject();
	JSONArray pet1 = new JSONArray();
	
	JSONObject visit = new JSONObject();
	JSONArray visit1 = new JSONArray();
	
	JSONObject typo = new JSONObject();
	JSONArray typo1 = new JSONArray();
	
	JSONObject owned = new JSONObject();
	JSONArray ownee = new JSONArray();
	
	
	@Test
	public void GetVisit() {
		request = 	given().content(ContentType.JSON);
		response = request.when().get(VetConstants.Visiturl);
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
	}

	
	
}
