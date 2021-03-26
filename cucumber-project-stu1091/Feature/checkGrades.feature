@tag
Feature: Check grades by student number

  @tag1
  Scenario: User Checks grades by valid student number
    Given The user is logged in
    And The user opens the check grades screen in the system
    When Enters student school number "1"
    And clicks on the search button
    Then Sees student's grades

  Scenario: User Checks grades by invalid student number
    Given The user is logged in
    And The user opens the check grades screen in the system
    When Enters student school number "aaa"
    And clicks on the search button
    Then Sees message "Student not found"

