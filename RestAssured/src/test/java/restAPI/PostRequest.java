package restAPI;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import org.hamcrest.Matcher;
import org.testng.annotations.Test;

public class PostRequest {
	@Test
	
	public void createPost()
	{
		
		String body= "{\"username\":\"ram\",\"age\":\"25\"}"; 
				RestAssured.baseURI="https://reqres.in/api/users";
				given()
				 .contentType(ContentType.JSON)
				 .body(body)
				 .when()
				  .post("/users")
				  .then()
				   .statusCode(201)
				   ;
	}

	

	
	}


