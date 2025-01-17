package RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/resources",
		glue = {"steps","hooks"},
		plugin= {"pretty", "json:target/cucumber.json", 
				"html:target/cucumber.html"},
		tags="@All_Scenarios",
		dryRun = false
		//snippets = SnippetType.CAMELCASE
	
		)

public class Runner {

}
