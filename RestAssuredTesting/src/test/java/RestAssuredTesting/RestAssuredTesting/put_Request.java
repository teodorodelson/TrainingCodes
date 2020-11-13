package RestAssuredTesting.RestAssuredTesting;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class put_Request {
	@Test
	void testPatch() {
		RestAssured.baseURI="https://reqres.in/api";
		
		RequestSpecification httprequest =  RestAssured.given();
		
		JSONObject requestParams1= new JSONObject();
		
		//JsonPath json =response.jsonPath();
		
		requestParams1.put("name", "change name");
		requestParams1.put("job", "no job");
		
		httprequest.header("Context-type","application/json");
		
		httprequest.body(requestParams1.toJSONString());
	
		Response response = httprequest.request(Method.PUT, "/users/2");
		System.out.println(response.body().asString());
	//	System.out.println(response.getBody().asString());
		
		
		Assert.assertEquals(response.getStatusCode(), 200);
		
		
	}
	
	@Test
	void testPatch2() {
		RestAssured.baseURI="https://reqres.in/api";
		
		RequestSpecification httprequest =  RestAssured.given();
		
		JSONObject requestParams1= new JSONObject();
		
		//JsonPath json =response.jsonPath();
		
		requestParams1.put("home", "change name");
		requestParams1.put("age", "no job");
		
		httprequest.header("Context-type","application/json");
		
		httprequest.body(requestParams1.toJSONString());
	
		Response response = httprequest.request(Method.PUT, "/users/2");
		System.out.println(response.body().asString());
	//	System.out.println(response.getBody().asString());
		
		
		Assert.assertEquals(response.getStatusCode(), 200);
		
		
	}
}
