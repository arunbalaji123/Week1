package parameters;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class UploadImageUsingForm {
	@Test
	public void post() {
		RestAssured.given().pathParam("petId", 101)
		.multiPart("additionalMetadata","Pet pic")
		.multiPart("file",new File("C:\\Users\\acer\\OneDrive\\Pictures\\lokipho.jpg"))
		
		
		
		
		.when().post("https://petstore.swagger.io/v2/pet/{petId}/uploadImage")
		
		
		.then().log().all();
	}

}
