package dummy_Rest_API;

import io.restassured.RestAssured;

public class Deleting_resource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.given().when().delete("https://dummy.restapiexample.com/api/v1/delete/2").then().statusCode(200).log().all();

	}

}
