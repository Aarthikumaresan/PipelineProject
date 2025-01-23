package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import drivers.allDrivers;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC08_WithoutEmail_Steps extends allDrivers {
	
	@When("User enters all the Fields Without email")
	public void user_enters_all_the_fields_without_email() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='Name']")).sendKeys("Aarthi");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("");
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

	   

	@Then("user getting error message after submit the button")
	public void user_getting_error_message_after_submit_the_button() {
		String Error = driver.findElement(By.xpath(("//p[normalize-space()='*Email is required']"))).getText();
		System.out.println(Error);
		Assert.assertEquals(Error, "*Email is required");

	   
	}
}
