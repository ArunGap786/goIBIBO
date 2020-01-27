$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Java/goIBIBO/src/main/java/features/SampleLogin.Feature");
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
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefintions.verify_whether_the_active_Tab_is_Flights()"
});
formatter.result({
  "status": "skipped"
});
});