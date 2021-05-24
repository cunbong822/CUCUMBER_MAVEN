package pageObject;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUi.AbstractPageUI;
import pageUi.LoginPageUI;

public class LoginPageObject extends AbstractPage{
	WebDriver driver;
	public LoginPageObject(WebDriver mappingDriver) {
		driver = mappingDriver;
	}
	public String getLoginPageUrl() {
		return getCurrentPageUrl(driver);
	}
	public void inputUsernameTextbox(String userName) {
		waitForControlVisible(driver, LoginPageUI.LOGIN_BUTTON);
		sendkeyToElement(driver,LoginPageUI.USER_ID_TEXTBOX, userName);
	}
	public void inputPasswordTextbox(String password) {
		waitForControlVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
		sendkeyToElement(driver,LoginPageUI.PASSWORD_TEXTBOX, password);
	}
	public HomePageObject clickLoginButton() {
		waitForControlVisible(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver,  LoginPageUI.LOGIN_BUTTON);
		return PageFactoryManager.openHomePage(driver);
	}
	public RegisterPageObject clickHereLink() {
		waitForControlVisible(driver,AbstractPageUI.DYNAMIC_PAGE_LINK,"here");
		clickToElement(driver,AbstractPageUI.DYNAMIC_PAGE_LINK,"here");
		return PageFactoryManager.openRegisterPage(driver);
	}
	
}
