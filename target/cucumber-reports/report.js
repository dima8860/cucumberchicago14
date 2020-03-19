$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/google_features/google.feature");
formatter.feature({
  "name": "Google feature verification",
  "description": "  Agile Story: User Stories, acceptance criteria\n  Basically we can pass here any additional information related to this feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "name": "Google title verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@googleTitleVerification"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on google page",
  "keyword": "When "
});
formatter.match({
  "location": "Google_StepsDefs.user_is_on_google_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see title contains Google",
  "keyword": "Then "
});
formatter.match({
  "location": "Google_StepsDefs.user_should_see_title_contains_Google()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});