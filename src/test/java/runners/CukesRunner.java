package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "@temp",
		plugin = {"pretty","html:target/cucumber","json:target/report.json"},
		features = "src/test/resources/Features",
		glue = "steps"
		,dryRun = true
		)

public class CukesRunner {

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
