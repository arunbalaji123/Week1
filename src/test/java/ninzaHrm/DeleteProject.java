package ninzaHrm;

import io.restassured.RestAssured;

public class DeleteProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="http://49.249.28.218:8091";
		
RestAssured.given().delete("/project/NH_PROJ_2942").then().statusCode(204).log().all();
	}

}
