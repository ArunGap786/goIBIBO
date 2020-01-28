$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/358978/git/goIBIBO/goIBIBO/src/main/java/features/SampleLogin.Feature");
formatter.feature({
  "line": 1,
  "name": "GoIBIBO Application",
  "description": "",
  "id": "goibibo-application",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#Scenario: Verify the Active Tab is flights"
    },
    {
      "line": 4,
      "value": "#"
    },
    {
      "line": 5,
      "value": "#Given User logs into the application"
    },
    {
      "line": 6,
      "value": "#Then Verify whether the active Tab is \"Flights\""
    },
    {
      "line": 7,
      "value": "#And close the browser"
    },
    {
      "line": 8,
      "value": "#"
    }
  ],
  "line": 10,
  "name": "Navigate to all other tabs and verify whether the same is highlighted",
  "description": "",
  "id": "goibibo-application;navigate-to-all-other-tabs-and-verify-whether-the-same-is-highlighted",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "User logs into the application",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user selects the \"Flights\" link",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "verfiy whether the active tab is \"Flights\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefintions.user_logs_into_the_application()"
});
formatter.result({
  "duration": 15235854171,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Flights",
      "offset": 18
    }
  ],
  "location": "LoginStepDefintions.user_selects_the_link(String)"
});
formatter.result({
  "duration": 2073597,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Flights",
      "offset": 34
    }
  ],
  "location": "LoginStepDefintions.verify_the_active_tab(String)"
});
formatter.result({
  "duration": 295252,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.getAttribute(Unknown Source)\r\n\tat com.qa.pages.HomePage.isActive(HomePage.java:101)\r\n\tat stepDefintions.LoginStepDefintions.verify_the_active_tab(LoginStepDefintions.java:44)\r\n\tat ✽.Then verfiy whether the active tab is \"Flights\"(C:/Users/358978/git/goIBIBO/goIBIBO/src/main/java/features/SampleLogin.Feature:14)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepDefintions.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});