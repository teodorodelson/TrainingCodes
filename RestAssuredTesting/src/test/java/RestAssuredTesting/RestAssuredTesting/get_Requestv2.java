package RestAssuredTesting.RestAssuredTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class get_Requestv2 {
	@Test
	void getUserDetails() {
		RestAssured.baseURI="https://reqres.in/api";
		String a ="two";
		RequestSpecification httprequest =  RestAssured.given();
	//	httprequest.header("app-id","5fa97d6eb36b9c0005eb9c22");
		Response response = httprequest.request(Method.GET, "/users/2");
		
		JsonPath jsonpath = response.jsonPath();
		
		System.out.println(jsonpath.get("data.email"));
		
		Assert.assertEquals(response.getStatusCode(), 200);
		Assert.assertEquals(jsonpath.get("data.email"), "janet.weaver@reqres.in");
		Assert.assertNotEquals(jsonpath.get("data.email"), "jane12t.weaver@reqres.in");
		Assert.assertEquals(jsonpath.get("ad.company"), "StatusCode Weekly");
		Assert.assertEquals(jsonpath.get("data.id"), 2);
		
		
		Assert.assertEquals("two", a);
		//Assert.assertEquals(jsonpath.get("data.id"), 1); should fail
		
		
	}
}
