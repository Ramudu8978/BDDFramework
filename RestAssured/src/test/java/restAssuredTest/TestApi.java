package restAssuredTest;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class TestApi {
	@org.testng.annotations.Test
	
	public void Test()
	{
		RestAssured.baseURI="https://reqres.in/api";
		
		
		given()
		.header("Content-Type", "application/JSON")
		
		
		.when()
		 .post("/users/2")
		.then()
		.statusCode(200).log();
	}

}
