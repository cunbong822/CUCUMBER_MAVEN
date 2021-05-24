package pageObject;

import org.openqa.selenium.WebDriver;
import commons.AbstractPage;
import pageUi.DeleteAccountPageUI;

public class DeleteCustomerPageObject extends AbstractPage {
	WebDriver driver;
	public DeleteCustomerPageObject(WebDriver mappingDriver) {
		driver = mappingDriver;
	}

}
