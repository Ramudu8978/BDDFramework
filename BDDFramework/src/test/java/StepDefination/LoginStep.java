package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	
	static WebDriver driver;
	
	@Given("User is login page")
	public void user_is_login_page() {
		
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/v1/");
	    
	}

	@When("User enter valid username and password")
	public void user_enter_valid_username_and_password() {
		WebElement element=driver.findElement(By.id("user-name"));
		element.sendKeys("standard_user");
		WebElement element1=driver.findElement(By.id("password"));
		element1.sendKeys("secret_sauce");
	    
	}

	@And("click on login")
	public void click_on_login() {
		driver.findElement(By.id("login-button")).submit();
	    
	}

	@Then("user navigate to home page")
	public void user_navigate_to_home_page() {
		Assert.assertTrue(driver.findElements(By.xpath("//*[@id='header_container']/div[1]/div")).size()>0,"user navigate to home page");
	   
	}

	@And("close the browser")
	public void close_the_browser() {
		
		driver.close();
	   
	}

}
