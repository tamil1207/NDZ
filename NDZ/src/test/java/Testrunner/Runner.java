package Testrunner;

import org.junit.runner.RunWith;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = {"src/test/resources/Features"},
			glue = {"Reuse"},
			dryRun = true
	)
public class Runner   extends AbstractTestNGCucumberTests{
}
