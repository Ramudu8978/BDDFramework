package loginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookLogin {
	
	WebDriver driver;
	
	@Given("user is on facebook login page")
	public void user_is_on_facebook_login_page() {
		
		driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().minimize();
	   
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String username, String password) throws InterruptedException {
		
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
	   
	}
		
	    
	

	@Then("successfull login to facebook")
	public void successfull_login_to_facebook() {
		
		driver.getTitle();
		
	    
	}
	
//	//TestNg Dataprovider
//	@DataProvider(name="logindata")
//	public Object[][] getdata()
//	{
//		return new Object[][] {
//			{"mohanrajeee6@gmail.com", "mohanrajeee6@gmail.com"},
//			{"mohanrajeee6@gmail.com", "mohanrajeee6@gmail.com"}
//				
//			};
//		}
}
		

