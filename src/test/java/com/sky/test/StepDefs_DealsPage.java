package com.sky.test;

import PageObject.DealsPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs_DealsPage extends Utils {
    DealsPage dealsPage = new DealsPage();

    @When("^I click on Deals$")
    public void i_click_on_Deals(){
        dealsPage.clickOnDeals();
    }

    @Then("^I should be on the deals page$")
    public void i_should_be_on_the_deals_page(){
        dealsPage.navigatingToDealsPage();
        dealsPage.ableToSeeAllProductsOfSkyDeals();
        dealsPage.tvFunctionalityUsability();
        dealsPage.tvAndBroadbandUsability();
        dealsPage.mobileFunctionalityUsability();
    }

    @When("^I navigate to deals page$")
    public void i_navigate_to_deals_page(){
        dealsPage.clickOnDeals();
        dealsPage.navigatingToDealsPage();
    }

    @Then("^I see a list of deals with a price to it$")
    public void i_see_a_list_of_deals_with_a_price_to_it(){
        dealsPage.dealsWithThePrice();
//        dealsPage.assertDeals();

    }
}
