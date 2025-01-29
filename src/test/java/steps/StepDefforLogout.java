package steps;

import org.openqa.selenium.By;

import drivers.allDrivers;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefforLogout extends allDrivers{
	@When("user clicks the Arrow")
	public void user_clicks_the_arrow() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
		Thread.sleep(3000);
	   
	}

	@Then("user click the logout")
	public void user_click_the_logout() {
	   
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}




}
