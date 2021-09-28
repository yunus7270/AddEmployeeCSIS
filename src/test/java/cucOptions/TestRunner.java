package cucOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "@AddEmployee",
		features = "src/test/java/features",
		glue = "stepDefinitions"
		)
public class TestRunner {

}
