#Senaryo :
#  Bir önceki Exam Giriş Senaryosunu
#  Aşağıdaki değerler için çalıştırınız.
#
#| ExamName        | AcademicPeriodOption         | GradeLevelOption |
#| Math exam is1   | academicPeriod1              | gradeLevel2  |
#| IT exam is1     | academicPeriod1              | gradeLevel3  |
#| Oracle exam is1 | academicPeriod1              | gradeLevel4  |
#| Math exam is2   | academicPeriod1              | gradeLevel5  |

Feature: Exam Functionalitiy
  Background:
    Given Navigate to Campus
    When Enter username and password click login button

  Scenario Outline: Exam form test
    And Click on the element in LeftNav
      | entranceExamsOne |
      | setupTwo         |
      | entranceExamsTwo |

    And Click on the element in Dialog
      | addButton |

    Then User sending the keys in Dialog Content
      | nameInput | <examName> |

    And Click on the element in Dialog
      | academicPeriod   |
      | <academicOption> |
      | gradeLevel       |
      | <gradeOption>    |

   #   And Click on the element in Dialog Content
   #    | academicPeriod | <academicOption> |
   #      | gradeLevel     | <gradeOption>    |

    And Click on the element in Dialog
      | saveButton |
    Then Success message should be displayed

    And Click on the element in LeftNav
      | entranceExamsOne |
      | setupTwo         |
      | entranceExamsTwo |

    And User delete item from Dialog Content
      | <examName> |



    Examples:
      | examName          | academicOption  | gradeOption |
      | Math exam is999   | academicPeriod1 | gradeLevel2 |
      | IT exam is999     | academicPeriod1 | gradeLevel3 |
      | Oracle exam is999 | academicPeriod1 | gradeLevel4 |
      | Math exam is999   | academicPeriod1 | gradeLevel5 |




