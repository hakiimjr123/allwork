package com.qa.vet2;

import static io.restassured.RestAssured.given;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Ignore;
import org.junit.Test;

import com.qa.VET.VetConstants;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PetTyrest {

	private Response response;
	private RequestSpecification request;
	
	
	JSONObject requestparam = new JSONObject();
	
	JSONObject pet = new JSONObject();
	JSONArray pet1 = new JSONArray();
	
	JSONObject visit = new JSONObject();
	JSONArray visit1 = new JSONArray();
	
	JSONObject typo = new JSONObject();
	JSONArray typo1 = new JSONArray();
	
	
	@Test
	public void GetpetTypes() {
		request = 	given().content(ContentType.JSON);
		response = request.when().get(VetConstants.PetTyurl);
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
	}
	
	
	@Test
	@Ignore
	public void PostPetTy() {
		RestAssured.baseURI = VetConstants.PetTyurl;
		request = RestAssured.given();
		request.header("Content-Type", "application/json");
		
		requestparam.put("id", 0);
		requestparam.put("name", "frog");
		
System.out.println(request.body(requestparam.toString()));
		
		response = request.when().post("/");
		System.out.println(response.body().prettyPrint());
		System.out.println(response.getStatusCode());
	}
	@Test
	public void deletePetyid() {
		response = given().contentType(ContentType.JSON).when().delete(VetConstants.PetTyurl +"/7");
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
		
	}
	
}
