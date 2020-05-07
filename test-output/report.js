$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/yashbhargava/Downloads/Automation/E2EProject/src/test/java/Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login into Application",
  "description": "",
  "id": "login-into-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Positive test validating Login",
  "description": "",
  "id": "login-into-application;positive-test-validating-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Initialize Browser with Chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Navigate to \"http://qaclickacademy.com\" Site",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click on login link in home page to land on Secure Sign In page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user enters \u003cusername\u003e and \u003cpassword\u003e and log In",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Verify user is successfully logged In",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "login-into-application;positive-test-validating-login;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "login-into-application;positive-test-validating-login;;1"
    },
    {
      "cells": [
        "yash.yash.bhargava@gmail.com",
        "rajeneetu"
      ],
      "line": 13,
      "id": "login-into-application;positive-test-validating-login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Positive test validating Login",
  "description": "",
  "id": "login-into-application;positive-test-validating-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Initialize Browser with Chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Navigate to \"http://qaclickacademy.com\" Site",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click on login link in home page to land on Secure Sign In page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user enters yash.yash.bhargava@gmail.com and rajeneetu and log In",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Verify user is successfully logged In",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.initialize_Browser_with_Chrome()"
});
formatter.result({
  "duration": 2620935132,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://qaclickacademy.com",
      "offset": 13
    }
  ],
  "location": "stepDefination.navigate_to_Site(String)"
});
formatter.result({
  "duration": 1939430409,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.click_on_login_link_in_home_page_to_land_on_Secure_Sign_In_page()"
});
formatter.result({
  "duration": 5099203202,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "yash.yash.bhargava@gmail.com",
      "offset": 12
    },
    {
      "val": "rajeneetu",
      "offset": 45
    }
  ],
  "location": "stepDefination.user_enters_and_and_log_in(String,String)"
});
formatter.result({
  "duration": 9651498825,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.verify_user_is_successfully_logged_In()"
});
formatter.result({
  "duration": 109048548,
  "status": "passed"
});
});