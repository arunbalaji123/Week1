package jsonPlaceHolder;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class CreatingResource {

	 public static void main(String[] args) {

	        RestAssured
	        .given()
	            .contentType(ContentType.JSON)
	            .body("{\n" +
	                    "  \"title\": \"foo\",\n" +
	                    "  \"body\": \"bar\",\n" +
	                    "  \"userId\": 1\n" +
	                    "}")

	        .when()
	            .post("https://jsonplaceholder.typicode.com/posts")

	        .then()
	            .statusCode(201)
	            .log().all();
	    }
}
