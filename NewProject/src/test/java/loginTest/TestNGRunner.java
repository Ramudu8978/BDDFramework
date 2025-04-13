package loginTest;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/resources/Features",
		glue="loginTest",
		plugin= {"pretty","html:target/cucumber-reports.html",
				  "json:target/cucumber-reports.json"})

public class TestNGRunner extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
	
	

}
