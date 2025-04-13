package restAPI;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class QueryParam {
	@Test
	
	public void sentQuery()
	{
		
		RestAssured.baseURI="https://reqres.in/api";
		
		 given()
		   .queryParam("page", 2)
		    .queryParams("id", 2)
		     .when()
		       .get("/users")
		        .then()
		         .statusCode(200).log().all();
	}

}
