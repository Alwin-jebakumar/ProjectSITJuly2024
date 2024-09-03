$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/magneto/feature/MagnetoBackground.feature");
formatter.feature({
  "line": 1,
  "name": "Check Functionalities IN Magneto Application",
  "description": "",
  "id": "check-functionalities-in-magneto-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2190600,
  "status": "passed"
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
  "name": "user Launch The Mangeto Application Url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Click SignIn Button It Will Go To The Login Page",
  "keyword": "Then "
});
formatter.match({
  "location": "MagnetoBackgroundStep.user_Launch_The_Mangeto_Application_Url()"
});
formatter.result({
  "duration": 4224628000,
  "status": "passed"
});
formatter.match({
  "location": "MagnetoBackgroundStep.user_Click_SignIn_Button_It_Will_Go_To_The_Login_Page()"
});
formatter.result({
  "duration": 1306724500,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "User Check Login Functionality With Valid Username And Password",
  "description": "",
  "id": "check-functionalities-in-magneto-application;user-check-login-functionality-with-valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "user Provide Valid Username And Password In Their Fields",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "click On The Login Button It Will Navigate To Home Page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user Validate It Successfully Login",
  "keyword": "Then "
});
formatter.match({
  "location": "MagnetoBackgroundStep.user_Provide_Valid_Username_And_Password_In_Their_Fields()"
});
formatter.result({
  "duration": 257979600,
  "status": "passed"
});
formatter.match({
  "location": "MagnetoBackgroundStep.click_On_The_Login_Button_It_Will_Navigate_To_Home_Page()"
});
formatter.result({
  "duration": 2119769200,
  "status": "passed"
});
formatter.match({
  "location": "MagnetoBackgroundStep.user_Validate_It_Successfully_Login()"
});
formatter.result({
  "duration": 2171385700,
  "status": "passed"
});
formatter.after({
  "duration": 139493400,
  "status": "passed"
});
formatter.before({
  "duration": 202800,
  "status": "passed"
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
  "name": "user Launch The Mangeto Application Url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Click SignIn Button It Will Go To The Login Page",
  "keyword": "Then "
});
formatter.match({
  "location": "MagnetoBackgroundStep.user_Launch_The_Mangeto_Application_Url()"
});
formatter.result({
  "duration": 920066100,
  "status": "passed"
});
formatter.match({
  "location": "MagnetoBackgroundStep.user_Click_SignIn_Button_It_Will_Go_To_The_Login_Page()"
});
formatter.result({
  "duration": 1056257000,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User Check Login Functionality With Invalid Username And Password",
  "description": "",
  "id": "check-functionalities-in-magneto-application;user-check-login-functionality-with-invalid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "user Provide Invalid Username And InvalidPassword In Their Fields",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "click On The Login Button It Will Show The Error Alert",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user Validate Alert Shown",
  "keyword": "Then "
});
formatter.match({
  "location": "MagnetoBackgroundStep.user_Provide_Invalid_Username_And_InvalidPassword_In_Their_Fields()"
});
formatter.result({
  "duration": 205541400,
  "status": "passed"
});
formatter.match({
  "location": "MagnetoBackgroundStep.click_On_The_Login_Button_It_Will_Show_The_Error_Alert()"
});
formatter.result({
  "duration": 1544258100,
  "status": "passed"
});
formatter.match({
  "location": "MagnetoBackgroundStep.user_Validate_Alert_Shown()"
});
formatter.result({
  "duration": 37192600,
  "status": "passed"
});
formatter.after({
  "duration": 122547200,
  "status": "passed"
});
});