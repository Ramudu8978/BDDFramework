package testBackgroud;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroudKey {
	@Given("user is logged in")
	public void user_is_logged_in() {
		System.out.println("user is logged in");
	   
	}

	@When("user clicks on login link")
	public void user_clicks_on_login_link() {
		System.out.println("user clicks on login link");
	   
	}

	@Then("logout link is displayed")
	public void logout_link_is_displayed() {
		System.out.println("logout link is displayed");


	}

	@When("user clicks on page link")
	public void user_clicks_on_page_link() {
		System.out.println("user clicks on page link");


	}

	@Then("quick launch browser")
	public void quick_launch_browser() {
		System.out.println("quick launch browser");
	   
	}
}
