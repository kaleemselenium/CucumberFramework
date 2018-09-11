package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(	
		features = {"src/test/java/resources/features/"},
		glue = {"stepDefs"},
		monochrome = true, 
		tags = {},
		plugin = {"pretty"}
		)

public class TestRunner {
	

}
