package restAPI;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class BasicAuth {
	
	@Test
	
	public void basicA()
	{
		
		RestAssured.baseURI="https://httpbin.org/basic-auth/user/passwd";
		  given()
		   .auth().basic("user", "passwd")
		    .when()
		      .get()
		       .then()
		         .statusCode(200).log().body();
		    }

}
