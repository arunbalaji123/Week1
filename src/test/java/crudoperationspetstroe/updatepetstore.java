package crudoperationspetstroe;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class updatepetstore {

    public static void main(String[] args) {

        RestAssured.given()
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "  \"id\": 9223372036854775807,\n" +
                        "  \"category\": {\n" +
                        "    \"id\": 0,\n" +
                        "    \"name\": \"string\"\n" +
                        "  },\n" +
                        "  \"name\": \"Arunn\",\n" +
                        "  \"photoUrls\": [\"string\"],\n" +
                        "  \"tags\": [\n" +
                        "    {\n" +
                        "      \"id\": 0,\n" +
                        "      \"name\": \"string\"\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"status\": \"available\"\n" +
                        "}")

        // HTTP Method
        .when()
                .put("https://petstore.swagger.io/v2/pet")

        // Response
        .then()
                .log().all();
    }
}