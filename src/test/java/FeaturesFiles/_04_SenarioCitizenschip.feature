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


      Examples:
        | name  |  short |

        | TalUlkesi1  | Tal123  |
        | TalUlkesi2  | Tal1234 |
        | TalUlkesi3  | Tal1235 |
        | TalUlkesi4  | Tal1236 |


