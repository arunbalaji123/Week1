package CrudOperationusingtestNG;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
public class CrudOperations_NinzaHrm {
	 String projectId;
	
	@Test()
	public void Create() {
 projectId=RestAssured.given().contentType(ContentType.JSON).body("{\r\n"
				+ "  \"createdBy\": \"virat the legend\",\r\n"
				+ "  \"projectName\": \"Missionnnnnnnn\",\r\n"
				+ "  \"status\": \"Created\",\r\n"
				+ "  \"teamSize\": 0\r\n"
				+ "}").when().post("http://49.249.28.218:8091/addProject").then()
	        .statusCode(201).extract().jsonPath()
	        .getString("projectId");
		System.out.println("project id           "+projectId);
		
	}

	@Test(dependsOnMethods = "Create")
	public void Getting() {
		RestAssured.given().when()
        .get("http://49.249.28.218:8091/project/"+projectId)
		.then().log().all();
		

		
	}


	@Test(dependsOnMethods = "Getting")
	public void Updating() {
//		  RestAssured.baseURI = "http://49.249.28.218:8091";
		System.out.println("project id"+projectId);
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
	            .put("http://49.249.28.218:8091/project/"+projectId)

	        .then()
	        .statusCode(200)
	            .log().all();
		
	}


	@Test(dependsOnMethods = "Updating")
	public void deleting() {	RestAssured.baseURI="http://49.249.28.218:8091";
		
		RestAssured.given().delete("/project/"+ projectId).then().statusCode(204).log().all();
		
	}


}
