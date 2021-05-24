package stepDefinations;

import org.openqa.selenium.WebDriver;

import commons.AbstracTest;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObject.PageFactoryManager;
import pageObject.RegisterPageObject;

public class RegisterStepDefination {
	WebDriver driver;
	private RegisterPageObject registerPage;
	private AbstracTest abstractTest;
	static String userId, password;
	
	public RegisterStepDefination() {
		driver = Hooks.openBrowser();
		registerPage = PageFactoryManager.openRegisterPage(driver);
		abstractTest = new AbstracTest();
	}
	
	@When("^I input to email textbox with data \"([^\"]*)\"$")
	public void iInputToEmailTextboxWithData(String email) {
		registerPage.inputEmailAddress(email + abstractTest.randomNumber() +"@gmail.com");
	}
	@When("^I click to submit button at register page$")
	public void iClickToSubmitButtonAtRegisterPage() {
		registerPage.clickToSubmitEmailAddress();
	}
	@Then("^I get the userId infor$")
	public void iGetTheUserIdInfor() {
		userId = registerPage.getUserIdFromRegister();
	}

	@Then("^I get the password infor$")
	public void iGetThePasswordInfor() {
		password = registerPage.getPasswordFromRegister();

	}
	@When("^I open login page again$")
	public void iOpenLoginPageAgain() {
		registerPage.openLoginPage(LoginStepDefination.loginPageUrl);
	}
}
