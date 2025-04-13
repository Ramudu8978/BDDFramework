package stepDefination;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Folder/GoogleSearch.feature",
glue= {"stepDefination"},
plugin={"pretty","junit:target/JUNITReports/reports"},
tags= "@smoke")
public class TestRunner {
	
}
