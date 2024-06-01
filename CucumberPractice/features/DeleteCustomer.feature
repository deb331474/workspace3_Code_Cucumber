Feature: Deleting users from Acttime application
@sanity
  Scenario Outline:: Deleting Users from the Task List
    Given I am logged into the application
    And I am on the All Customer Page
    When I select user <username>
    Then I delete that particular user
    And I get the Confirmation Message Customer '<username>' has been deleted

    Examples:
    |username|
    |Debasish123|