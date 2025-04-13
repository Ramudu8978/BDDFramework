package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src/test/resources/Feature"},
		glue= {"StepDefination"},
		plugin= {"pretty","html:target/cucumber-reports.html"})

public class CucumberTestRunner extends AbstractTestNGCucumberTests {

}
