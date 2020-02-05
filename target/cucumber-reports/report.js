$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Cucumber/DatabaseConnection.feature");
formatter.feature({
  "name": "Database Connection",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "I am connecting with database",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test1"
    }
  ]
});
formatter.step({
  "name": "I am connect with MySql",
  "keyword": "Given "
});
formatter.match({
  "location": "DatabaseConnection.i_am_connect_with_MySql()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check data with database",
  "keyword": "When "
});
formatter.match({
  "location": "DatabaseConnection.i_check_data_with_database()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Cucumber/homePage.feature");
formatter.feature({
  "name": "Google",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "I am in Google",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I am in google home page and click search",
  "keyword": "Given "
});
formatter.match({
  "location": "CucumberSteps.i_am_in_google_home_page_and_click_search()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "I am searching",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I write \"fountain pen\" click search and landing on specific search result",
  "keyword": "When "
});
formatter.match({
  "location": "CucumberSteps.i_write_search_option_and_click_search(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "From the search result I select a result",
  "keyword": "And "
});
formatter.match({
  "location": "CucumberSteps.from_the_search_result_I_select_a_result()"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003ch3 class\u003d\"LC20lb\"\u003e...\u003c/h3\u003e is not clickable at point (274, 14). Other element would receive the click: \u003cinput class\u003d\"gLFyf gsfi\" maxlength\u003d\"2048\" name\u003d\"q\" type\u003d\"text\" jsaction\u003d\"paste:puy29d\" aria-autocomplete\u003d\"both\" aria-haspopup\u003d\"false\" autocapitalize\u003d\"off\" autocomplete\u003d\"off\" autocorrect\u003d\"off\" role\u003d\"combobox\" spellcheck\u003d\"false\" title\u003d\"Search\" value\u003d\"fountain pen\" aria-label\u003d\"Search\" data-ved\u003d\"0ahUKEwiniYHKx7vnAhWMY98KHRvsBI8Q39UDCAk\"\u003e\n  (Session info: chrome\u003d79.0.3945.130)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-JQ0LRFT\u0027, ip: \u002710.11.12.230\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 79.0.3945.130, chrome: {chromedriverVersion: 78.0.3904.105 (60e2d8774a81..., userDataDir: C:\\Users\\Arif\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:50786}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: d58f6823f0fbf95843924c25932c86b5\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat googleAutomationPages.MasterPage.click(MasterPage.java:28)\r\n\tat googleAutomationPages.GooglePage.selectSearchItem(GooglePage.java:40)\r\n\tat cucumberStepsDefination.CucumberSteps.from_the_search_result_I_select_a_result(CucumberSteps.java:32)\r\n\tat ✽.From the search result I select a result(file:Cucumber/homePage.feature:9)\r\n",
  "status": "failed"
});
formatter.background({
  "name": "I am in Google",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I am in google home page and click search",
  "keyword": "Given "
});
formatter.match({
  "location": "CucumberSteps.i_am_in_google_home_page_and_click_search()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "I am validate homepage",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I see \"About\" in the top",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberSteps.i_see_in_the_top(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[text()\u003d\u0027About\u0027]\"}\n  (Session info: chrome\u003d79.0.3945.130)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-JQ0LRFT\u0027, ip: \u002710.11.12.230\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 79.0.3945.130, chrome: {chromedriverVersion: 78.0.3904.105 (60e2d8774a81..., userDataDir: C:\\Users\\Arif\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:50786}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: d58f6823f0fbf95843924c25932c86b5\n*** Element info: {Using\u003dxpath, value\u003d//a[text()\u003d\u0027About\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat googleAutomationPages.MasterPage.getTxt(MasterPage.java:49)\r\n\tat googleAutomationPages.GooglePage.getTextAbout(GooglePage.java:49)\r\n\tat cucumberStepsDefination.CucumberSteps.i_see_in_the_top(CucumberSteps.java:42)\r\n\tat ✽.I see \"About\" in the top(file:Cucumber/homePage.feature:12)\r\n",
  "status": "failed"
});
});