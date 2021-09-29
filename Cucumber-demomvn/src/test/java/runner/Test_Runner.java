package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src\\test\\resources\\Login"},
glue={"StepDefinition"},
monochrome =true,//to make the console output in a better format//readable format
dryRun = false,//if my dry run is true it will not execute the scenario
strict=true,//To check did i miss any steps/is all fine in the step definition
plugin = {"html:testoutput/cucumber.html","junit:testoutput/cucumber.xml","json:testoutput/cucumber.json"}
	)
public class Test_Runner {

}
