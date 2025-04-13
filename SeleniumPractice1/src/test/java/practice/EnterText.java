package practice;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.File.*;
import java.nio.file.DirectoryStream.Filter;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class EnterText {
	private static Object FileUtils;

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.29.0");
//		driver.findElement(By.name("q")).sendKeys("selenium java");
//		
//		
//		driver.findElement(By.xpath("//*[@id='search']/form/input[2]")).submit();
//		File srcfile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		//FileUtils.copyFile(srcfile,new File("/target"));
//		Robot robot=new Robot();
//		robot.keyPress(KeyEvent.VK_ENTER);
		
		driver.navigate().to("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.29.0");
//		driver.navigate().back();
//		driver.navigate().forward();
		TakesScreenshot screen=(TakesScreenshot)driver;
		File srcfile=screen.getScreenshotAs(OutputType.FILE);
		 //FileUtils.copyFile(srcfile,new File("screenshot.png"));
		try
		{
			WebElement element=driver.findElement(By.name("1"));
			System.out.println("element is present");
		}
		catch(NoSuchElementException e)
		{
			System.out.println("element is not present"+e.getMessage());
			
		}
		
		
		
	}

}
