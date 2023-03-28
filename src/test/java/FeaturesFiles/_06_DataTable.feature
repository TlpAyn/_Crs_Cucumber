Feature: DataTable Functunilaty


  Background:

    Given Navigate to Campus
    When Enter username and password click login button

  Scenario: Create Country

    Then Click on the element in LeftNav

      | setup          |
      | parameters     |
      | citiziensSchip |

    And Click on the element in Dialog

      | CitiziensPlus |

    And Click on the element in Dialog Content
    |nameInput|Tal136901|
    |nameInput|Tal136901|