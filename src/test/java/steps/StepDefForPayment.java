package steps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import drivers.allDrivers;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefForPayment extends allDrivers{
	@When("user click Payment Page")
	public void user_click_payment_page() throws InterruptedException {
		driver.findElement(By.xpath("//a[normalize-space()='Payment Page']")).click();
	   Thread.sleep(3000);
	}

	@When("user Enter Policy Amount")
	public void user_enter_policy_amount() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Policy Amount']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Policy Amount']")).sendKeys("40000");
		   Thread.sleep(3000);
	    
	}

	@When("user clicks calculate premium")
	public void user_clicks_calculate_premium() throws InterruptedException {
		driver.findElement(By.xpath("//button[normalize-space()='Calculate Premium']")).click();
		  Thread.sleep(3000);
	    
	}

	@When("user print the msg")
	public void user_print_the_msg() {
		WebElement premium = driver.findElement(By.xpath("//p[starts-with(text(), 'Premium')]"));
		String text = premium.getText();
		System.out.println(text);
	}

	@When("user click the proceed to pay")
	public void user_click_the_proceed_to_pay() throws InterruptedException {
		driver.findElement(By.xpath("//button[normalize-space()='Proceed to Pay']")).click();
		Thread.sleep(3000);
	    
	}

	@Then("user handle the alert msg")
	public void user_handle_the_alert_msg() {
		Alert alert =driver.switchTo().alert();
		alert.accept();
	    
	}




}
