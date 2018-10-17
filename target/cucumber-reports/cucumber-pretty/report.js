$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Execute Automation test",
  "description": "",
  "id": "execute-automation-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 255627100,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Test Execute automation login",
  "description": "",
  "id": "execute-automation-test;test-execute-automation-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User is on execute automation login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User login to application with username \"Admin\" and password \"Admin\"",
  "keyword": "When "
});
formatter.match({
  "location": "ExecuteAutomationSteps.user_is_on_execute_automation_login_page()"
});
formatter.result({
  "duration": 10778250200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 41
    },
    {
      "val": "Admin",
      "offset": 62
    }
  ],
  "location": "ExecuteAutomationSteps.user_login_to_application_with_username_something_and_password_something(String,String)"
});
formatter.result({
  "duration": 2324858800,
  "status": "passed"
});
formatter.after({
  "duration": 52600,
  "status": "passed"
});
});