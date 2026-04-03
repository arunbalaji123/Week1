package crudoperationspetstroe;

import io.restassured.RestAssured;

public class deleteapet {
	public static void main(String[] args) {
		
		RestAssured.given()
		
		.when().delete("https://petstore.swagger.io/v2/pet/9223372036854775807").then().log().all();
		
		
	}

}
