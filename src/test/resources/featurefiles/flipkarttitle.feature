Feature: Flipkart Title Feature


@Regression
Scenario: Test3_Verify Title of the Flipkart Home Page
Given user navigates to flipkart website "https://www.flipkart.com"
And User Get the Title of Flipkart Home Page
Then Verify the title of the page
  | Home | This is Home |
  | Cart | This is Cart |
