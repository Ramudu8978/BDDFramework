package restAPI;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class JsonRes {
	@Test
	
	public void jsonResponse()
	{
		RestAssured.baseURI="https://reqres.in/api";
		
		Response res= 
				given()
				 
				  .when()
				     .get("/users/2")
				    .then()
				    .statusCode(200)
				     .extract().response();
		
		System.out.println("json response:"+res.cookie(DEFAULT_BODY_ROOT_PATH));
				 
	}

}
