package ninzaHrm;
import java.io.File;

import io.restassured.*;
import io.restassured.http.ContentType;
public class CreateAProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File ar= new File("src/test/resources/CreateProject_data.json");
		RestAssured.given().contentType(ContentType.JSON).body(ar).when().post("http://49.249.28.218:8091/addProject")
		.then().log().all().statusCode(201);

	}

}
