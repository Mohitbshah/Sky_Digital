package com.sky.test;

import PageObject.SignInPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs_SignInPage {
    SignInPage signInPage = new SignInPage();

    @When("^I click on sign in$")
    public void i_click_on_sign_in(){
        signInPage.clickOnSignIn();
    }

    @When("^I try to sign in with invalid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_try_to_sign_in_with_invalid_and(String emailOrUsername, String password){
        signInPage.assertSignInPageUrl();
        signInPage.enterCredentials(emailOrUsername,password);
        signInPage.clickOnSignInButton();
    }

    @Then("^I should be displayed with an error message$")
    public void i_should_be_displayed_with_an_error_message(){
        signInPage.errorMessage();
    }
}
