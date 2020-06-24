$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/etsy_features/etsySearch.feature");
formatter.feature({
  "name": "Etsy search functionality",
  "description": "  Agile story : can be placed here\n  CBT - 25  --\u003e\u003e\u003e Jira ticket",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Etsy search title verification",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@etsy2"
    }
  ]
});
formatter.step({
  "name": "User searches for \"\u003csearchValue\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User should see \"\u003cexpectedTitle\u003e\" in Etsy title",
  "keyword": "Then "
});
formatter.examples({
  "name": "different data sets",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "searchValue",
        "expectedTitle"
      ]
    },
    {
      "cells": [
        "custom wooden spoon",
        "Custom wooden spoon"
      ]
    },
    {
      "cells": [
        "wooden spoon",
        "Wooden spoon"
      ]
    },
    {
      "cells": [
        "wooden spoon",
        "wooden spoon"
      ]
    }
  ]
});
formatter.background({
  "name": "User is already on Etsy home page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Etsy home page",
  "keyword": "Given "
});
formatter.match({
  "location": "EtsySearch_stepDefs.user_is_on_Etsy_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Etsy search title verification",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@etsy2"
    }
  ]
});
formatter.step({
  "name": "User searches for \"custom wooden spoon\"",
  "keyword": "When "
});
formatter.match({
  "location": "EtsySearch_stepDefs.user_searches_for(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see \"Custom wooden spoon\" in Etsy title",
  "keyword": "Then "
});
formatter.match({
  "location": "EtsySearch_stepDefs.user_should_see_in_Etsy_title(String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\n\tat org.junit.Assert.fail(Assert.java:86)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat org.junit.Assert.assertTrue(Assert.java:52)\n\tat step_definitions.etsy_stepDefs.EtsySearch_stepDefs.user_should_see_in_Etsy_title(EtsySearch_stepDefs.java:48)\n\tat ✽.User should see \"Custom wooden spoon\" in Etsy title(src/test/resources/features/etsy_features/etsySearch.feature:21)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User is already on Etsy home page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Etsy home page",
  "keyword": "Given "
});
formatter.match({
  "location": "EtsySearch_stepDefs.user_is_on_Etsy_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Etsy search title verification",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@etsy2"
    }
  ]
});
formatter.step({
  "name": "User searches for \"wooden spoon\"",
  "keyword": "When "
});
formatter.match({
  "location": "EtsySearch_stepDefs.user_searches_for(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see \"Wooden spoon\" in Etsy title",
  "keyword": "Then "
});
formatter.match({
  "location": "EtsySearch_stepDefs.user_should_see_in_Etsy_title(String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\n\tat org.junit.Assert.fail(Assert.java:86)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat org.junit.Assert.assertTrue(Assert.java:52)\n\tat step_definitions.etsy_stepDefs.EtsySearch_stepDefs.user_should_see_in_Etsy_title(EtsySearch_stepDefs.java:48)\n\tat ✽.User should see \"Wooden spoon\" in Etsy title(src/test/resources/features/etsy_features/etsySearch.feature:21)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User is already on Etsy home page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Etsy home page",
  "keyword": "Given "
});
formatter.match({
  "location": "EtsySearch_stepDefs.user_is_on_Etsy_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Etsy search title verification",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@etsy2"
    }
  ]
});
formatter.step({
  "name": "User searches for \"wooden spoon\"",
  "keyword": "When "
});
formatter.match({
  "location": "EtsySearch_stepDefs.user_searches_for(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see \"wooden spoon\" in Etsy title",
  "keyword": "Then "
});
formatter.match({
  "location": "EtsySearch_stepDefs.user_should_see_in_Etsy_title(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});