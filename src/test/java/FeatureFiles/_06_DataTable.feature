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

      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | Tal1369041eee |
      | shortName | Tal136e940123 |

    And Click on the element in Dialog

      | saveButton |

    Then Success message should be displayed

    And User delete item from Dialog Content
      | Tal1369041eee |

    Then Success message should be displayed

    @Regie

  Scenario: Create Nationality
    And Click on the element in LeftNav

      | setup         |
      | parameters    |
      | nationalities |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | Talo123456 |

    And Click on the element in Dialog

    |saveButton|

    Then Success message should be displayed

    And User delete item from Dialog Content
      | Talo123456 |

    And Success message should be displayed

    Scenario: Fee Functionality
      And Click on the element in LeftNav
        | setup      |
        | parameters |
        | fees       |

      And Click on the element in Dialog
      |addButton|
      And User sending the keys in Dialog Content

        | nameInput       | tahsin123234423 |
        | codeInput       | i3434aa2    |
        | integrationCode | 12122      |
        | priorityCode    | 12222       |

      And Click on the element in Dialog
        | toggleBar  |
        | saveButton |

      Then Success message should be displayed

      And User delete item from Dialog Content
        | tahsin123234423 |

      Then Success message should be displayed





