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
  "name": "Google title verification after searching a term",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@miniRegression"
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
  "name": "User types wooden spoon into th search box",
  "keyword": "And "
});
formatter.match({
  "location": "Google_StepsDefs.user_types_wooden_spoon_into_th_search_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks to search button",
  "keyword": "And "
});
formatter.match({
  "location": "Google_StepsDefs.user_clicks_to_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see wooden spoon in the title",
  "keyword": "Then "
});
formatter.match({
  "location": "Google_StepsDefs.user_should_see_wooden_spoon_in_the_title()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});