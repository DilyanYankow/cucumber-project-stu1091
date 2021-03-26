
Feature: ¬ход в системата

  Scenario: Log in the system with valid credentials
    Given The user opens the login screen in the system
    When Enters username "Dilyan"
    And Enters password "Yankov"
    And Clicks on the button to enter the system
    Then Sees a message "OK"
    
  Scenario: Log in the system with invalid credentials
    Given The user opens the login screen in the system
    When Enters username "adsdsd"
    And Enters password "asdasda"
    And Clicks on the button to enter the system
    Then Sees a message "User not found"
    
  Scenario: Log in the system with invalid credentials
    Given The user opens the login screen in the system
    When Enters username "adsdsd"
    And Enters password "asdasda"
    And Clicks on the button to enter the system
    Then Sees a message "User not found"
