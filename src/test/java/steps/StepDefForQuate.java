package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import drivers.allDrivers;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefForQuate extends allDrivers{
	
	@When("user click the quate generation")
	public void user_click_the_quate_generation() {
		driver.findElement(By.xpath("//a[normalize-space()='Quate Generation']")).click();
	    
	}

	@When("user select the policy type")
	public void user_select_the_policy_type() throws InterruptedException {
		WebElement policyType = driver.findElement(By.name("policyType"));
		Select selectpolicyType = new Select(policyType);
		selectpolicyType.selectByIndex(2);
		Thread.sleep(3000);
	
		
	    
	}

	@When("user enter the Coverage Amount")
	public void user_enter_the_coverage_amount() {
		driver.findElement(By.name("coverageAmount")).sendKeys("500000");
	    
	}

	@When("user enter Customer Age")
	public void user_enter_customer_age() {
		driver.findElement(By.name("customerAge")).sendKeys("24");
	   
	}

	@When("user click generate quote")
	public void user_click_generate_quote() throws InterruptedException {
		driver.findElement(By.xpath("//button[normalize-space()='Generate Quote']")).click();
		Thread.sleep(5000);
	    
	}

	@Then("user print the msgs")
	public void user_print_the_msgs() {
		WebElement generated = driver.findElement(By.xpath("//h3[starts-with(text(), 'Generated Quot')]"));
		String text = generated.getText();
		System.out.println(text);
		
	   
	}




}
