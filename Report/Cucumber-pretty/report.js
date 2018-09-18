$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Feature files/Login.feature");
formatter.feature({
  "line": 2,
  "name": "To test + the login Functionality",
  "description": "",
  "id": "to-test-+-the-login-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Positive_Test"
    }
  ]
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
  "duration": 5313650100,
  "status": "passed"
});
formatter.match({
  "location": "Browser_launch_Sd.user_launches_the_URL()"
});
formatter.result({
  "duration": 11545703800,
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
  "duration": 9784755400,
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
      "line": 1,
      "name": "@Positive_Test"
    },
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
  "duration": 18000,
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
  "duration": 728377900,
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
  "duration": 338635700,
  "status": "passed"
});
formatter.match({
  "location": "Login_Sd.user_cliks_on_LoginButton()"
});
formatter.result({
  "duration": 784819400,
  "status": "passed"
});
formatter.match({
  "location": "Login_Sd.user_should_navigate_to_homePage()"
});
formatter.result({
  "duration": 2490012800,
  "status": "passed"
});
});