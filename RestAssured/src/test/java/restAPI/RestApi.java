package restAPI;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class RestApi {
	
	@Test
	
	public void getRequest()
	{
		
		given()
	    .header("Content-Type", "application/json")
	    .body("{ \"name\": \"John\", \"job\": \"QA\" }")
	    .when()
	    .post("https://reqres.in/api/users")
	    .then()
	    .statusCode(201);
	}

}
