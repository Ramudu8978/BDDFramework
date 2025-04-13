package restAPI;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ValidateResponse {

    // DataProvider method to supply multiple sets of test data
    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        return new Object[][]{
                {"user1", "password1"},
                {"user2", "password2"},
                {"user3", "password3"}
        };
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password) {
        RestAssured.baseURI = "https://reqres.in/api";

        Response response = given()
                .header("Content-Type", "application/json")
                .body("{ \"username\": \"" + username + "\", \"password\": \"" + password + "\" }")
                .when()
                .post("/users")
                .then()
                .extract().response();

        Assert.assertEquals(response.statusCode(), 201, "Login API failed for user: " + username);
    }
}