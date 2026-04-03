package dummy_Rest_API;

import java.util.Base64;
import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Creating_Resource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String>b=new HashMap<>();
		 b.put("name", "Arun");
	     b.put("salary", "200000");
	     b.put("age", "21");
	
	     RestAssured.given().contentType(ContentType.JSON).body(b).
	     when().post("https://dummy.restapiexample.com/api/v1/create")
	     .then()
	     .statusCode(200).log().all();

	}

}
