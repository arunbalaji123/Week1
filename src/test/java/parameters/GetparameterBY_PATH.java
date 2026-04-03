package parameters;
	import org.testng.annotations.Test;

	import io.restassured.RestAssured;
	
public class GetparameterBY_PATH {
		@Test
		public void getParticularProjectById() {
			
			RestAssured.given()
			   .pathParam("projectId","NH_PROJ_")
			
		
			.when()
			   .get("http://49.249.28.218:8091/project/{projectId}")
			   
			   
			   
			   .then()
			         .log().all();
		}
		}


