package ninzaHrm;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PutProject {

	 public static void main(String[] args) {

	        RestAssured.baseURI = "http://49.249.28.218:8091";

	        RestAssured
	        .given()
	            .contentType(ContentType.JSON)
	            .body("{\n" +
	                    "  \"createdBy\": \"Arun\",\n" +
	                    "  \"projectName\": \"Mission Updated\",\n" +
	                    "  \"status\": \"Created\",\n" +
	                    "  \"teamSize\": 0\n" +
	                    "}")

	        .when()
	            .put("/project/NH_PROJ_2941")

	        .then()
	        .statusCode(200)
	            .log().all();
	    }
}
