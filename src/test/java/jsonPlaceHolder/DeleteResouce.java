package jsonPlaceHolder;

import io.restassured.RestAssured;

public class DeleteResouce {

	public static void main(String[] args) {

        RestAssured
        .given()

        .when()
            .delete("https://jsonplaceholder.typicode.com/posts/1")

        .then()
            .statusCode(200)
            .log().all();
    }

}
