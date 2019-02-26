Feature: Enter login details

  @ORPHAN @successfull_login
  Scenario Outline: Successful login
    Given I start the application
    When I click email field
    And I enter valid email <email>
    And I close the keyboard
    And I click password field
    And I enter valid password <password>
    And I close the keyboard
    And I click sign in button
    Then I expect to see successful login message
    
    Examples:
      | email        | password                    |
      | abov@mail.com | 123456                     |
      | test@gmail.com | somePassWithVeryLongValue |

  @SSNDRD-11 @OPEN
  Scenario Outline: Failure to login
    Given I start the application
    When I click email field
    And I enter invalid email <email>
    And I close the keyboard
    And I click password field
    And I enter valid password <password>
    And I close the keyboard
    And I click sign in button
    Then I expect to see successful login message
    
    Examples:
      | email        | password                  |
      | ab*v@mail.com | 123456                   |
      | test@gmail.f | somePassWithVeryLongValue |
