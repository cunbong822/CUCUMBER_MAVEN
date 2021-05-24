package pageObject;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUi.HomePageUI;

public class HomePageObject extends AbstractPage {
	WebDriver driver;
	public HomePageObject(WebDriver mappingDriver) {
		driver = mappingDriver;
	}
	public boolean isLoginSuccessful(String message) {
		return isControlDisplay(driver, HomePageUI.LOGIN_SUCCESS_MESSAGE,message);
	}
	public boolean isUserUnDisplay(String user) {
		return isControlUnDisplay(driver, HomePageUI.USER_ID, user);
	}
}
