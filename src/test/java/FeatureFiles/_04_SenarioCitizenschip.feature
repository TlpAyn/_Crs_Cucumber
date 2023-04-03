#Senaryo
#CitizenShip sayfasına gidiniz.
#Create işlemini parameter yöntemi ile doğrulayınız.
#Daha sonra aynı bilgilerle tekrar Create yapılamadığını doğrulayınız. (negatif test)






Feature: go to  CitizenShip  page

  Background:

    Given Navigate to Campus
    When Enter username and password click login button
    Then Navigate to citiziens page

  Scenario Outline: create etwas
    When User a CitizienShip name as "<name>" short name as "<short>"
    Then Success message should be displayed

    When  User a CitizienShip name as "<name>" short name as "<short>"
    Then  Already exist message should be displayed

    And Close the window

    When User delete the "<name>"
   # Then Success message should be displayed



    Examples:
      | name            | short       |

      | TalUlkesi2112323232w2413  | Tal122233w2241332321  |
      | TalUlk2esi2132232232w4213  | Tal12223w22433332241  |
      | TalUlkes2i311323222w43231 | Tal1212232w3422323351 |
      | TalUlkesi242232333242w11  | Tal123222w6342332131  |


