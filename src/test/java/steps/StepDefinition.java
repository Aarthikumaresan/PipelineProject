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

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	WebDriver driver = new EdgeDriver();

	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {

		driver.manage().window().maximize();
		driver.get("http://192.168.99.141:3000/");
	}

	@When("the user enters valid username and password")
	public void the_user_enters_valid_username_and_password() {

		driver.findElement(By.id("username")).sendKeys("aarthi.kumaresan@expleogroup.com");
		driver.findElement(By.id("Password")).sendKeys("Aarthi@123");
	}

	@When("the user clicks on the login button")
	public void the_user_clicks_on_the_login_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(1000);
	}
	
	
	   @Then("the user should be redirected to the dashboard")
	public void the_user_should_be_redirected_to_the_dashboard() {

		   WebElement logout_btn = driver.findElement(By.xpath("//button[text()='Logout']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", logout_btn);
			System.out.println("Login Successful");
				 
	}
	@Then("quit browser1")
	public void quit_browser1() {
	    driver.quit();
	}

	@When("the user enters invalid username and password")
	public void the_user_enters_invalid_username_and_password() {
		driver.findElement(By.id("username")).sendKeys("aarthi.kumaresan@expleo.com");
		driver.findElement(By.id("Password")).sendKeys("Aarthi@1234");
	}
	@Then("the error message should be displayed")
	public void the_error_message_should_be_displayed() {

		WebElement errorMsg = driver.findElement(By.xpath("//p[text()='Invalid username or password']"));
		String ActualError = errorMsg.getText();
		System.out.println(ActualError);
	}

	@Then("quit browser2")
	public void quit_browser2() {
	    driver.quit();
	}



}
