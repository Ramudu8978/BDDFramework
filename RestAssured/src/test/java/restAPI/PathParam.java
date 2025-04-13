package restAPI;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
public class PathParam {
	
	@Test
	
	public void sentPath()
	{
		RestAssured.baseURI="https://reqres.in/api";
		given()
		  .pathParam("userId",1)
		  .when()
		   .get("/users/{userId}")
		    .then()
		     .statusCode(200).log().all();
	}

}
