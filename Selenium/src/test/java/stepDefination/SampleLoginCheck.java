//package stepDefination;
//
//import org.junit.rules.Timeout;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class SampleLoginCheck<LoginPage> {
//	
//	
//	
//	WebDriver driver;
//	
//	@Given("Open chrome browser")
//	public void open_chrome_browser() {
//		System.out.println("Browser is open");
//		
//		driver=new ChromeDriver();
//	    
//	}
//
//	@And("user is on chrome browser page")
//	public void user_is_on_chrome_browser_page() {
//		//loginPage login=new loginPage(driver);
//		
//		
//		System.out.println("user is on chrome browser page");
//		driver.navigate().to("https://practice.expandtesting.com/login");
//	    
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username, String password ) throws InterruptedException {
//		System.out.println("user enter username and password");
//		LoginPage login=new LoginPage();
//	
//		 
//		 
//		
////		driver.findElement(By.name("username")).sendKeys(username);
////		driver.findElement(By.name("password")).sendKeys(password);
//		Thread.sleep(3000);
//		
//	    
//	}
//
//	@And("click login")
//	public void click_login() throws InterruptedException {
//		System.out.println("click on");
//	Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"login\"]/button")).submit();
//	}
//
//	@Then("Successfully login")
//	public void successfully_login() {
//		driver.getPageSource().contains("You logged into a secure area!"); 
//		
//		driver.close();
//	}
//
//
//}
