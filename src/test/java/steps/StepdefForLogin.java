package steps;

import org.openqa.selenium.By;

import drivers.allDrivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepdefForLogin extends allDrivers {
	

@Given("User should enter valid {string} and {string}")
public void user_should_enter_valid_and(String username, String password) throws InterruptedException {
	driver.findElement(By.id("user-name")).clear();
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).clear();
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	Thread.sleep(5000);
 
	    
	}

	@When("User clicks the Login button")
	public void user_clicks_the_login_button() throws InterruptedException {
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
	   
	}

	@Then("User should be login successfully")
	public void user_should_be_login_successfully() {
	
		System.out.print("Login Successfully");
	   
	}




}
