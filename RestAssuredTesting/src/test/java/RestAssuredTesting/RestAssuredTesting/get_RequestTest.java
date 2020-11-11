package RestAssuredTesting.RestAssuredTesting;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class get_RequestTest {

	@Test
	void getUserDetails() {
		RestAssured.baseURI="https://dummyapi.io/data/api";
		
		RequestSpecification httprequest =  RestAssured.given();
		httprequest.header("app-id","5fa97d6eb36b9c0005eb9c22");
		Response response = httprequest.request(Method.GET, "/user");
		
		
		String sample = response.getBody().asString();
		System.out.println(sample + "  <-- Sample");
		
		Assert.assertEquals(response.getStatusCode(), 200);
		Assert.assertEquals(response.getStatusLine(), "HTTP/1.1 200 OK");
	}
	

	

}
