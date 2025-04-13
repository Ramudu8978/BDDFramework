package restAPI;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class DataDrivenTest {
	
	@Test(dataProvider="userData",dataProviderClass=TestDataProvider.class)
	
		
	 public void testLoginAPI(String username, String password) 
	 {
	 given()
	 .baseUri("https://example.com")
	 .header("Content-Type", "application/json")
	 .body("{ \"username\": \"" + username + "\", \"password\":\"" + password + "\" }")
	 .when()
	 .post("/login")
	 .then()
	 .statusCode(201); // Validate response
	 
	}
	
	

}
