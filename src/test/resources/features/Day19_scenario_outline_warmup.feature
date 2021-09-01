@wip
Feature: search for multiply data
  Scenario Outline: searching the worlds capital
    Given user is on google home page
    When user search for "<capital>"
    Then verify the result has "<capital>"
    Then user closes the application


    Examples:
      | capital |
      | london  |
      | Paris   |
      | vienna  |
#      | berlin  |
#      | madrid  |