package jsonPlaceHolder;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class GettingResource {

	 public static void main(String[] args) {

	        RestAssured
	        .given() .when()
	            .get("https://jsonplaceholder.typicode.com/posts/1")

	        .then()
	            .statusCode(200)
	            .log().all();
	    }

}
