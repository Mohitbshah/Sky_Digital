@regression
Feature: This feature will make sure that the shop page is navigable and usable.

  Scenario: I navigate to shop page
    Given I am on the home page
    When I click on Deals
    Then I should be on the deals page

  Scenario: User sees a list of deals on the deals page
    Given I am on the home page
    When I navigate to deals page
    Then I see a list of deals with a price to it




