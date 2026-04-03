package parameters;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class AutomationLoginVerify {
	 @Test
	 public void VerifyLogin() {
		 
		 RestAssured
	        .given()
	        .formParam("email", "arrrrrrrrrrrrrrrun@gmail.com")
            .formParam("password", "Cskwonallmatch")

	        .when()
	            .post("https://automationexercise.com/api/verifyLogin")

	        .then()
	            .log().all();
		 
	 }

}
