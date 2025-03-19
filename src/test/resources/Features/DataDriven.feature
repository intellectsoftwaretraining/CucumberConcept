Feature: Create mutiple users in registration page
  I want to use this template for my feature file

@datadriven
  Scenario Outline: create new user
    Given I want to write a step with "<name>"
    When I check for the <value> in step
    Then I verify the "<status>" in step

    Examples: 
      | name   | value  | status  |
      | Bala   |     5  | success |
       | John   |     9  | success |
        | Shivya   |     15  | fail |
    