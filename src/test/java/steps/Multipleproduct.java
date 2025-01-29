package steps;

import org.openqa.selenium.By;

import drivers.allDrivers;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Multipleproduct extends allDrivers{
	
	@When("user add again another product")
	public void user_add_again_another_product() {
		
		driver.findElement(By.name("add-to-cart-sauce-labs-bolt-t-shirt")).click();
	   
	}

	@Then("user removee the product")
	public void user_removee_the_product() throws InterruptedException {
		
		driver.findElement(By.name("remove-sauce-labs-bolt-t-shirt")).click();
		Thread.sleep(3000);
	   
	}




}
