Feature: Testing JBDC States
  Background:


    Given  Navigate to Campus
    When   Enter username and password click login button
    Then  User scould login succesfully


    Scenario: States testing with JDBC
      And  Click on the element in LeftNav

      |setup|
      |parameters|
      |states|

      Then Send querty the Database "select * from States" and control match
