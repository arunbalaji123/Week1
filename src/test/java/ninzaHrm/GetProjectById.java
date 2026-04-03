package ninzaHrm;

import io.restassured.RestAssured;

public class GetProjectById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.given().when()
        .get("http://49.249.28.218:8091/project/NH_PROJ_2880")
		.then().log().all();
		

	}
}
