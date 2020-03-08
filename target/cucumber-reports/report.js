$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Dzone.feature");
formatter.feature({
  "name": "Dzone header comparison",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Dzone header comparison",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@dzone"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on first page we get header",
  "keyword": "When "
});
formatter.match({
  "location": "Dzone_steps.user_is_on_first_page_we_get_header()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on secod page we get header",
  "keyword": "When "
});
formatter.match({
  "location": "Dzone_steps.user_is_on_secod_page_we_get_header()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "we compare headers",
  "keyword": "Then "
});
formatter.match({
  "location": "Dzone_steps.we_compare_headers()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Gradle vs. Maven]\u003e but was:\u003c[API Security Weekly: Issue #71]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat step_definitions.Dzone_steps.we_compare_headers(Dzone_steps.java:42)\n\tat ✽.we compare headers(src/test/resources/features/Dzone.feature:6)\n",
  "status": "failed"
});
formatter.step({
  "name": "test again",
  "keyword": "Then "
});
formatter.match({
  "location": "Dzone_steps.test_again()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});