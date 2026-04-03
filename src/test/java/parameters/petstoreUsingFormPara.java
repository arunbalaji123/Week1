package parameters;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class petstoreUsingFormPara {
	@Test
	public void getPetStatus() {
	RestAssured.given().
pathParam("petId",103).
formParam("name", "Boring").
formParam("status", "available")
	
	
	
	.when().post("https://petstore.swagger.io/v2/pet/{petId}")
	
	
	.then().log().all();

}
}
