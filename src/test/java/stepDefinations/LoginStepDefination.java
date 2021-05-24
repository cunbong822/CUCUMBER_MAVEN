package stepDefinations;

import org.openqa.selenium.WebDriver;
import commons.AbstracTest;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObject.LoginPageObject;
import pageObject.PageFactoryManager;

public class LoginStepDefination {
	WebDriver driver;
	private LoginPageObject loginPage;
	private AbstracTest abstractTest;
	static String loginPageUrl;
	
	public LoginStepDefination() {
		driver = Hooks.openBrowser();
		loginPage = PageFactoryManager.openLoginPage(driver);
		abstractTest = new AbstracTest();
	}
	
	@When("^I get login page url$")
	public void iGetTheLoginPageUrl() {
		loginPageUrl = loginPage.getCurrentPageUrl(driver);
	}
	@When("^I click here link$")
	public void iClickHereLink() {
		loginPage.clickHereLink();
	}
	
	@When("^I input username textbox$")
	public void iInputUsername() {
		loginPage.inputUsernameTextbox(RegisterStepDefination.userId);
	}

	@When("^I input password textbox$")
	public void iInputPassword() {
		loginPage.inputPasswordTextbox(RegisterStepDefination.password);
	}

	@When("^Click to login button$")
	public void clickToLoginButton() {
		loginPage.clickLoginButton();
	}

	
}
