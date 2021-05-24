package pageObject;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUi.AbstractPageUI;

public class AbstractPageObject extends AbstractPage {

	WebDriver driver;

	public AbstractPageObject(WebDriver mappingDriver) {
		driver = mappingDriver;
	}

	public void inputToDynamicTextboxTextArea(String textboxId, String value) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_PAGE_BUTTON_TEXTBOX, textboxId);
		sendkeyToElement(driver, AbstractPageUI.DYNAMIC_PAGE_BUTTON_TEXTBOX, value, textboxId);
	}

	public void clickToDynamicButtonAndRadio(String buttonName) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_PAGE_BUTTON_RADIO, buttonName);
		clickToElement(driver, AbstractPageUI.DYNAMIC_PAGE_BUTTON_RADIO, buttonName);
	}

	public void selectDynamicDropDownList(String selectName, String itemName) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_SELECT_DROPDOWN, selectName);
		selectItemInDropdown(driver, AbstractPageUI.DYNAMIC_PAGE_BUTTON_RADIO, itemName, selectName);
	}

	public boolean isDynamicMessageDisplay(String message) {
		return isControlDisplay(driver, AbstractPageUI.DYNAMIC_SUCCESS_XPATH, message);
	}

	public void openDynamicPageLink(String pageName) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_PAGE_LINK, pageName);
		if (driver.toString().toLowerCase().contains("internetexplorer")) {
			clickElementByJS(driver, AbstractPageUI.DYNAMIC_PAGE_LINK, pageName);
			sleepWithDynamicTimeout(5);
		} else {
			clickToElement(driver, AbstractPageUI.DYNAMIC_PAGE_LINK, pageName);
		}

	}
	public void sleepforDynamicTime(String times) throws Exception {
		Thread.sleep(Integer.parseInt(times) * 1000);
	}
}
