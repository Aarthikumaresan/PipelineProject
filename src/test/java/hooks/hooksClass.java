package hooks;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import drivers.allDrivers;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hooksClass extends allDrivers {

	@Before
	public void launch(Scenario scenario) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		if (scenario.getSourceTagNames().contains("@Sauce_Demo")) {
		    driver.get("https://www.saucedemo.com");
		} else {
		    driver.get("http://192.168.99.141:3000/");
		}
	}

	@After
	public void quit() {
		driver.quit();

	}
 
}
