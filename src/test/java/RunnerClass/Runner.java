package RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src\\test\\resources",
		glue = {"steps","hooks"},
		plugin= {"pretty", "json:target/cucumber.json", "html:target/cucumber.html"},
		dryRun = false,
		tags="@All_Scenarios"
		
	//	snippets = SnippetType.CAMELCASE
	)

public class Runner {
	
	
}
