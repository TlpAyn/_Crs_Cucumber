#Senaryo:
#  Daha önceki Fee Functionality Senaryosunu
#  name, code, intCode ve priority için 5 farklı kombinasyon için çalıştırınız.

Feature: DataTable Functunilaty


  Background:

    Given Navigate to Campus
    When Enter username and password click login button

  Scenario Outline: Fee Functionality
    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | fees       |

    And Click on the element in Dialog
      |addButton|
    And User sending the keys in Dialog Content

      | nameInput       | <name> |
      | codeInput       | <code>   |
      | integrationCode | <incode>      |
      | priorityCode    | <pricode>       |

    And Click on the element in Dialog
      | toggleBar  |
      | saveButton |

    Then Success message should be displayed

    And User delete item from Dialog Content
      | <name> |

    Then Success message should be displayed

    Examples:
    |name|code|incode|pricode|
    |tahsincikk|1233334|payeepal|34635|
    |muratcikk|2333345|caeesh|5646567|
    |kerimcikk|453337|cheeeque|146367|
    |nihalcikk|678339|apeeplePAy|126555|
    |emrecikk|9873335|cryeepto|563666|