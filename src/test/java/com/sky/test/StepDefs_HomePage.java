package com.sky.test;

import PageObject.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs_HomePage {
    HomePage homePage = new HomePage();

    @Given("^I am on the home page$")
    public void i_am_on_the_home_page(){
        homePage.acceptCookies();
    }

    @When("^I search sky in the search bar$")
    public void i_search_sky_in_the_search_bar(){
        homePage.clickOnSearch();
        homePage.enterTextInSearch();
    }

    @Then("^I should see an editorial section\\.$")
    public void i_should_see_an_editorial_section(){
        homePage.editorialSection();
    }
}
