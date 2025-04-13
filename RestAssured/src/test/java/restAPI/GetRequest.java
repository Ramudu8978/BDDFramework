package restAPI;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class GetRequest {
	//public static void main(String[] args)
	
	@Test
	public void getRequest()
	{
		
		
		RestAssured.baseURI="https://reqres.in/api";
		  given()
		  .when()
		   .get("/users/1")
		    
		   .then()
		    .statusCode(200).log().all();
	}

}
