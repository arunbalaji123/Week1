package parameters;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetpetStatus_usingQueryParameter {
	
	@Test
	public void getPetStatus() {
		RestAssured.given().queryParam("status","available")
		
		
		
		.when().get("https://petstore.swagger.io/v2/pet/findByStatus")
		
		
		.then().log().all();
	}

}
