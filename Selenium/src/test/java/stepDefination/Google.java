package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.apache.*;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Google {
	
	WebDriver driver;
	
	@Before
	public void browserSetup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	@After
	public void tearDown()
	{
		System.out.println("inside the browser");
		
		driver.close();
	}
	public void beforeTest()
	{
		System.out.println("beforetest");
	}
	public void afterTest()
	{
		System.out.println("after test");
	}
	
	@Given("open browser")
	public void open_browser() {
		
		
		
		System.out.println("inside-open browser");
	   
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("user is on google search page");
		
	}

	@When("user enter a text")
	public void user_enter_a_text() {
		System.out.println("user enter a text");
	   
	}

	@And("hits enter")
	public void hits_enter() {
		System.out.println("hits enter");
	   
	}

	@Then("user redirect to search result")
	public void user_redirect_to_search_result() {
		System.out.println("user redirect to search result");		
	   
	}



}
