


Feature: Country Multi Scenario

  Background:
    Given Navigate to Campus
    When Enter username and password click login button
    Then User scould login succesfully
    And Navigate to country page

    Scenario:Create country
      When create a country
      Then Success message should be displayed

    Scenario: Create a country 2
      When create a country name as "tal1234" code as "tall"
      Then Success message should be displayed

