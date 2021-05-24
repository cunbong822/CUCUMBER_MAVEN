package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import commons.AbstracTest;
import cucumber.api.java.en.Then;
import cucumberOptions.Hooks;
import pageObject.HomePageObject;
import pageObject.PageFactoryManager;

public class HomePageStepDefination {
	WebDriver driver;
	private HomePageObject homePage;
	private AbstracTest abstractTest;
	
	public HomePageStepDefination() {
		driver = Hooks.openBrowser();
		homePage = PageFactoryManager.openHomePage(driver);
		abstractTest = new AbstracTest();
	}
	
	@Then("^Verify homepage displayed with message \"([^\"]*)\"$")
	public void verifyHomepageDisplayed(String message) {
		abstractTest.verifyTrue(homePage.isLoginSuccessful(message));
	}
}
