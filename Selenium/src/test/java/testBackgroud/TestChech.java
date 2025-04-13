package testBackgroud;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Folder/Background.feature",
glue= {"testBackground"},
plugin={"json:target/cucumber.json"})
public class TestChech {
	
}
