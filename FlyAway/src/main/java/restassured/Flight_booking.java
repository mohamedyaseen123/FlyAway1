package restassured;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Flight_booking {
	
	@Test
	
	public void Flyawaya() {
		String url = "http://localhost:9012/FlyAway/?source=1&destination=4";
		RestAssured.baseURI= url;
		
		RequestSpecification requestSpecification = RestAssured.given();
		Response response = requestSpecification.accept(ContentType.JSON).get();
		System.out.println(response.asPrettyString());
		
		response.prettyPrint();
		System.out.print("REPONSE CODE: "+response.getStatusCode());
		
		Assert.assertEquals(response.getStatusCode(),200);
}
	}

