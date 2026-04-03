package requestBody;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class updatebodymethis {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.given().contentType(ContentType.JSON).body(PayLoad.NewBodybyMethod()).when().post("http://49.249.28.218:8091/addProject").then().log().all();

	}

}
