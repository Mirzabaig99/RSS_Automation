$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "To test + the login Functionality",
  "description": "",
  "id": "to-test-+-the-login-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 10,
  "name": "user tries to login with valid credentials",
  "description": "",
  "id": "to-test-+-the-login-functionality;user-tries-to-login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@Login_For_Employee"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user is on Lopginpage",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user enters \"\u003cusermane\u003e\" in EmployeeID textbox",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user enters \"\u003cPassword\u003e\" in password textbox",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user cliks on LoginButton",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user should navigate to homePage",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "to-test-+-the-login-functionality;user-tries-to-login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "usermane",
        "Password"
      ],
      "line": 18,
      "id": "to-test-+-the-login-functionality;user-tries-to-login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "A2334",
        "123456789"
      ],
      "line": 19,
      "id": "to-test-+-the-login-functionality;user-tries-to-login-with-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 4,
  "name": "Steps for pre-requisite",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User opens the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User launches the URL",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User in on \"Resource Scheduling Application\" URL",
  "keyword": "Then "
});
formatter.match({
  "location": "Browser_launch_Sd.user_opens_the_browser()"
});
formatter.result({
  "duration": 7132928600,
  "status": "passed"
});
formatter.match({
  "location": "Browser_launch_Sd.user_launches_the_URL()"
});
formatter.result({
  "duration": 11225692400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Resource Scheduling Application",
      "offset": 12
    }
  ],
  "location": "Login_Sd.user_in_on_URL(String)"
});
formatter.result({
  "duration": 10290380900,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "user tries to login with valid credentials",
  "description": "",
  "id": "to-test-+-the-login-functionality;user-tries-to-login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@Login_For_Employee"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user is on Lopginpage",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user enters \"A2334\" in EmployeeID textbox",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user enters \"123456789\" in password textbox",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user cliks on LoginButton",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user should navigate to homePage",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_Sd.user_is_on_Lopginpage()"
});
formatter.result({
  "duration": 16500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "A2334",
      "offset": 13
    }
  ],
  "location": "Login_Sd.user_enters_in_EmployeeID_textbox(String)"
});
formatter.result({
  "duration": 269581600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456789",
      "offset": 13
    }
  ],
  "location": "Login_Sd.user_enters_in_password_textbox(String)"
});
formatter.result({
  "duration": 274525400,
  "status": "passed"
});
formatter.match({
  "location": "Login_Sd.user_cliks_on_LoginButton()"
});
formatter.result({
  "duration": 393700,
  "error_message": "java.util.MissingResourceException: Can\u0027t find resource for bundle java.util.PropertyResourceBundle, key oginBtn_Xpath\r\n\tat java.util.ResourceBundle.getObject(ResourceBundle.java:450)\r\n\tat java.util.ResourceBundle.getString(ResourceBundle.java:407)\r\n\tat pom.Login_POM.Click_Login(Login_POM.java:32)\r\n\tat step_Defination.Login_Sd.user_cliks_on_LoginButton(Login_Sd.java:49)\r\n\tat ✽.And user cliks on LoginButton(Login.feature:14)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Login_Sd.user_should_navigate_to_homePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 217411300,
  "status": "passed"
});
});