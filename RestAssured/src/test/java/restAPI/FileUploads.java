package restAPI;

import java.io.File;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class FileUploads {
	
	@Test
	
	public void fileUpload()
	{
		
		File file=new File("src/test/resources/File/multipart");
		
		RestAssured.baseURI="https://reqres.in/api";
		given()
		 .multiPart("file",file)
		 .contentType(ContentType.MULTIPART)
		 .when()
		   .post("/uploads")
		   
		   .then()
		   .statusCode(201).log().all()
		    .extract().response().asString();
                    
		
		
	}

}
