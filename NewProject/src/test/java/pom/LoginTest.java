package pom;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class LoginTest {
	
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	@Test
	void login()
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUsername("Admin");
		lp.setpasswd("admin123");
		lp.loginbtn();
		
	}
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}

}
