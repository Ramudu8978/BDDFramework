import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginTest {
	@Given("User is on login page")
	public void user_is_on_login_page() {
		System.out.println("user is on login page");
	    
	}

	@When("user enters user name and password")
	public void user_enters_user_name_and_password() {
		System.out.println("user enters user name and password");
	   
	}

	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("click on login button");
	    
	}

	@Then("user is navigate to login page")
	public void user_is_navigate_to_login_page() {
		System.out.println("navigate to login page");
	    
	}


}
