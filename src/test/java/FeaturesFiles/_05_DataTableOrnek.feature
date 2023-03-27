Feature:

  Scenario: Users List

    When Write username "Talip"
    And Write username and pasword "Talip" and "12345"
    And Write username as DataTable

      | Tahsin |
      | Muhsin |
      | Tahir  |
      | Minir  |

    And Write username and passsword as Database

      | Tahsin | 123 |
      | Muhsin | 234 |
      | Tahir  | 567 |
      | Minir  | 678 |