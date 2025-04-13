package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	//Constructor
	
	LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	//Locaters
	
	By txt_username_loc=By.name("username");
	By txt_password_loc=By.name("password");
	By btn_login_loc=By.xpath("//button[@type='submit']");
	
	
	//Actions
	
	public void setUsername(String user)
	{
		driver.findElement(txt_username_loc).sendKeys(user);
	}
	public void setpasswd(String passwd)
	{
		driver.findElement(txt_password_loc).sendKeys(passwd);
	}
	public void loginbtn()
	{
		driver.findElement(btn_login_loc).click();
	}

}
