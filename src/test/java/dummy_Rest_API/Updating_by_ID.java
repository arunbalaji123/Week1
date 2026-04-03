package dummy_Rest_API;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Updating_by_ID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured
		.given().contentType(ContentType.JSON).
		body("{\"name\":\"Arun\",\"salary\":\"300000\",\"age\":\"22\"}")

		.when()
		.put("https://dummy.restapiexample.com/api/v1/update/4")

		.then()
		.statusCode(200).log().all();
	}
}
