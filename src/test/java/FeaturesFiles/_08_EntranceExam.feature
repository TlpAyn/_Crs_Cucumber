#Senaryo :
#  Exam Formunun Çalışmasını test ediniz
#  1 sınav girişi yapıp
#  sonrasında silmesini yapınız


Feature: DataTable Functunilaty


  Background:

    Given Navigate to Campus
    When Enter username and password click login button

  Scenario: Exam form test
    And Click on the element in LeftNav
      | entranceExamsOne |
      | setupTwo         |
      | entranceExamsTwo |

    And Click on the element in Dialog
      | addButton |

    Then User sending the keys in Dialog Content
      | nameInput | talExam1 |

    And Click on the element in Dialog
      | academicPeriod  |
      | academicPeriod1 |
      | gradeLevel      |
      | gradeLevel2     |
    And Click on the element in Dialog
      | saveButton |
    And Success message should be displayed

    And Click on the element in LeftNav
      | entranceExamsOne |
      | setupTwo         |
      | entranceExamsTwo |

    And User delete item from Dialog Content
    |talExam1|



