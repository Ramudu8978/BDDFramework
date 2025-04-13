package restAPI;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class ModifyData {
	
	@Test
	
	public void changeData()
	{
		
		String s="{\"user\":\"rockey\",\"age\":\"26\"}";
		
		RestAssured.baseURI="https://reqres.in/api";
		
		given()
		 .contentType(ContentType.JSON)
		 .body(s)
		 .when()
		 .put("/users/2")
		 .then()
		  .statusCode(200).log().all();
	}

}
