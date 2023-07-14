Feature: Flipkart Feature


  @Test
  Scenario: Flipkart Test
    Given user navigates to flipkart website "https://www.flipkart.com"
    And user clicks on cart button on the home page
    Then user should see the message "Missing Cart items?"


    #how to change local repository path in settings.xml-->