package pageObject;

import org.openqa.selenium.WebDriver;
import commons.AbstractPage;

public class FundTransferPageObject extends AbstractPage {
	WebDriver driver;
	public FundTransferPageObject(WebDriver mappingDriver) {
		driver = mappingDriver;
	}
}
