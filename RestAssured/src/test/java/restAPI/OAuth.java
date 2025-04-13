package restAPI;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.ValidatableResponse;

public class OAuth {
	
	@Test
	
	public void oAuth()
	{
		int accessToken;
		
	
		 given()
		 .baseUri("https://example.com/api")
		 .header("Authorization", "Bearer "  ) // Use token
		 .when()
		 .get("/secure-data")
		 .then()
		 .statusCode(200)
		 .log().body();
		
	}

}
