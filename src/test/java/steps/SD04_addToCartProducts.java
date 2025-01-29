package steps;

import org.junit.Assert;

import org.openqa.selenium.By;

import drivers.allDrivers;
import io.cucumber.java.en.Then;

public class SD04_addToCartProducts extends allDrivers {

	@Then("Add to Cart products")
	public void add_to_cart_products() throws InterruptedException {
		driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		Thread.sleep(2000);
		String Saucelabs = driver.findElement(By.xpath(("//div[text()='Sauce Labs Backpack']"))).getText();
		System.out.println(Saucelabs);
		Assert.assertEquals(Saucelabs, "Sauce Labs Backpack");
	}
}
