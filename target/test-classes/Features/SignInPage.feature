@regressio
Feature: This feature will make sure trying to Sign in with invalid credentials displays error message

Scenario Outline: I am displayed an error when I input invalid credentials
Given I am on the home page
When I click on sign in
And I try to sign in with invalid "<emailOrUsername>" and "<password>"
Then I should be displayed with an error message
Examples:
| emailOrUsername |password|
| mohit       |123456|