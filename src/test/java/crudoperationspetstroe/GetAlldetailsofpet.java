package crudoperationspetstroe;

import io.restassured.RestAssured;

public class GetAlldetailsofpet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		RestAssured.given()
		
		
	
		.when()
		   .get("https://petstore.swagger.io/v2/pet/1")
		   
		   
		 
		   .then()
		     .statusCode(200)
		         .log().all();
	}

}
