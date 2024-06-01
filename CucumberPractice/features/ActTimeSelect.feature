Feature: ActiTime workday time entry feature

  @tag2
  Scenario Outline: User should be able to enter time in the workday
    Given I am on the time-track workday page
    When I enter the <calls> in calls field
    And I enter the <capacity> in capacity planning field
    And I enter the <nasa> in NASA negotiations field
    And I click on the save changes button
    Then i should see the success message

    Examples: 
      | calls | capacity | nasa |
      |     2 |        3 |    1 |
      |     5 |        2 |    9 |
