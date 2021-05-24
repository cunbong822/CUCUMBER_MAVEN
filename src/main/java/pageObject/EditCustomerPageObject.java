package pageObject;

import org.openqa.selenium.WebDriver;
import commons.AbstractPage;
import pageUi.EditCustomerPageUI;

public class EditCustomerPageObject extends AbstractPage {
	WebDriver driver;
	public EditCustomerPageObject(WebDriver mappingDriver) {
		driver = mappingDriver;
	}
	public boolean isEditCustomerPageDisplay() {
		return isControlDisplay(driver, EditCustomerPageUI.EDIT_CUSTOMER_SUCCESS);
	}
}
