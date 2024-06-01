Feature: Add new Customer

  @Regession
  Scenario Outline: Successful addition of new Customer
    Given user is logged in to the Acti time page
    And user is on the Tasks details page
    When user clicks on new Add new button
    And clicks on New Customer
    Then user should be able to enter all details in the create new <customer> modal

    Examples: 
      | customer     |
      | Debasish123kj4nh |
      | Ashok123hxj4ty    |
      | Debasish12zx3kj4nh |
      | Ashok123hsdsj4ty    |
      | Debasish123zxcdkj4nh |
      | Ashok123hsdwdj4ty    |
