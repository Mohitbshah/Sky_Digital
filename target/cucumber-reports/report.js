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
      "name": "@regressio"
    }
  ]
});
formatter.before({
  "duration": 9561446910,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "User sees a list of deals on the deals page",
  "description": "",
  "id": "this-feature-will-make-sure-that-the-shop-page-is-navigable-and-usable.;user-sees-a-list-of-deals-on-the-deals-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@regression"
    }
  ]
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
  "duration": 867689188,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs_DealsPage.i_navigate_to_deals_page()"
});
formatter.result({
  "duration": 3687875491,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs_DealsPage.i_see_a_list_of_deals_with_a_price_to_it()"
});
formatter.result({
  "duration": 455434126,
  "status": "passed"
});
formatter.after({
  "duration": 738201255,
  "status": "passed"
});
});