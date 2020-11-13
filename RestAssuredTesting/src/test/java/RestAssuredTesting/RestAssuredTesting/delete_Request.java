package RestAssuredTesting.RestAssuredTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class delete_Request {

	
	@Test
	void deleteUser() {
		RestAssured.baseURI="https://reqres.in/api";

		RequestSpecification httprequest =  RestAssured.given();

		Response response = httprequest.request(Method.DELETE, "/users/2");
	
		
		Assert.assertEquals(response.getStatusCode(), 204);
	

		
		
	}
}
