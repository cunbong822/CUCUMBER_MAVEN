package commons;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.HomePageObject;
import pageObject.LoginPageObject;
import pageObject.PageFactoryManager;
import pageUi.HomePageUI;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;



public class AbstracTest {
	WebDriver driver;
	private LoginPageObject loginPage;
	private HomePageObject homePage;
	
	
	protected final Log log;
	public AbstracTest() {
		log = LogFactory.getLog(getClass());
	}
	

	private boolean checkPassed(boolean condition) {
		boolean pass = true;
		try {
			Assert.assertTrue(condition);
		} catch (Throwable e) {
			pass = false;
			Reporter.getCurrentTestResult().setThrowable(e);
		}
		return pass;
	}
	protected HomePageObject loginToSystem(WebDriver driver, String userName, String password) {
		loginPage = PageFactoryManager.openLoginPage(driver);
		log.info("Login: Step 1: Enter userId and Password");
		loginPage.sendKeyToDynamicTextbox(driver, HomePageUI.textboxUserIdName, userName);
		loginPage.sendKeyToDynamicTextbox(driver, HomePageUI.textboxPasswordName, password);
		log.info("Login: Step 2: Click Login");
		loginPage.clickToDynamicButton(driver, HomePageUI.buttonLoginName);
		homePage = new HomePageObject(driver);
		return homePage;
	}
	
	
	

	public boolean verifyTrue(boolean condition) {
		return checkPassed(condition);
	}

	private boolean checkFailed(boolean condition) {
		boolean pass = true;
		try {
			Assert.assertFalse(condition);
		} catch (Throwable e) {
			pass = false;
			Reporter.getCurrentTestResult().setThrowable(e);
		}
		return pass;
	}

	public boolean verifyFalse(boolean condition) {
		return checkFailed(condition);
	}

	private boolean checkEquals(Object actual, Object expected) {
		boolean pass = true;
		try {
			Assert.assertEquals(actual, expected);
		} catch (Throwable e) {
			pass = false;
			Reporter.getCurrentTestResult().setThrowable(e);
		}
		return pass;
	}

	public void verifyEquals(Object actual, Object expected) {
		Assert.assertTrue(checkEquals(actual, expected));
	}

	public int randomNumber() {
		Random rand = new Random();
		int number = rand.nextInt(999999) + 1;
		return number;
	}

	protected void closeBrowser(WebDriver driver) {
		try {
			String osName = System.getProperty("os.name").toLowerCase();
			String cmd = "";
			driver.manage().deleteAllCookies();
			driver.quit();
			if (driver.toString().toLowerCase().contains("chrome")) {
				if (osName.toLowerCase().contains("mac")) {
					cmd = "pkill chromedriver";
				} else {
					cmd = "taskkill /F /FI \"IMAGENAME eq chromedriver*\"";
				}
				Process process = Runtime.getRuntime().exec(cmd);
				process.waitFor();
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
