$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FacebookStatus.feature");
formatter.feature({
  "line": 1,
  "name": "User login to the Facebook and post the Status Successfully",
  "description": "",
  "id": "user-login-to-the-facebook-and-post-the-status-successfully",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "To verify User login to the Facebook and post the Status Successfully",
  "description": "",
  "id": "user-login-to-the-facebook-and-post-the-status-successfully;to-verify-user-login-to-the-facebook-and-post-the-status-successfully",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "Tescase\"\u003cTCNum\u003e\" number and Testcase Description \"\u003cTCDesc\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user enter login_id \"\u003cLogin\u003e\" and password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "click create new post and enter the post status as \"\u003cPostcomments\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "click the post button \"\u003cTCNum\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "user-login-to-the-facebook-and-post-the-status-successfully;to-verify-user-login-to-the-facebook-and-post-the-status-successfully;",
  "rows": [
    {
      "cells": [
        "TCNum",
        "TCDesc",
        "Login",
        "password",
        "Postcomments"
      ],
      "line": 16,
      "id": "user-login-to-the-facebook-and-post-the-status-successfully;to-verify-user-login-to-the-facebook-and-post-the-status-successfully;;1"
    },
    {
      "cells": [
        "TC_01",
        "To verify User login to the Facebook and post the Status Successfully",
        "digiumdsmb@gmail.com",
        "Intel123*",
        "Hello World!"
      ],
      "line": 17,
      "id": "user-login-to-the-facebook-and-post-the-status-successfully;to-verify-user-login-to-the-facebook-and-post-the-status-successfully;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I open https://www.facebook.com",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I validate title and URL",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.i_open_https_www_facebook_com()"
});
formatter.result({
  "duration": 18252899700,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.i_validate_title_and_URL()"
});
formatter.result({
  "duration": 5032155000,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "To verify User login to the Facebook and post the Status Successfully",
  "description": "",
  "id": "user-login-to-the-facebook-and-post-the-status-successfully;to-verify-user-login-to-the-facebook-and-post-the-status-successfully;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "Tescase\"TC_01\" number and Testcase Description \"To verify User login to the Facebook and post the Status Successfully\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user enter login_id \"digiumdsmb@gmail.com\" and password \"Intel123*\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "click create new post and enter the post status as \"Hello World!\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "click the post button \"TC_01\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "TC_01",
      "offset": 8
    },
    {
      "val": "To verify User login to the Facebook and post the Status Successfully",
      "offset": 48
    }
  ],
  "location": "stepDefination.tescase_number_and_Testcase_Description(String,String)"
});
formatter.result({
  "duration": 9922500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "digiumdsmb@gmail.com",
      "offset": 21
    },
    {
      "val": "Intel123*",
      "offset": 57
    }
  ],
  "location": "stepDefination.user_enter_login_id_and_password(String,String)"
});
formatter.result({
  "duration": 5850645000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello World!",
      "offset": 52
    }
  ],
  "location": "stepDefination.click_create_new_post_and_enter_the_post_staus_as(String)"
});
formatter.result({
  "duration": 18588940200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TC_01",
      "offset": 23
    }
  ],
  "location": "stepDefination.clickThePostButton(String)"
});
formatter.result({
  "duration": 26070201400,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.close_the_browser()"
});
formatter.result({
  "duration": 1198388800,
  "status": "passed"
});
});