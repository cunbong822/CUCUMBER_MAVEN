package pageObject;

import org.openqa.selenium.WebDriver;
import commons.AbstractPage;
import pageUi.DeleteAccountPageUI;

public class DeleteAccountPageObject extends AbstractPage {
	WebDriver driver;
	public DeleteAccountPageObject(WebDriver mappingDriver) {
		driver = mappingDriver;
	}
	public boolean isEditDeleteAccountPageDisplay() {
		return isControlDisplay(driver, DeleteAccountPageUI.DELETE_ACCOUNT_SUCCESS);
	}
}
