Feature: Login to the Acttime application

  Scenario: Successful login with valid credentials
    Given I am on the login page
    And I enter Username as "admin" and Password as "manager"
    When I click on Login button
    Then I should able to logged into the application
    And I should be able to see the text "Switch to actiPLANS"
