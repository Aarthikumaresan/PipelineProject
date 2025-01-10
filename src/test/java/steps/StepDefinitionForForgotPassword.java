package steps;

import org.openqa.selenium.By;

import drivers.allDrivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionForForgotPassword extends allDrivers {
	@Given("useris onthe login page with valid credential")
	public void useris_onthe_login_page_with_valid_credential() {
		System.out.print("Login");
	    
	}

	@When("user click the forgot password")
	public void user_click_the_forgot_password() {
	   driver.findElement(By.xpath("//h4[normalize-space()='Forgot password ?']")).click();
	}

	@When("user enters {string} and {string} and {string}")
	public void user_enters_and_and(String email, String newpassword, String confirmpassword) {
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("aarthi5@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your new password']")).sendKeys("Aarthi123");
		driver.findElement(By.xpath("//input[@placeholder='Confirm your new password']")).sendKeys("Aarthi123");
		
	    
	}

	@When("user clicks the reset opassword")
	public void user_clicks_the_reset_opassword() {
		driver.findElement(By.xpath("//button[normalize-space()='Reset Password']")).click();
	    
	}

	@When("user navigate to the login page")
	public void user_navigate_to_the_login_page() {
		driver.get("http://192.168.99.141:3000/");
		
	}

	@When("user enter the valid username and password")
	public void user_enter_the_valid_username_and_password() {
		driver.findElement(By.id("username")).sendKeys("aarthi5@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Aarthi23");
	    
	}

	@Then("user click submit button")
	public void user_click_submit_button() {
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	    
	}




}
