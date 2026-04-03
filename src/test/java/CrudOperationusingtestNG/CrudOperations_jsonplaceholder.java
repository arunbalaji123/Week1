package CrudOperationusingtestNG;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class CrudOperations_jsonplaceholder {

    @Test
    public void createPost() {

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
    
    @Test
    public  void getting() {
        RestAssured
        .given() .when()
            .get("https://jsonplaceholder.typicode.com/posts/1")

        .then()
            .statusCode(200)
            .log().all();
    }
    
    @Test
    public void updating() {
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
    
   @Test
   public void deleting() {

       RestAssured
       .given()

       .when()
           .delete("https://jsonplaceholder.typicode.com/posts/1")

       .then()
           .statusCode(200)
           .log().all();
   }
}