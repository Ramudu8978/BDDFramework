package smallProject;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class SimpleP {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		//driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.29.0");
		driver.navigate().to("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.29.0");
		WebElement element=driver.findElement(By.name("q"));
		driver.findElement(By.name("q")).clear();
		driver.getWindowHandle();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.manage().window().maximize();
		//String text=driver.findElement(By.name("q")).getAttribute();
		Actions ac=new Actions(driver);
		ac.click(element);
		ac.doubleClick();
		ac.contextClick(element).build().perform();
		System.out.println(driver.getCurrentUrl());
		String text=driver.getTitle();
		System.out.println(text);
		driver.getPageSource();
		List links=driver.findElements(By.tagName("a"));
		System.out.println(links);
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copy(srcfile,new File("/SeleniumProject/target"));
		Select sc=new Select(driver.findElement(By.id("")));
		sc.selectByIndex(0);
		sc.selectByValue(text);
		sc.selectByVisibleText("indis");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		
		}

}
