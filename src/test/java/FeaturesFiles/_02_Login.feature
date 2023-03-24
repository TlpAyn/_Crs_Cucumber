Feature: Country Functionality

  Scenario: Create Country
    Given  Navigate to Campus
    When   Enter username and password click login button
    Then  User scould login succesfully
    And Navigate to country page
    When create a country
    Then Success message should be displayed