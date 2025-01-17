package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import drivers.allDrivers;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionForPolicyInitiation extends allDrivers {

	@When("user click the policy initiation")
	public void user_click_the_policy_initiation() throws InterruptedException {
		Thread.sleep(3000);
		WebElement initiation = driver.findElement(By.xpath("//a[text()='Policy Initiation']"));
		Actions act = new Actions(driver); 
		act.click(initiation).build().perform();
	}

	@When("user enter {string} and {string} and {string} and {string} and {string}")
	public void user_enter_and_and_and_and(String CustomerName, String DataOfBirth, String Email, String PhoneNumber, String Address) {
		driver.findElement(By.xpath("//input[@placeholder='Customer Name']")).sendKeys(CustomerName);
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys(DataOfBirth);
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(Email);
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(PhoneNumber);
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys(Address);
	}

	@When("user select the gender")
	public void user_select_the_gender() throws InterruptedException {
		WebElement Gender = driver.findElement(By.name("gender"));
		Select selectgender = new Select(Gender);
		selectgender.selectByIndex(2);
		Thread.sleep(2000);
	}

	@When("user clicks the existing policy")
	public void user_clicks_the_existing_policy() {
		driver.findElement(By.name("existingPolicy")).click();

	}

	@When("user select Policy type")
	public void user_select_policy_type() throws InterruptedException {
		WebElement policytype = driver.findElement(By.name("policyType"));
		Select selectpolicytype = new Select(policytype);
		selectpolicytype.selectByIndex(2);
		Thread.sleep(3000);


	}

	@When("user click valid and proceed button")
	public void user_click_valid_and_proceed_button() {
		driver.findElement(By.xpath("//button[normalize-space()='Validate and Proceed']")).click();

	}

	@Then("user navigate to new insurance page")
	public void user_navigate_to_new_insurance_page() {
		System.out.print("Navigate to the new insurance page");
	}


}
