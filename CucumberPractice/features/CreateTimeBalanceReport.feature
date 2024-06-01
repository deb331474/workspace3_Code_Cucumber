Feature: Creating Time Balance Report

  @Create
  Scenario: Creating time balance report for Users
    Given user is on the reports section
    And user selects new time balance report
    When user fills the details
      | Date Range     | Data Grouping | Data GroupingLevel            | Time Format |
      | Previous month | Users         | Do not use 2nd grouping level | HH:MM       |
    And user selects Generate HTML Report
    Then user get the HTML report in tabular format
