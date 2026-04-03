package requestBody;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class ByHashMapbody {
	public static void main(String[] args) {
		HashMap<String, Object> body = new HashMap<>();

        body.put("createdBy", "Arun");
        body.put("projectName", "Mission2026");
        body.put("status", "Created");
        body.put("teamSize", 0);

        RestAssured
        .given()
            .contentType(ContentType.JSON)
            .body(body)

        .when()
            .post("http://49.249.28.218:8091/addProject")

        .then()
            .statusCode(201)
            .log().all();
	}

}
