package pageObject;

import org.openqa.selenium.WebDriver;
import commons.AbstractPage;
import pageUi.RegisterPageUI;

public class RegisterPageObject extends AbstractPage {
	WebDriver driver;

	public RegisterPageObject(WebDriver mappingDriver) {
		driver = mappingDriver;
	}

	public void inputEmailAddress(String emailAddress) {
		waitForControlVisible(driver, RegisterPageUI.EMAIL_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.EMAIL_TEXTBOX, emailAddress);
	}

	public void clickToSubmitEmailAddress() {
		waitForControlVisible(driver, RegisterPageUI.SUBMIT_BUTTON);
		clickToElement(driver, RegisterPageUI.SUBMIT_BUTTON);
	}

	public String getUserIdFromRegister() {
		waitForControlVisible(driver, RegisterPageUI.USER_ID_INFOR);
		return getElementText(driver, RegisterPageUI.USER_ID_INFOR);
	}

	public String getPasswordFromRegister() {
		waitForControlVisible(driver, RegisterPageUI.PASSWORD_INFOR);
		return getElementText(driver, RegisterPageUI.PASSWORD_INFOR);
	}

	public LoginPageObject openLoginPage(String url) {
		System.out.println("start open url");
		openAnyUrl(driver, url);
		System.out.println("stop open url");
		if (driver.toString().toLowerCase().contains("internetexplorer")) {
			sleepWithDynamicTimeout(5);
		}
		return new LoginPageObject(driver);
	}
}
