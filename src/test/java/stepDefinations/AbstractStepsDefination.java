package stepDefinations;

import org.openqa.selenium.WebDriver;

import commons.AbstracTest;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObject.AbstractPageObject;
import pageObject.PageFactoryManager;

public class AbstractStepsDefination {
	WebDriver driver;
	private AbstractPageObject abstracPage;
	private AbstracTest abstractTest;

	public AbstractStepsDefination() {
		driver = Hooks.openBrowser();
		abstracPage = PageFactoryManager.openAbstractPageObject(driver);
		abstractTest = new AbstracTest();
	}

	@When("^I input to \"([^\"]*)\" textbox with data \"([^\"]*)\"$")
	public void iInputToDynamicTextboxWithDynamicData(String textboxName, String value) {
		abstracPage.inputToDynamicTextboxTextArea(textboxName, value);
	}

	@When("^I input to \"([^\"]*)\" textbox with \"([^\"]*)\" data \"([^\"]*)\"$")
	public void iInputToDynamicTextboxWithDynamicChooseRandomData(String textboxName, String statusRandom, String value) {
		if (statusRandom.equals("1")) {
			value = value + " " + abstractTest.randomNumber();
		} else if (statusRandom.equals("2")) {
			value = value + " " + abstractTest.randomNumber() + "@gmail.com";
		}
		
		abstracPage.inputToDynamicTextboxTextArea(textboxName, value);
	}

	@When("^I input to \"([^\"]*)\" textbox with random data \"([^\"]*)\"$")
	public void iInputToDynamicTextboxWithDynamicRandomData(String textboxName, String value) {
		value = value + " " + abstractTest.randomNumber();
		abstracPage.inputToDynamicTextboxTextArea(textboxName, value);
	}
	@When("^I input to \"([^\"]*)\" textarea with data \"([^\"]*)\"$")
	public void iInputToDynamicTextareaWithDynamicData(String textAreaName, String value) {
		abstracPage.inputToDynamicTextboxTextArea(textAreaName, value);
	}
	@When("^I input to \"([^\"]*)\" textarea with \"([^\"]*)\" data \"([^\"]*)\"$")
	public void iInputToDynamicTextareaWithDynamicChooseRandomData(String textareaName,String statusRandom, String value) {
		if (statusRandom.equals("1")) {
			value = value + " " + abstractTest.randomNumber();
		}
		abstracPage.inputToDynamicTextboxTextArea(textareaName, value);
	}
	@When("^I select \"([^\"]*)\" radio button$")
	public void iSelectRadioButtonWithData(String textboxName) {
		abstracPage.clickToDynamicButtonAndRadio(textboxName);
	}
	@When("^I select \"([^\"]*)\" dropdown with data \"([^\"]*)\"$")
	public void iSelectToDynamicDropdownWithDynamicData(String textboxName, String value) {
		abstracPage.selectDynamicDropDownList(textboxName, value);
	}
	@When("^I click to \"([^\"]*)\" button$")
	public void iClickToDynamicButton(String btnName) {
		abstracPage.clickToDynamicButtonAndRadio(btnName);
	}
	@When("^Verify message \"([^\"]*)\" display$")
	public void verifyDynamicMessageDisplay(String message) {
		abstractTest.verifyTrue(abstracPage.isDynamicMessageDisplay(message));
	}
	@When("^I open \"([^\"]*)\" page$")
	public void iOpenDynamicPageLink(String pageName) {
		abstracPage.openDynamicPageLink(pageName);
	}
	@When("^I sleep with \"([^\"]*)\" second$")
	public void iSleepWithDynamicSeconds(String seconds) throws Throwable {
		abstracPage.sleepforDynamicTime(seconds);
	}
	
	@When("^I input (first|second) Account ID$")
	public void iInputToAccountID(String account){  
		if (account.equals("first")) {
			//
		} else if  (account.equals("second")) {
			
		}
	}
	@When("^I (?:transfer|withdraw) to \"(.*?)\" USD$")
	public void iTransferOrWithdrawtoDynamicAmount(String account){  
		if (account.equals("first")) {
			//
		} else if  (account.equals("second")) {
			
		}
	}
}
