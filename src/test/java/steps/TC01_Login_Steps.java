package steps;
import static org.junit.Assert.assertEquals;

import java.sql.Driver;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import drivers.allDrivers;
import hooks.hooksClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC01_Login_Steps extends allDrivers{
	
    //=====VALID SCENARIO=================//

	@Given("User should enter valid username and password")
	public void user_should_enter_valid_username_and_password() {
		driver.findElement(By.id("username")).sendKeys("aarthi.kumaresan@expleogroup.com");
		driver.findElement(By.id("Password")).sendKeys("Aarthi@123");

	}
	@When("User clicks the submit button")
	public void user_clicks_the_submit_button() {
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}
	@Then("User should be redirected to the dashboard")
	public void user_should_be_redirected_to_the_dashboard() throws InterruptedException {
		System.out.println("Logged successfully");
		Thread.sleep(2000);
		
		WebElement logout_btn = driver.findElement(By.xpath("//button[@class='w-64 text-left h-6']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", logout_btn);
		System.out.println("Login Successful");
	}

	// ======INVALID SCENARIO===============// 

	@Given("User should enter invalid {string} and {string}")
	public void user_should_enter_invalid_and(String Username, String Password) {
		driver.findElement(By.id("username")).sendKeys(Username);
		driver.findElement(By.id("Password")).sendKeys(Password);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
	}
	@Then("The error message should be displayed")
	public void the_error_message_should_be_displayed() {
		  
		System.out.println("Invalid");
	}
}
