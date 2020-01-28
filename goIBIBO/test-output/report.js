$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/358978/git/goIBIBO/goIBIBO/src/main/java/features/SampleLogin.Feature");
formatter.feature({
  "line": 1,
  "name": "GoIBIBO Application",
  "description": "",
  "id": "goibibo-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify Active Tab",
  "description": "",
  "id": "goibibo-application;verify-active-tab",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Log into the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Verify whether the active Tab is Flights",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefintions.log_into_the_application()"
});
formatter.result({
  "duration": 18620921997,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefintions.verify_whether_the_active_Tab_is_Flights()"
});
formatter.result({
  "duration": 53158609,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat stepDefintions.LoginStepDefintions.verify_whether_the_active_Tab_is_Flights(LoginStepDefintions.java:33)\r\n\tat ✽.Then Verify whether the active Tab is Flights(C:/Users/358978/git/goIBIBO/goIBIBO/src/main/java/features/SampleLogin.Feature:6)\r\n",
  "status": "failed"
});
});