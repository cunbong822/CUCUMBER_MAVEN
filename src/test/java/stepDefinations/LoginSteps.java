package stepDefinations;

import java.util.List;
import java.util.Map;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;

public class LoginSteps{
	WebDriver driver;
	static String userId, password,url;
	public LoginSteps() {
		driver = Hooks.openBrowser();
	}






	



	@When("^I open New Customer page$")
	public void iOpenNewCustomerPage() {
		driver.findElement(By.xpath("//a[text()='New Customer']")).click();

	}

	@When("^I input to New Customer form with data$")
	public void iInputToNewCustomerFormWithData(DataTable customerTable) {
		List<Map<String,String>> customer = customerTable.asMaps(String.class, String.class);
		driver.findElement(By.xpath("//input[@name = 'name']")).sendKeys(customer.get(0).get("Name"));
		driver.findElement(By.xpath("//input[@value= '"+ customer.get(0).get("Gender") +"']"));
		driver.findElement(By.xpath("//input[@name = 'dob']")).sendKeys(customer.get(0).get("DateOfBirth"));
		driver.findElement(By.xpath("//textarea[@name = 'addr']")).sendKeys(customer.get(0).get("Address"));
		driver.findElement(By.xpath("//input[@name = 'city']")).sendKeys(customer.get(0).get("City"));
		driver.findElement(By.xpath("//input[@name = 'state']")).sendKeys(customer.get(0).get("State"));
		driver.findElement(By.xpath("//input[@name = 'pinno']")).sendKeys(customer.get(0).get("Pin"));
		driver.findElement(By.xpath("//input[@name = 'telephoneno']")).sendKeys(customer.get(0).get("Phone"));
		driver.findElement(By.xpath("//input[@name = 'emailid']")).sendKeys(customer.get(0).get("Email"));
		driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys(customer.get(0).get("Password"));
	}

	@When("^I click submit button at new customer page$")
	public void iClickSubmitButtonAtNewCustomerPage() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^I verify message displayed with message \"([^\"]*)\"$")
	public void iVerifyMessageDisplayedWithMessage(String arg1) {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^I verify all above information created successfully$")
	public void iVerifyAllAboveInformationCreatedSuccessfully(DataTable arg1) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)

	}

	@When("^I get CustomerID at New Customer page$")
	public void iGetCustomerIDAtNewCustomerPage() {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^I open Edit Customer page$")
	public void iOpenEditCustomerPage() {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^I input CustomerID to Edit customer page$")
	public void iInputCustomerIDToEditCustomerPage() {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^I click to Submit button at Edit Customer page$")
	public void iClickToSubmitButtonAtEditCustomerPage() {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^I input to Edit Customer form with data$")
	public void iInputToEditCustomerFormWithData(DataTable arg1) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)

	}

	@When("^I click submit button at edit customer page$")
	public void iClickSubmitButtonAtEditCustomerPage() {
		// Write code here that turns the phrase above into concrete actions

	}
	public int randomNumber() {
		Random rand = new Random();
		int number = rand.nextInt(999999) + 1;
		return number;
	}
}