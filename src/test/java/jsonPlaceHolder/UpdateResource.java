package jsonPlaceHolder;

import io.restassured.*;
import io.restassured.http.ContentType;

public class UpdateResource {


    public static void main(String[] args) {

        RestAssured
        .given()
            .contentType(ContentType.JSON)
            .body("{\n" +
                    "  \"id\": 1,\n" +
                    "  \"title\": \"faaaaaaaaaaaaaaaaaaaaaaah\",\n" +
                    "  \"body\": \"Trending\",\n" +
                    "  \"userId\": 1\n" +
                    "}")

        .when()
            .put("https://jsonplaceholder.typicode.com/posts/1")

        .then()
            .statusCode(200)
            .log().all();
    }
}