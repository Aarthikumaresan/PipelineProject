package steps;

import org.openqa.selenium.By;

import drivers.allDrivers;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Addtocard extends allDrivers{
	
	@When("user click add to cart")
	public void user_click_add_to_cart() {
		
		driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
	    
	}

	@When("user click the icon")
	public void user_click_the_icon() {
		
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	    
	}

	@Then("user remove the product")
	public void user_remove_the_product() throws InterruptedException {
		
		driver.findElement(By.name("remove-sauce-labs-backpack")).click();
	Thread.sleep(4000);
	   
	}




}
