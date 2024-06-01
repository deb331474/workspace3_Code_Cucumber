Feature: To Test copy functionality of users for Acttime application

  @copy
  Scenario Outline: Copying Users from the Task List
    Given I am logged into the application
    And I am on the All Customer Page
    When I select user <username>
    Then I copy that particular user
    And I add business unit <bu> with user <username>
    And I get the Confirmation Message Customer '<usernamebu>' has been created as a copy of customer '<username>'

    Examples: 
      | username             | bu        | usernamebu                    |
      | Debasish123kj4nh (5) | -managers | Debasish123kj4nh (5)-managers |
