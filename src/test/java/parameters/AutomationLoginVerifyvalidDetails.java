package parameters;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class AutomationLoginVerifyvalidDetails {
	 @Test
	 public void VerifyLogin() {
		 
		 RestAssured
	        .given()
	        .formParam("email","arun123@gmail.com")
	         .formParam("password","test123")
	        .when()
	            .post("https://automationexercise.com/api/verifyLogin")

	        .then().statusCode(200)
	            .log().all();
		 
	 }

}
