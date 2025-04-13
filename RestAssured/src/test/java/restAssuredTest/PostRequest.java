package restAssuredTest;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class PostRequest {
	@Test
	
	public void postReq()
	{
		
		RestAssured.baseURI="https://reqres.in/api";
		
		given()
		.pathParam("UserId", 1)
		
		
		.when()
		.get("/users/{UserId}")
		
		.then()
		.statusCode(200).log().body();
		
		
		
	}

}
