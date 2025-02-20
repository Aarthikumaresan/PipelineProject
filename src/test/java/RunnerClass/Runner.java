package RunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/resources/Expleosurance", 
					"src/test/resources/SauceDemo",
					"src/test/resources/SportsJam"}, 
		glue = {"steps","hooks"},
		plugin= {"pretty", "json:target/cucumber.json", 
							"html:target/cucumber.html"},
		tags="@All_Scenarios",
		dryRun = true,
		monochrome = false
		)

public class Runner extends AbstractTestNGCucumberTests{

}