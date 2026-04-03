package dummy_Rest_API;

import io.restassured.RestAssured;

public class Gettin_by_ID {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured
		.given()

		.when()
		.get("https://dummy.restapiexample.com/api/v1/employee/4")

		.then()
		.statusCode(200).log().all();
	}

}
