package com.awa.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;


import java.util.List;
import java.util.Map;

public class FlipkartStepDefinition {

    @Given("user navigates to flipkart website")
    public void user_navigates_to_flipkart_website() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user navigates to flipkart website");
    }
    @Given("user clicks on cart button on the home page")
    public void user_clicks_on_cart_button_on_the_home_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user clicks on cart button on the home page");
    }
    @Then("user should see the message {string}")
    public void user_should_see_the_message(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user should see the message "+ string);
    }
    @Given("User Get the Title of Flipkart Home Page")
    public void user_get_the_title_of_flipkart_home_page() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("Verify the title of the page")
    public void verify_the_title_of_the_page(DataTable testData) {
        // Write code here that turns the phrase above into concrete actions
        Map<String, String> data = testData.asMap(String.class,String.class);
        System.out.println(data);
//        for (Map<String, String> dataset:data) {
//
//        }

    }

}
