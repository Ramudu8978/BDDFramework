package drivenTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("User is on login page")
	public void user_is_on_login_page() {
		System.out.println("user is login page");
	   
	}

	@When("User enters username {string} and password {string}")
	public void user_enters_username_and_password(String username, String password) {
        System.out.println("Logging in with Username: " + username + " and Password: " + password);
	    
	}
	@Then("User should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        System.out.println("Login successful!");
    }

    @DataProvider(name = "loginData")
    public Object[][] loginDataProvider() {
        return new Object[][] {
            {"user1", "pass1"},
            {"user2", "pass2"},
            {"user3", "pass3"}
        };
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password) {
        user_is_on_login_page();
        user_enters_username_and_password(username, password);
        user_should_be_logged_in_successfully();
    }

}
