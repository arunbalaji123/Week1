package responseValidation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static org.hamcrest.Matchers.*;
import responseValidation.CreateProject;
import java.io.File;

import static io.restassured.RestAssured.*;

public class Get_upt_deleteProject {

//	CreateProject obj= new CreateProject();
	String projectIdd="NH_PROJ_2971";

	@Test(priority = 1)
	public void Getting() {
		System.out.println(projectIdd);
		
		given().pathParam("projectId", projectIdd)
	    .get("http://49.249.28.218:8091/project/{projectId}")
		.then().log().all().assertThat().statusCode(200).statusLine(containsString("HTTP")).time(lessThan(5000L));
		

		
	}


	@Test(priority = 2)
	public void Updating() {
	
		       
	        given()
	            .contentType(ContentType.JSON)
	            .body("{\n" +
	                    "  \"createdBy\": \"Arun\",\n" +
	                    "  \"projectName\": \"Mission Updated\",\n" +
	                    "  \"status\": \"Created\",\n" +
	                    "  \"teamSize\": 0\n" +
	                    "}").pathParam("projectId", projectIdd)

	        .when()
	            .put("http://49.249.28.218:8091/project/{projectId}")

	        	.then().log().all().assertThat().statusCode(200).statusLine(containsString("HTTP")).time(lessThan(5000L));
		
	}


	@Test(priority = 3)
	public void deleting() {
	
		
given().pathParam("projectId", projectIdd).delete("http://49.249.28.218:8091/project/{projectId}")
		.then().log().all().assertThat().statusCode(200).statusLine(containsString("HTTP")).time(lessThan(5000L));
		
	}
}
