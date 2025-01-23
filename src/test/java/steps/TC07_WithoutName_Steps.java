package steps;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import drivers.allDrivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC07_WithoutName_Steps extends allDrivers{
	
	@Given("user login the page with valid credential")
	public void user_login_the_page_with_valid_credential() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("aarthi.kumaresan@expleogroup.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Aarthi@123");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(5000);
	    
	}

	@When("User Clicks the new insurance Tab")
	public void user_clicks_the_new_insurance_tab() throws InterruptedException {
		WebElement newInsurance = driver.findElement(By.xpath("//a[normalize-space()='New Insurance']"));
		newInsurance.click();
		Thread.sleep(5000);
	    
	}

	@When("User enters all the Fields Without name")
	public void user_enters_all_the_fields_without_name() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='Name']")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("aarthi@gmail.com");
		driver.findElement(By.xpath("//input[@name='Address']")).sendKeys("24,malina street");
		driver.findElement(By.id("DateOfBirth")).sendKeys("10-28-2000");
		WebElement gender = driver.findElement(By.xpath("//input[@value='Female']"));
		gender.click();
		Thread.sleep(2000);
		WebElement policyType = driver.findElement(By.name("policyType"));
		Select selectpolicyType = new Select(policyType);
		selectpolicyType.selectByIndex(2);
		Thread.sleep(3000);
		
		WebElement coverage = driver.findElement(By.name("coverage"));
		Select selectCoverage = new Select(coverage);
		selectCoverage.selectByValue("Term");
		Thread.sleep(2000);
		
		WebElement sumInsured = driver.findElement(By.name("SumInsured"));
		Select selectSumInsured = new Select(sumInsured);
		selectSumInsured.selectByVisibleText("1,00,000");
		Thread.sleep(2000);
		
		driver.findElement(By.id("Premium")).sendKeys("1000");
		driver.findElement(By.xpath("//input[@value='No']")).click();
	}

	@When("User click the Submit button")
	public void user_click_the_submit_button() throws InterruptedException {
		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(4000);
	   
	}

	@Then("user gettin error message after submit the button")
	public void user_gettin_error_message_after_submit_the_button() {
	String Errormsg = driver.findElement(By.xpath(("//p[normalize-space()='*Name is required']"))).getText();
	System.out.println(Errormsg);
	Assert.assertEquals(Errormsg, "*Name is required");

	   
	}



}
