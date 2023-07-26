package restassured;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Booking_conformation {

	@Test  
	
	public void Flyawaya1() {
		String url = "http://localhost:9012/FlyAway/completepurchase";
		RestAssured.baseURI= url;
		
		RequestSpecification requestSpecification1= RestAssured.given();
		Response response1 = requestSpecification1.accept(ContentType.JSON).get();
		System.out.println(response1.asPrettyString());
		
		response1.prettyPrint();
		System.out.print("REPONSE CODE: "+response1.getStatusCode());
		
		Assert.assertEquals(response1.getStatusCode(),200);
		
		
	
}
}
 