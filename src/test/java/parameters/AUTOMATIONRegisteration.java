package parameters;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class AUTOMATIONRegisteration {
	@Test
	public void createacc() {
		RestAssured.given()
		 .formParam("name","Arun")
         .formParam("email","arun123@gmail.com")
         .formParam("password","test123")
         .formParam("title","Mr")
         .formParam("birth_date","13")
         .formParam("birth_month","13")
         .formParam("birth_year","2004")
         .formParam("firstname","Arun")
         .formParam("lastname","Balaji")
         .formParam("company","CapG")
         .formParam("address1","Street 1")
         .formParam("address2","Street 2")

         .formParam("country","India")
         .formParam("zipcode","600056")

         .formParam("state","Tamil Nadu")
         .formParam("city","Chennai")

         
         
         .formParam("mobile_number","9876543210")
		
		
		.when()
		 .post("https://automationexercise.com/api/createAccount")

	        .then()

	            .statusCode(200)
	            .log().all();
		
		
		
	}
	 String email = "arun123@gmail.com";
	    String password = "test123";
	
	
	    @Test
	    public void getUserDetails() {


	        RestAssured
	        .given()
	            .queryParam("email", email)

	        .when()
	            .get("https://automationexercise.com/api/getUserDetailByEmail")

	        .then()
	            .statusCode(200)
	            .log().all();
	    }

	  
	    @Test(dependsOnMethods = "getUserDetails")
	    public void updateUserAccount() {

	        RestAssured
	        .given()

	           

	            .formParam("name", "Arun")
	            .formParam("email", email)
	            .formParam("password", password)

	            .formParam("title", "Mr")
	            .formParam("birth_date", "10")
	            .formParam("birth_month", "5")
	            .formParam("birth_year", "2002")

	            .formParam("firstname", "Arun")
	            .formParam("lastname", "Balaji")

	            .formParam("company", "TestCompany")
	            .formParam("address1", "Street1")
	            .formParam("address2", "Street2")

	            .formParam("country", "India")
	            .formParam("zipcode", "600001")

	            .formParam("state", "Tamil Nadu")
	            .formParam("city", "Chennai")

	            .formParam("mobile_number", "9876543210")

	        .when()

	            .put("https://automationexercise.com/api/updateAccount")

	        .then()

	            .statusCode(200)
	            .log().all();
	    }

	    @Test(dependsOnMethods = "updateUserAccount")
	    public void deleteUserAccount() {

	        RestAssured
	        .given()


	            .formParam("email", email)
	            .formParam("password", password)

	        .when()

	            .delete("https://automationexercise.com/api/deleteAccount")

	        .then()

	            .statusCode(200)
	            .log().all();
	    }


}
