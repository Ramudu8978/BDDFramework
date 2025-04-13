package loginCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest {
	WebDriver driver;
	By txt_username=By.name("username");
	By txt_password=By.name("password");
	By txt_button=By.xpath("//*[@id=\\\"login\\\"]/button");
	
	public LoginTest(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterUsername(String username)
	{
		driver.findElement(txt_username);
	}
	public void enterPassword(String password)
	{
		driver.findElement(txt_password);
	}
     public void clickButton()
     {
    	 driver.findElement(txt_button);
     }
     public void loginValidUser(String username,String password)
     {
    	 driver.findElement(txt_username);
    	 driver.findElement(txt_password);
    	 driver.findElement(txt_button);
     }
}
