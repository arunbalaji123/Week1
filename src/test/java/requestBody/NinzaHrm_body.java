package requestBody;


import org.testng.annotations.Test;
import pojo.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;


public class NinzaHrm_body {

	@Test
	public void post() {
		CreateProject ar= new CreateProject("ARUN BALAJI","PANIMALAR","Created",0);
		RestAssured.given().contentType(ContentType.JSON).body(ar).when().post("http://49.249.28.218:8091/addProject")
		.then().log().all().statusCode(201);

	}
}
