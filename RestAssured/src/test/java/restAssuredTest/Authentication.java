package restAssuredTest;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class Authentication {
	@Test
	
	public void Authen()
	{
		
		RestAssured.baseURI="https://httpbin.org/basic-auth/user/passwd";
		
		
		given()
		.auth().basic("user", "passwd")
		.when()
		 .get()
		 .then()
		 .statusCode(200)
		 .log().body();
	}

}
