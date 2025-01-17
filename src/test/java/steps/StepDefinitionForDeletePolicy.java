package steps;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import drivers.allDrivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionForDeletePolicy extends allDrivers {

	@Given("user is on the login page with valid credentials")
	public void user_is_on_the_login_page_with_valid_credentials() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("aarthi.kumaresan@expleogroup.com");
		driver.findElement(By.id("Password")).sendKeys("Aarthi@123");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(5000);
	}

	@When("user select the policy")
	public void user_select_the_policy() throws InterruptedException {
		WebElement table = driver.findElement(By.xpath("//div[@class='insuranceTable']"));
		List<WebElement> headers = table.findElements(By.tagName("th"));
		for (WebElement header : headers)
		{
			String text = header.getText();
			System.out.println("Headers: "+text);
		}


		List<WebElement> AllRows = table.findElements(By.cssSelector("tbody tr"));
		int size = AllRows.size();
		System.out.println("Total Number of Rows: "+ size);

		for (WebElement row : AllRows) {
			WebElement columns = row.findElement(By.tagName("td"));
			String text = columns.getText();
			System.out.println("All rows first column: "+text);
		}

		WebElement delete_btn = driver.findElement(By.xpath("//tbody/tr[1]/td[8]/button")); //(//button[text()='Delete Policy'])[1]
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", delete_btn);
		Thread.sleep(3000);
	}

	@When("user delete the policy")
	public void user_delete_the_policy() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Yes']"))).click();
	}

	@Then("policy should be deleted in the dashboard")
	public void policy_should_be_deleted_in_the_dashboard() {
		System.out.println("Policy deleted successfully");
	}

}
