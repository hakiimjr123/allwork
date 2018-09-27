package com.qa.vet2;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;

import com.qa.VET.VetConstants;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import io.restassured.specification.RequestSpecification;

public class Userrest {
	private Response response;
	private RequestSpecification request;
	
	
	JSONObject requestparam = new JSONObject();
	JSONObject role = new JSONObject();
	JSONArray role1 = new JSONArray();
	
	@Test
	public void PostUser() {
		RestAssured.baseURI = VetConstants.Userurl;
		request = RestAssured.given();
		request.header("Content-Type", "application/json");
		
		role.put("id", 0);
		role.put("name", "Hakiim");
		
		role1.put(role);
		
		
		requestparam.put("enabled", true);
		requestparam.put("password", "password");
		requestparam.put("roles", role1);
		requestparam.put("username", "username");
		
		System.out.println(request.body(requestparam.toString()));
		
		response = request.when().post("/");
		System.out.println(response.body().prettyPrint());
		System.out.println(response.getStatusCode());
		
		
		
	}

}
