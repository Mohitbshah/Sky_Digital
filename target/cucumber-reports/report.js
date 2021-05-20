$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/Features/DealsPage.feature");
formatter.feature({
  "line": 2,
  "name": "This feature will make sure that the shop page is navigable and usable.",
  "description": "",
  "id": "this-feature-will-make-sure-that-the-shop-page-is-navigable-and-usable.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 8892521174,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "I navigate to shop page",
  "description": "",
  "id": "this-feature-will-make-sure-that-the-shop-page-is-navigable-and-usable.;i-navigate-to-shop-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on Deals",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should be on the deals page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs_HomePage.i_am_on_the_home_page()"
});
formatter.result({
  "duration": 679017247,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs_DealsPage.i_click_on_Deals()"
});
formatter.result({
  "duration": 3183727795,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs_DealsPage.i_should_be_on_the_deals_page()"
});
formatter.result({
  "duration": 2507436540,
  "status": "passed"
});
formatter.after({
  "duration": 762281951,
  "status": "passed"
});
formatter.before({
  "duration": 7649157775,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "User sees a list of deals on the deals page",
  "description": "",
  "id": "this-feature-will-make-sure-that-the-shop-page-is-navigable-and-usable.;user-sees-a-list-of-deals-on-the-deals-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I navigate to deals page",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I see a list of deals with a price to it",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs_HomePage.i_am_on_the_home_page()"
});
formatter.result({
  "duration": 278871095,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs_DealsPage.i_navigate_to_deals_page()"
});
formatter.result({
  "duration": 3083412910,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs_DealsPage.i_see_a_list_of_deals_with_a_price_to_it()"
});
formatter.result({
  "duration": 516126874,
  "status": "passed"
});
formatter.after({
  "duration": 661096720,
  "status": "passed"
});
formatter.uri("src/test/Resources/Features/HomePage.feature");
formatter.feature({
  "line": 2,
  "name": "This feature will make the search show the results that are determined by editorial, as well as generic searches.",
  "description": "",
  "id": "this-feature-will-make-the-search-show-the-results-that-are-determined-by-editorial,-as-well-as-generic-searches.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 6833711579,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User sees the editorial section in specific searches",
  "description": "",
  "id": "this-feature-will-make-the-search-show-the-results-that-are-determined-by-editorial,-as-well-as-generic-searches.;user-sees-the-editorial-section-in-specific-searches",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I search sky in the search bar",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should see an editorial section.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs_HomePage.i_am_on_the_home_page()"
});
formatter.result({
  "duration": 322119952,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs_HomePage.i_search_sky_in_the_search_bar()"
});
formatter.result({
  "duration": 658991055,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs_HomePage.i_should_see_an_editorial_section()"
});
formatter.result({
  "duration": 1304070104,
  "status": "passed"
});
formatter.after({
  "duration": 709007682,
  "status": "passed"
});
formatter.uri("src/test/Resources/Features/SignInPage.feature");
formatter.feature({
  "line": 2,
  "name": "This feature will make sure trying to Sign in with invalid credentials displays error message",
  "description": "",
  "id": "this-feature-will-make-sure-trying-to-sign-in-with-invalid-credentials-displays-error-message",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "I am displayed an error when I input invalid credentials",
  "description": "",
  "id": "this-feature-will-make-sure-trying-to-sign-in-with-invalid-credentials-displays-error-message;i-am-displayed-an-error-when-i-input-invalid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on sign in",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I try to sign in with invalid \"\u003cemailOrUsername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should be displayed with an error message",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "this-feature-will-make-sure-trying-to-sign-in-with-invalid-credentials-displays-error-message;i-am-displayed-an-error-when-i-input-invalid-credentials;",
  "rows": [
    {
      "cells": [
        "emailOrUsername",
        "password"
      ],
      "line": 10,
      "id": "this-feature-will-make-sure-trying-to-sign-in-with-invalid-credentials-displays-error-message;i-am-displayed-an-error-when-i-input-invalid-credentials;;1"
    },
    {
      "cells": [
        "mohit",
        "123456"
      ],
      "line": 11,
      "id": "this-feature-will-make-sure-trying-to-sign-in-with-invalid-credentials-displays-error-message;i-am-displayed-an-error-when-i-input-invalid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6588661677,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "I am displayed an error when I input invalid credentials",
  "description": "",
  "id": "this-feature-will-make-sure-trying-to-sign-in-with-invalid-credentials-displays-error-message;i-am-displayed-an-error-when-i-input-invalid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on sign in",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I try to sign in with invalid \"mohit\" and \"123456\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should be displayed with an error message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs_HomePage.i_am_on_the_home_page()"
});
formatter.result({
  "duration": 303580328,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs_SignInPage.i_click_on_sign_in()"
});
formatter.result({
  "duration": 1512596631,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mohit",
      "offset": 31
    },
    {
      "val": "123456",
      "offset": 43
    }
  ],
  "location": "StepDefs_SignInPage.i_try_to_sign_in_with_invalid_and(String,String)"
});
formatter.result({
  "duration": 2358492657,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs_SignInPage.i_should_be_displayed_with_an_error_message()"
});
formatter.result({
  "duration": 1611565352,
  "status": "passed"
});
formatter.after({
  "duration": 812845009,
  "status": "passed"
});
});