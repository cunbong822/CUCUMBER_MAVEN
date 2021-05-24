$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("account_03_dynamic_page_object.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Register",
  "description": "",
  "id": "register",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@account"
    }
  ]
});
formatter.scenario({
  "line": 22,
  "name": "Login to system",
  "description": "",
  "id": "register;login-to-system",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@register"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "I get login page url",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "I click here link",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I input to email textbox with data \"autorandom\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click to submit button at register page",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I get the userId infor",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "I get the password infor",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I open login page again",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefination.iGetTheLoginPageUrl()"
});
formatter.result({
  "duration": 5875074900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.iClickHereLink()"
});
formatter.result({
  "duration": 2025306900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "autorandom",
      "offset": 36
    }
  ],
  "location": "RegisterStepDefination.iInputToEmailTextboxWithData(String)"
});
formatter.result({
  "duration": 139185900,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefination.iClickToSubmitButtonAtRegisterPage()"
});
formatter.result({
  "duration": 780149900,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefination.iGetTheUserIdInfor()"
});
formatter.result({
  "duration": 63614200,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefination.iGetThePasswordInfor()"
});
formatter.result({
  "duration": 51384600,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefination.iOpenLoginPageAgain()"
});
formatter.result({
  "duration": 1192118000,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Login to system",
  "description": "",
  "id": "register;login-to-system",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "I input username textbox",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "I input password textbox",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Click to login button",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Verify homepage displayed with message \"Welcome To Manager\u0027s Page of Guru99 Bank\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.iInputUsername()"
});
formatter.result({
  "duration": 145822500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.iInputPassword()"
});
formatter.result({
  "duration": 139970500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.clickToLoginButton()"
});
formatter.result({
  "duration": 1491994600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome To Manager\u0027s Page of Guru99 Bank",
      "offset": 40
    }
  ],
  "location": "HomePageStepDefination.verifyHomepageDisplayed(String)"
});
formatter.result({
  "duration": 37340700,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 38,
  "name": "Create new Customer",
  "description": "",
  "id": "register;create-new-customer",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 37,
      "name": "@new_customer"
    }
  ]
});
formatter.step({
  "line": 39,
  "name": "I open \"New Customer\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 40,
  "name": "I input to \"name\" textbox with data \"\u003cName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "I select \"\u003cGender\u003e\" radio button",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I input to \"dob\" textbox with data \"\u003cDateOfBirth\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I input to \"addr\" textbox with data \"\u003cAddress\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I input to \"city\" textbox with data \"\u003cCity\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I input to \"state\" textbox with data \"\u003cState\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "I input to \"pinno\" textbox with data \"\u003cPin\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "I input to \"telephoneno\" textbox with data \"\u003cPhone\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "I input to \"emailid\" textbox with \"2\" data \"\u003cEmail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "I input to \"password\" textbox with data \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "I click to \"Submit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "Verify message \"Customer Registered Successfully!!!\" display",
  "keyword": "Then "
});
formatter.step({
  "line": 52,
  "name": "I verify all above information created successfully",
  "rows": [
    {
      "cells": [
        "Name",
        "Gender",
        "DateOfBirth",
        "Address",
        "City",
        "State",
        "Pin",
        "Phone",
        "Email"
      ],
      "line": 53
    },
    {
      "cells": [
        "\u003cName\u003e",
        "male",
        "\u003cDateOfBirth\u003e",
        "\u003cAddress\u003e",
        "\u003cCity\u003e",
        "\u003cState\u003e",
        "\u003cPin\u003e",
        "\u003cPhone\u003e",
        "\u003cEmail\u003e"
      ],
      "line": 54
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "I get CustomerID at New Customer page",
  "keyword": "When "
});
formatter.examples({
  "line": 57,
  "name": "data table for new customer",
  "description": "",
  "id": "register;create-new-customer;data-table-for-new-customer",
  "rows": [
    {
      "cells": [
        "Name",
        "Gender",
        "DateOfBirth",
        "Address",
        "City",
        "State",
        "Pin",
        "Phone",
        "Email",
        "Password"
      ],
      "line": 58,
      "id": "register;create-new-customer;data-table-for-new-customer;1"
    },
    {
      "cells": [
        "Auto test",
        "m",
        "07/22/1992",
        "123 TranCung",
        "Hanoi",
        "Tu Liem",
        "123456",
        "0987654321",
        "bluenemo92",
        "123123"
      ],
      "line": 59,
      "id": "register;create-new-customer;data-table-for-new-customer;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 59,
  "name": "Create new Customer",
  "description": "",
  "id": "register;create-new-customer;data-table-for-new-customer;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@account"
    },
    {
      "line": 37,
      "name": "@new_customer"
    }
  ]
});
formatter.step({
  "line": 39,
  "name": "I open \"New Customer\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 40,
  "name": "I input to \"name\" textbox with data \"Auto test\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "I select \"m\" radio button",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I input to \"dob\" textbox with data \"07/22/1992\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I input to \"addr\" textbox with data \"123 TranCung\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I input to \"city\" textbox with data \"Hanoi\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I input to \"state\" textbox with data \"Tu Liem\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "I input to \"pinno\" textbox with data \"123456\"",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "I input to \"telephoneno\" textbox with data \"0987654321\"",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "I input to \"emailid\" textbox with \"2\" data \"bluenemo92\"",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "I input to \"password\" textbox with data \"123123\"",
  "matchedColumns": [
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "I click to \"Submit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "Verify message \"Customer Registered Successfully!!!\" display",
  "keyword": "Then "
});
formatter.step({
  "line": 52,
  "name": "I verify all above information created successfully",
  "matchedColumns": [
    0,
    2,
    3,
    4,
    5,
    6,
    7,
    8
  ],
  "rows": [
    {
      "cells": [
        "Name",
        "Gender",
        "DateOfBirth",
        "Address",
        "City",
        "State",
        "Pin",
        "Phone",
        "Email"
      ],
      "line": 53
    },
    {
      "cells": [
        "Auto test",
        "male",
        "07/22/1992",
        "123 TranCung",
        "Hanoi",
        "Tu Liem",
        "123456",
        "0987654321",
        "bluenemo92"
      ],
      "line": 54
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "I get CustomerID at New Customer page",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "New Customer",
      "offset": 8
    }
  ],
  "location": "AbstractStepsDefination.iOpenDynamicPageLink(String)"
});
formatter.result({
  "duration": 437370800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "name",
      "offset": 12
    },
    {
      "val": "Auto test",
      "offset": 37
    }
  ],
  "location": "AbstractStepsDefination.iInputToDynamicTextboxWithDynamicData(String,String)"
});
formatter.result({
  "duration": 184815200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "m",
      "offset": 10
    }
  ],
  "location": "AbstractStepsDefination.iSelectRadioButtonWithData(String)"
});
formatter.result({
  "duration": 114283800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dob",
      "offset": 12
    },
    {
      "val": "07/22/1992",
      "offset": 36
    }
  ],
  "location": "AbstractStepsDefination.iInputToDynamicTextboxWithDynamicData(String,String)"
});
formatter.result({
  "duration": 118347300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "addr",
      "offset": 12
    },
    {
      "val": "123 TranCung",
      "offset": 37
    }
  ],
  "location": "AbstractStepsDefination.iInputToDynamicTextboxWithDynamicData(String,String)"
});
formatter.result({
  "duration": 157603800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "city",
      "offset": 12
    },
    {
      "val": "Hanoi",
      "offset": 37
    }
  ],
  "location": "AbstractStepsDefination.iInputToDynamicTextboxWithDynamicData(String,String)"
});
formatter.result({
  "duration": 117487800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "state",
      "offset": 12
    },
    {
      "val": "Tu Liem",
      "offset": 38
    }
  ],
  "location": "AbstractStepsDefination.iInputToDynamicTextboxWithDynamicData(String,String)"
});
formatter.result({
  "duration": 111964200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pinno",
      "offset": 12
    },
    {
      "val": "123456",
      "offset": 38
    }
  ],
  "location": "AbstractStepsDefination.iInputToDynamicTextboxWithDynamicData(String,String)"
});
formatter.result({
  "duration": 110858200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "telephoneno",
      "offset": 12
    },
    {
      "val": "0987654321",
      "offset": 44
    }
  ],
  "location": "AbstractStepsDefination.iInputToDynamicTextboxWithDynamicData(String,String)"
});
formatter.result({
  "duration": 108779800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "emailid",
      "offset": 12
    },
    {
      "val": "2",
      "offset": 35
    },
    {
      "val": "bluenemo92",
      "offset": 44
    }
  ],
  "location": "AbstractStepsDefination.iInputToDynamicTextboxWithDynamicChooseRandomData(String,String,String)"
});
formatter.result({
  "duration": 139869900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 12
    },
    {
      "val": "123123",
      "offset": 41
    }
  ],
  "location": "AbstractStepsDefination.iInputToDynamicTextboxWithDynamicData(String,String)"
});
formatter.result({
  "duration": 108872500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Submit",
      "offset": 12
    }
  ],
  "location": "AbstractStepsDefination.iClickToDynamicButton(String)"
});
formatter.result({
  "duration": 431198900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Customer Registered Successfully!!!",
      "offset": 16
    }
  ],
  "location": "AbstractStepsDefination.verifyDynamicMessageDisplay(String)"
});
formatter.result({
  "duration": 22282400,
  "error_message": "org.openqa.selenium.UnhandledAlertException: unexpected alert open: {Alert text : Customer could not be added !!}\n  (Session info: chrome\u003d90.0.4430.212): Customer could not be added !!\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027CPP00138069B\u0027, ip: \u002710.141.9.6\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.10\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 90.0.4430.212, chrome: {chromedriverVersion: 90.0.4430.24 (4c6d850f087da..., userDataDir: C:\\Users\\tunc1\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:50329}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 5983bf34aa5a7bf46236d59a702a1b28\n*** Element info: {Using\u003dxpath, value\u003d//p[@class\u003d\u0027heading3\u0027 and text()\u003d\u0027Customer Registered Successfully!!!\u0027]}\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:120)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat commons.AbstractPage.isControlDisplay(AbstractPage.java:220)\r\n\tat pageObject.AbstractPageObject.isDynamicMessageDisplay(AbstractPageObject.java:32)\r\n\tat stepDefinations.AbstractStepsDefination.verifyDynamicMessageDisplay(AbstractStepsDefination.java:68)\r\n\tat ✽.Then Verify message \"Customer Registered Successfully!!!\" display(account_03_dynamic_page_object.feature:51)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginSteps.iVerifyAllAboveInformationCreatedSuccessfully(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.iGetCustomerIDAtNewCustomerPage()"
});
formatter.result({
  "status": "skipped"
});
});