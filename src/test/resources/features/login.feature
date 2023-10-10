@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: LOAN Process
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcome

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with "<name>"
    When I check for the <value> in step
    Then I verify the "<status>" in step

    Examples: 
      | name    | value | status  |
      | 7010515397 |     5 | success |
      | 8056231886 |     7 | Fail    |
