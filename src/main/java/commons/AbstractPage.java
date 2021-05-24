package commons;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObject.DeleteAccountPageObject;
import pageObject.EditCustomerPageObject;
import pageObject.HomePageObject;
import pageObject.NewCustomerPageObject;
import pageObject.PageFactoryManager;
import pageObject.WithdrawPageObject;
import pageUi.AbstractPageUI;

public class AbstractPage {
	protected final Log log;

	protected AbstractPage() {
		log = LogFactory.getLog(getClass());
	}

	private int timeOut = 30;
	private int shortTimeOut = 10;
	private int alertWaitTimeOut = 5;

	// Web Browser
	public void openAnyUrl(WebDriver driver, String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
	}

	public String getPageTitle(WebDriver driver) {
		return driver.getTitle();
	}

	public String getCurrentPageUrl(WebDriver driver) {
		return driver.getCurrentUrl();
	}

	public String getPageSource(WebDriver driver) {
		return driver.getPageSource();
	}

	public void backToPreviousPage(WebDriver driver) {
		driver.navigate().back();

	}

	public void refreshCurrentPage(WebDriver driver) {
		driver.navigate().refresh();

	}

	public void forwardToNextPage(WebDriver driver) {
		driver.navigate().forward();

	}

	public void clickToElement(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.click();
	}

	public void clickToElement(WebDriver driver, String locator, String... value) {
		locator = String.format(locator, (Object[]) value);
		WebElement element = driver.findElement(By.xpath(locator));
		element.click();
	}

	public void sendkeyToElement(WebDriver driver, String locator, String text) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.clear();
		if (text.equals("TAB")) {
			element.sendKeys(Keys.TAB);
		}
		else if (text.equals("ENTER")) {
			element.sendKeys(Keys.ENTER);
		}
		else 
		element.sendKeys(text);
	}

	public void sendkeyToElement(WebDriver driver, String locator, String text, String... value) {
		locator = String.format(locator, (Object[]) value);
		WebElement element = driver.findElement(By.xpath(locator));
		element.clear();
		if (text.equals("TAB")) {
			element.sendKeys(Keys.TAB);
		}
		else if (text.equals("ENTER")) {
			element.sendKeys(Keys.ENTER);
		}
		else 
		element.sendKeys(text);
	}

	public void selectItemInDropdown(WebDriver driver, String locator, String item) {
		Select select = new Select(driver.findElement(By.xpath(locator)));
		select.selectByVisibleText(item);
	}
	public void selectItemInDropdown(WebDriver driver, String locator, String item, String ...values) {
		locator = String.format(locator, (Object[]) values);
		Select select = new Select(driver.findElement(By.xpath(locator)));
		select.selectByVisibleText(item);
	}

	public void selectItemInCustomDropdownList(WebDriver driver, String dropdown, String listItems, String valueItem) {

		WebElement dropdownItem = driver.findElement(By.xpath(dropdown));
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		// ((JavascriptExecutor)
		// driver).executeScript("arguments[0].scrollIntoView(true);", dropdownItem);
		dropdownItem.click();

		// get list of all items
		List<WebElement> allItems = driver.findElements(By.xpath(listItems));
		// wait until all element appear
		wait.until(ExpectedConditions.visibilityOfAllElements(allItems));
		// loop and click on selected item
		for (WebElement item : allItems) {
			if (valueItem.equals(item.getText())) {
				// ((JavascriptExecutor)
				// driver).executeScript("arguments[0].scrollIntoView(true);", item);
				item.click();
				break;
			}
		}

	}

	public String getFirstItemSelected(WebDriver driver, String locator) {
		Select select = new Select(driver.findElement(By.xpath(locator)));
		return select.getFirstSelectedOption().getText();

	}

	public String getAttributeValue(WebDriver driver, String locator, String attr) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.getAttribute(attr);

	}

	public String getAttributeValue(WebDriver driver, String locator, String attr, String... value) {
		locator = String.format(locator, (Object[]) value);
		WebElement element = driver.findElement(By.xpath(locator));
		return element.getAttribute(attr);

	}

	public String getElementText(WebDriver driver, String locator, String... values) {
		locator = String.format(locator, (Object[]) values);
		WebElement element = driver.findElement(By.xpath(locator));
		return element.getText();

	}

	public int getSizeElement(WebDriver driver, String locator) {
		List<WebElement> elements = driver.findElements(By.xpath(locator));
		return elements.size();

	}

	public void checkToCheckBox(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));

		if (!element.isSelected()) {
			element.click();
		}
	}

	public void checkToCheckBox(WebDriver driver, String locator, String... value) {
		locator = String.format(locator, (Object[]) value);
		WebElement element = driver.findElement(By.xpath(locator));

		if (!element.isSelected()) {
			element.click();
		}
	}

	public void uncheckToCheckBox(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		if (element.isSelected()) {
			element.click();
		}
	}

	public void uncheckToCheckBox(WebDriver driver, String locator, String... value) {
		locator = String.format(locator, (Object[]) value);
		WebElement element = driver.findElement(By.xpath(locator));
		if (element.isSelected()) {
			element.click();
		}
	}

	public boolean isControlDisplay(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.isDisplayed();
	}

	public boolean isControlDisplay(WebDriver driver, String locator, String... value) {
		locator = String.format(locator, (Object[]) value);
		WebElement element = driver.findElement(By.xpath(locator));
		return element.isDisplayed();
	}

	private void overrideGlobalTimeout(WebDriver driver, int i) {
		driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);

	}

	public boolean isControlUnDisplay(WebDriver driver, String locator) {
		overrideGlobalTimeout(driver, shortTimeOut);
		List<WebElement> elements = driver.findElements(By.xpath(locator));
		if (elements.size() == 0) {
			overrideGlobalTimeout(driver, timeOut);
			return true;
		} else {
			overrideGlobalTimeout(driver, timeOut);
			return false;
		}

	}

	public boolean isControlUnDisplay(WebDriver driver, String locator, String... value) {
		overrideGlobalTimeout(driver, shortTimeOut);
		locator = String.format(locator, (Object[]) value);
		List<WebElement> elements = driver.findElements(By.xpath(locator));
		if (elements.size() == 0) {
			overrideGlobalTimeout(driver, timeOut);
			return true;

		} else {
			overrideGlobalTimeout(driver, timeOut);
			return false;
		}

	}

	public boolean isControlSelected(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.isSelected();
	}

	public boolean isControlSelected(WebDriver driver, String locator, String value) {
		locator = String.format(locator, value);
		WebElement element = driver.findElement(By.xpath(locator));
		return element.isSelected();
	}

	public boolean isControlEnable(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.isEnabled();
	}

	public boolean isControlEnable(WebDriver driver, String locator, String value) {
		locator = String.format(locator, value);
		WebElement element = driver.findElement(By.xpath(locator));
		return element.isEnabled();
	}

	public Alert waitForAlert(WebDriver driver) {
		int i = 0;
		while (i++ < alertWaitTimeOut) {
			try {
				Alert alert = driver.switchTo().alert();
				return alert;
			} catch (NoAlertPresentException e) {
				sleepWithDynamicTimeout(1);
				continue;
			}
		}
		return null;
	}

	public void acceptToAlert(WebDriver driver) {
		Alert alert = waitForAlert(driver);
		alert.accept();
	}

	public void cancelToAlert(WebDriver driver) {
		Alert alert = waitForAlert(driver);
		alert.dismiss();
	}

	public String getTextOfAlert(WebDriver driver) {
		Alert alert = waitForAlert(driver);
		String alertText = alert.getText();
		System.out.println("alertText " + alertText);
		alert.dismiss();
		return alertText;
	}

	public void sendKeyToAlert(WebDriver driver, String text) {
		Alert alert = waitForAlert(driver);
		alert.sendKeys(text);
		alert.dismiss();
	}

	public void doubleClickToElement(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();

	}

	public void hoverToElement(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();

	}

	public void pressKeyToElement(WebDriver driver, String locator, Keys keyName) {
		WebElement element = driver.findElement(By.xpath(locator));
		Actions actions = new Actions(driver);
		actions.sendKeys(element, keyName).perform();

	}

	public void rightClickToElement(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();

	}

	public void dragAndDropElement(WebDriver driver, String locatorDrag, String locatorDrop) {
		WebElement elementDrag = driver.findElement(By.xpath(locatorDrag));
		WebElement elementDrop = driver.findElement(By.xpath(locatorDrop));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(elementDrag, elementDrop).perform();

	}

	public void uploadFile(WebDriver driver, String locator, String fileName) {
		String proDir = System.getProperty("user.dir");
		String uploadFilePath = proDir + "\\fileUpload\\" + fileName;
		WebElement element = driver.findElement(By.xpath(locator));
		element.sendKeys(uploadFilePath);
	}

	public void uploadMultipleFile(WebDriver driver, String locator, String fileName) {
		String[] fileUploadName = fileName.split(",");
		String proDir = System.getProperty("user.dir");
		String uploadFilePath = "";
		for (int i = 0; i < fileUploadName.length; i++) {
			uploadFilePath = uploadFilePath + proDir + "\\fileUpload\\" + fileUploadName[i] + "\n";
		}
		WebElement element = driver.findElement(By.xpath(locator));
		element.sendKeys(uploadFilePath);
	}

	public Object openAnyUrlByJS(WebDriver driver, String url) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript("window.location= '" + url + "'");

	}

	public Object executeJSForWebBrowser(WebDriver driver, String javascript) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript(javascript);

	}

	public Object clickElementByJS(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript("arguments[0].click();", element);

	}
	public void changeDatetimeTypeToText(WebDriver driver, String locator, String ...values)
	{	locator = String.format(locator, (Object[]) values);
		WebElement element = driver.findElement(By.xpath(locator));
		 JavascriptExecutor js = (JavascriptExecutor)driver; 
		 js.executeScript("arguments[0].type = arguments[1]", element, "text"); 
	}
	

	public Object clickElementByJS(WebDriver driver, String locator, String... value) {
		locator = String.format(locator, (Object[]) value);
		WebElement element = driver.findElement(By.xpath(locator));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript("arguments[0].click();", element);

	}

	public Object scrollToBottomPage(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

	public Object highlightElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript("arguments[0].style.border='6px groove red'", element);
	}

	public void waitForControlVisible(WebDriver driver, String locator) {
		By byElement = By.xpath(locator);
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.visibilityOfElementLocated(byElement));
	}

	public void waitForControlVisible(WebDriver driver, String locator, String... value) {
		locator = String.format(locator, (Object[]) value);
		By byElement = By.xpath(locator);
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.visibilityOfElementLocated(byElement));
	}

	public void waitForControlInvisible(WebDriver driver, String locator) {
		By byElement = By.xpath(locator);
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(byElement));
	}

	public void waitForControlInvisible(WebDriver driver, String locator, String... value) {
		locator = String.format(locator, (Object[]) value);
		By byElement = By.xpath(locator);
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(byElement));
	}

	public void waitForControlPresence(WebDriver driver, String locator) {
		By byElement = By.xpath(locator);
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.presenceOfElementLocated(byElement));
	}

	public void waitForControlPresence(WebDriver driver, String locator, String value) {
		locator = String.format(locator, value);
		By byElement = By.xpath(locator);
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.presenceOfElementLocated(byElement));
	}

	public void waitForControlClickable(WebDriver driver, String locator) {
		By byElement = By.xpath(locator);
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.elementToBeClickable(byElement));
	}

	public void waitForControlClickable(WebDriver driver, String locator, String value) {
		locator = String.format(locator, value);
		By byElement = By.xpath(locator);
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.elementToBeClickable(byElement));
	}

	public void waitForAlertPresence(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public HomePageObject openHomePage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_PAGE_LINK, "Manager");
		clickToElement(driver, AbstractPageUI.DYNAMIC_PAGE_LINK, "Manager");
		if (driver.toString().toLowerCase().contains("internetexplorer")) {
			sleepWithDynamicTimeout(5);
		}
		return PageFactoryManager.openHomePage(driver);
	}

	public NewCustomerPageObject openNewCustomerPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_PAGE_LINK, "New Customer");
		clickToElement(driver, AbstractPageUI.DYNAMIC_PAGE_LINK, "New Customer");
		if (driver.toString().toLowerCase().contains("internetexplorer")) {
			sleepWithDynamicTimeout(5);
		}
		return PageFactoryManager.openNewCustomerPage(driver);
	}

	public WithdrawPageObject openWithdrawPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_PAGE_LINK, "Withdrawal");
		clickToElement(driver, AbstractPageUI.DYNAMIC_PAGE_LINK, "Withdrawal");
		if (driver.toString().toLowerCase().contains("internetexplorer")) {
			sleepWithDynamicTimeout(5);
		}
		return PageFactoryManager.openWithdrawnPage(driver);
	}

	public EditCustomerPageObject openEditCustomerPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_PAGE_LINK, "Edit Customer");
		clickToElement(driver, AbstractPageUI.DYNAMIC_PAGE_LINK, "Edit Customer");
		if (driver.toString().toLowerCase().contains("internetexplorer")) {
			sleepWithDynamicTimeout(5);
		}
		return PageFactoryManager.openEditCustomerPage(driver);
	}

	public DeleteAccountPageObject openDeleteAccountPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_PAGE_LINK, "Delete Account");
		clickToElement(driver, AbstractPageUI.DYNAMIC_PAGE_LINK, "Delete Account");
		if (driver.toString().toLowerCase().contains("internetexplorer")) {
			sleepWithDynamicTimeout(5);
		}
		return PageFactoryManager.openDeleteAccountPage(driver);
	}

	public void clickToDynamicLink(WebDriver driver, String pageName) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_PAGE_LINK, pageName);

		if (driver.toString().toLowerCase().contains("internetexplorer")) {
			// clickElementByJS(driver,AbstractPageUI.DYNAMIC_PAGE_LINK, pageName);
			driver.get(getAttributeValue(driver, AbstractPageUI.DYNAMIC_PAGE_LINK, "href", pageName));
			sleepWithDynamicTimeout(5);
		} else {
			clickToElement(driver, AbstractPageUI.DYNAMIC_PAGE_LINK, pageName);
		}

	}

	public void clickToDynamicButton(WebDriver driver, String pageName) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_PAGE_BUTTON_TEXTBOX, pageName);

		if (driver.toString().toLowerCase().contains("internetexplorer")) {
			clickElementByJS(driver, AbstractPageUI.DYNAMIC_PAGE_BUTTON_TEXTBOX, pageName);
			sleepWithDynamicTimeout(5);
		} else {
			clickToElement(driver, AbstractPageUI.DYNAMIC_PAGE_BUTTON_TEXTBOX, pageName);
		}

	}

	public void sendKeyToDynamicTextbox(WebDriver driver, String textBoxName, String value) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_PAGE_BUTTON_TEXTBOX, textBoxName);
		sendkeyToElement(driver, AbstractPageUI.DYNAMIC_PAGE_BUTTON_TEXTBOX, value, textBoxName);
	}
	public void sendKeyToDynamicDateTime(WebDriver driver, String textBoxName, String value) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_PAGE_BUTTON_TEXTBOX, textBoxName);
		if (driver.toString().toLowerCase().contains("firefox")) {
			changeDatetimeTypeToText(driver, AbstractPageUI.DYNAMIC_PAGE_BUTTON_TEXTBOX, textBoxName);
		}
		sendkeyToElement(driver, AbstractPageUI.DYNAMIC_PAGE_BUTTON_TEXTBOX, value, textBoxName);
	}
	

	public AbstractPage openDynamicPage(WebDriver driver, String pageName) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_PAGE_LINK, pageName);
		if (driver.toString().toLowerCase().contains("internetexplorer")) {
			clickElementByJS(driver, AbstractPageUI.DYNAMIC_PAGE_LINK, pageName);
			sleepWithDynamicTimeout(5);
		} else {
			clickToElement(driver, AbstractPageUI.DYNAMIC_PAGE_LINK, pageName);
		}
		switch (pageName) {
		case "Manager":
			return PageFactoryManager.openHomePage(driver);
		case "New Customer":
			return PageFactoryManager.openNewCustomerPage(driver);
		case "Edit Customer":
			return PageFactoryManager.openEditCustomerPage(driver);
		case "Withdrawal":
			return PageFactoryManager.openWithdrawnPage(driver);
		case "Delete Account":
			return PageFactoryManager.openDeleteAccountPage(driver);
		case "New Account":
			return PageFactoryManager.openNewAccountPage(driver);
		case "Edit Account":
			return PageFactoryManager.openEditAccountPage(driver);
		case "Deposit":
			return PageFactoryManager.openDepositPage(driver);
		case "Fund Transfer":
			return PageFactoryManager.openFundTransferPage(driver);
		case "Balance Enquiry":
			return PageFactoryManager.openBalanceEnquiryPage(driver);
		case "Delete Customer":
			return PageFactoryManager.openDeleteCustomerPage(driver);
		default:
			return PageFactoryManager.openHomePage(driver);
		}

	}
	public void submitCustomerInfor(WebDriver driver, String fieldAttrName, String customerInfor) {
		sendKeyToDynamicTextbox(driver, fieldAttrName, customerInfor);
		clickToDynamicButton(driver,AbstractPageUI.SUBMIT_BUTTON_NAME);
	}

	public void sleepWithDynamicTimeout(int timeOut) {
		try {
			Thread.sleep(timeOut * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String convertTime(String time) {
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		DateFormat outputformat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		String output = null;
		try {
			// Converting the input String to Date
			date = df.parse(time);
			// Changing the format of date and storing it in String
			output = outputformat.format(date);
			// Displaying the date

		} catch (ParseException pe) {
			pe.printStackTrace();
		}
		return output;
	}
}
