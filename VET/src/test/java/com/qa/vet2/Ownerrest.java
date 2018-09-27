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

public class Ownerrest {
	
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
	public void GetAllowner() {
		request = 	given().content(ContentType.JSON);
		response = request.when().get(VetConstants.Ownerurl);
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
		
		
		
		
	}
	
	
	@Test
	@Ignore
	public void Postowner() {
		RestAssured.baseURI = VetConstants.Ownerurl;
		request = RestAssured.given();
		request.header("Content-Type", "application/json");
		
		typo.put("id", 0);
		typo.put("name", "chimp");
		
		typo1.put(typo);
		
		visit.put("date", "yyyy/MM/dd");
		visit.put("description", "Check up");
		visit.put("id", 0);
		visit.put("pet", 0);
		
		visit1.put(visit);
		
		
		
		
		
		pet.put("birthDate", "2018-09-27T10:56:03.043Z");
		pet.put("id", 0);
		pet.put("name", "Violet");
		pet.put("owner", 0);
		pet.put("type", typo1);
		pet.put("visits", visit1);
		
		pet1.put(pet);
		
		
		requestparam.put("address", "stringss");
		requestparam.put("city", "Stringerooney");
		requestparam.put("firstName", "Hakz");
		requestparam.put("id", 0);
		requestparam.put("lastName", "Yung");
		requestparam.put("pets", pet1);
		requestparam.put("telephone", "07566677788");
		
System.out.println(request.body("As an Admin i would liek to add new customers to our files! " + requestparam.toString()));
		
		response = request.when().post("/");
		System.out.println(response.body().prettyPrint());
		System.out.println(response.getStatusCode());
		
		
	}
	@Test
	public void getlastname() {
		request = 	given().content(ContentType.JSON);
		response = request.when().get(VetConstants.Ownerlast +"/Yung");
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
	}
	
	
	@Test
	public void DeleteId() {
		response = given().contentType(ContentType.JSON).when().delete(VetConstants.Ownerurl +"/11");
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
	}
	
	@Test
	public void GetownerId() {
		request = 	given().content(ContentType.JSON);
		response = request.when().get("http://10.0.10.10:9966/petclinic/api/owners/12");
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
		
		
		
	}

	@Test
	public void PutOwner() {
		RestAssured.baseURI = "http://10.0.10.10:9966/petclinic/api/owners/12";
		request = RestAssured.given();
		request.header("Content-Type", "application/json");
		
		typo.put("id", 0);
		typo.put("name", "chimp");
		
		typo1.put(typo);
		
		visit.put("date", "yyyy/MM/dd");
		visit.put("description", "Check up");
		visit.put("id", 0);
		visit.put("pet", 0);
		
		visit1.put(visit);
		
		
		
		
		
		pet.put("birthDate", "2018-09-27T10:56:03.043Z");
		pet.put("id", 0);
		pet.put("name", "Violet");
		pet.put("owner", 0);
		pet.put("type", typo1);
		pet.put("visits", visit1);
		
		pet1.put(pet);
		
		
		requestparam.put("address", "stringss");
		requestparam.put("city", "Stringerooney");
		requestparam.put("firstName", "Hakiim");
		requestparam.put("id", 0);
		requestparam.put("lastName", "miikah");
		requestparam.put("pets", pet1);
		requestparam.put("telephone", "07566677788");
		
System.out.println(request.body("As an Admin i would like to update and edit records" + requestparam.toString()));
		
		response = request.when().put("/");
		System.out.println(response.body().prettyPrint());
		System.out.println(response.getStatusCode());
		
	}
	
}
