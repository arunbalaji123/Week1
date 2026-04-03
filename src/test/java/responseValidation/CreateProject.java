package responseValidation;

import org.testng.annotations.Test;
import io.restassured.http.ContentType;

import java.io.File;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class CreateProject{

    static String projectId;

    @Test(priority = 1)
    public void Create() {

        File ar = new File("src/test/resources/CreateProject_data.json");

        projectId = given()
                .contentType(ContentType.JSON)
                .body(ar)

        .when()
                .post("http://49.249.28.218:8091/addProject")

        .then()
                .log().all()
                .assertThat()
                .statusCode(201)
                .extract()
                .jsonPath()
                .getString("projectId");

       
    }

    @Test(priority = 2)
    public void Getting() {

      
        given()
                .pathParam("projectId", projectId)

        .when()
                .get("http://49.249.28.218:8091/project/{projectId}")

        .then()
                .log().all()
                .assertThat()
                .statusCode(200)
                .statusLine(containsString("HTTP"))
                .time(lessThan(5000L));
    }

    @Test(priority = 3)
    public void Updating() {

        given()
                .contentType(ContentType.JSON)
                .pathParam("projectId", projectId)

                .body("{\n" +
                        "  \"createdBy\": \"Arun\",\n" +
                        "  \"projectName\": \"Mission Updated\",\n" +
                        "  \"status\": \"Created\",\n" +
                        "  \"teamSize\": 0\n" +
                        "}")

        .when()
                .put("http://49.249.28.218:8091/project/{projectId}")

        .then()
                .log().all()
                .assertThat()
                .statusCode(200)
                .statusLine(containsString("HTTP"))
                .time(lessThan(5000L));
    }

    @Test(priority = 4)
    public void deleting() {

        given()
                .pathParam("projectId", projectId)

        .when()
                .delete("http://49.249.28.218:8091/project/{projectId}")

        .then()
                .log().all()
                .assertThat()
                .statusCode(204)
                .statusLine(containsString("HTTP"))
                .time(lessThan(5000L));
    }
}