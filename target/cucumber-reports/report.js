$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/cyberterkTraining_features/teacherDetailsE2E.feature");
formatter.feature({
  "name": "Teacher details End to End for UI vs API",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "UI vs API cross data validation with name",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@E2ENameValidation"
    }
  ]
});
formatter.step({
  "name": "user gets teacher at \"\u003cresource\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "user goes to cybertek training application",
  "keyword": "And "
});
formatter.step({
  "name": "user searches for teachers with name \"\u003cteacherName\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user cross validates teachers name result on API and on UI with \"\u003cteacherName\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "resource",
        "teacherName"
      ]
    },
    {
      "cells": [
        "/teacher/name/Rahul",
        "Rahul"
      ]
    }
  ]
});
formatter.scenario({
  "name": "UI vs API cross data validation with name",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@E2ENameValidation"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user gets teacher at \"/teacher/name/Rahul\"",
  "keyword": "Given "
});
formatter.match({
  "location": "TeacherDeletingService_stepDefs.user_gets_teacher_at(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user goes to cybertek training application",
  "keyword": "And "
});
formatter.match({
  "location": "TeacherDetailsE2E_stepDefs.user_goes_to_cybertek_training_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user searches for teachers with name \"Rahul\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TeacherDetailsE2E_stepDefs.user_searches_for_teachers_with_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user cross validates teachers name result on API and on UI with \"Rahul\"",
  "keyword": "And "
});
formatter.match({
  "location": "TeacherDetailsE2E_stepDefs.user_cross_validates_teachers_name_result_on_API_and_on_UI_with(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});