package com.awa.stepdefinitions;

import com.awa.framework.DriverManager;
import com.awa.pageobjects.FlipkartCartPage;
import com.awa.pageobjects.FlipkartHomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;


import java.util.List;
import java.util.Map;

public class FlipkartStepDefinition {
    FlipkartHomePage flipkartHomePage = new FlipkartHomePage();
    FlipkartCartPage flipkartCartPage = new FlipkartCartPage();

    @Given("user navigates to flipkart website {string}")
    public void user_navigates_to_flipkart_website(String url) throws Exception {
        //Code to navigate to the given url in feature scenario step
        System.out.println("user navigates to flipkart website");
        DriverManager.navigateToURL(url);
        Thread.sleep(5000);
    }

    @Given("user clicks on cart button on the home page")
    public void user_clicks_on_cart_button_on_the_home_page() throws Exception{

        System.out.println("user clicks on cart button on the home page");
        flipkartHomePage.clickCartButton();
        Thread.sleep(5000);
    }

    @Then("user should see the message {string}")
    public void user_should_see_the_message(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user should see the message " + string);
        boolean isDisplayed = flipkartCartPage.isMissingCartDisplayed();
        Assert.assertTrue("Missing Cart items? text did not displayed..",isDisplayed);
    }

    @Given("User Get the Title of Flipkart Home Page")
    public void user_get_the_title_of_flipkart_home_page() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("Verify the title of the page")
    public void verify_the_title_of_the_page(DataTable testData) {
        // Write code here that turns the phrase above into concrete actions
        Map<String, String> data = testData.asMap(String.class, String.class);
        System.out.println(data);
//        for (Map<String, String> dataset:data) {
//
//        }

    }

}
