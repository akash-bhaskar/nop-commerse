package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
		(
				plugin = "pretty",
				features = "src/main/resources/BussinessLogic",
				glue = "cucumbermap",
				tags = "@RegressionTest",
				monochrome = true
		)
public class RunTest 
{

}
