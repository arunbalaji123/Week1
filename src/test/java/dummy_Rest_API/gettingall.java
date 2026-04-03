package dummy_Rest_API;

import io.restassured.RestAssured;

public class gettingall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured
		.given()

		.when()
		.get("https://dummy.restapiexample.com/api/v1/employees")

		.then()
		.statusCode(200).log().all();
	}

}
