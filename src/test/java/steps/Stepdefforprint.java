package steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import drivers.allDrivers;
import io.cucumber.java.en.Then;

public class Stepdefforprint extends allDrivers{
	
	@Then("user print the lable")
	public void user_print_the_lable() {
		String lable = driver.findElement(By.xpath(("//div[@class='app_logo']"))).getText();
		System.out.println("********"+lable+"*************");	   
	}

}
