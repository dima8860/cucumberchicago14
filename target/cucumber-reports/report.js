$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/cyberterkTraining_features/studentsListByBatchAPI.feature");
formatter.feature({
  "name": "Student List API",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Getting list of students by batch number",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@batchID"
    }
  ]
});
formatter.step({
  "name": "user gets students list with \"\u003cresource\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "user validates data from response by batch number \"\u003cbatchID\u003e\"",
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
        "batchID"
      ]
    },
    {
      "cells": [
        "/student/batch/14",
        "14"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Getting list of students by batch number",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@batchID"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user gets students list with \"/student/batch/14\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StudentsListAPI.user_gets_students_list_with(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates data from response by batch number \"14\"",
  "keyword": "And "
});
formatter.match({
  "location": "StudentsListAPI.user_validates_data_from_response_by_batch_number(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});