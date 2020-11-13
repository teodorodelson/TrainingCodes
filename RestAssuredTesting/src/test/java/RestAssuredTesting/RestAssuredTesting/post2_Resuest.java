package RestAssuredTesting.RestAssuredTesting;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class post2_Resuest {

	
	@Test
	void postUserRegistration() {
		RestAssured.baseURI="https://reqres.in/api";
		
		RequestSpecification httprequest1 =  RestAssured.given();
	//	httprequest1.header("app-id","5fa97d6eb36b9c0005eb9c22");
		
		JSONObject requestParams1= new JSONObject();
		
		//JsonPath json =response.jsonPath();
		
		requestParams1.put("email", "eve.holt@reqres.in");
		requestParams1.put("password", "pistol");

		
		httprequest1.header("Context-type","application/json");
	
		httprequest1.body(requestParams1.toJSONString());
		
		Response response = httprequest1.request(Method.POST, "/register");
		
		///System.out.println(response.jsonPath().get("name"));
		
		Assert.assertEquals(response.getStatusCode(), 201);
		//Assert.assertEquals(response.jsonPath().get("name"), "sample");
		//Assert.assertEquals(response.getStatusLine(), "HTTP/1.1 200 OK");
		
	}
}
