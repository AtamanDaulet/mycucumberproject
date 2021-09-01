@dbread
Feature: Read Data
  Scenario: Reading hotel reservations
    Given user connects to the database
    And user gets "Price" from "tHOTELROOM" table
    When user reads all rows in the "Price" column
    Then users gets the value in row 2 in "Price" column and verifies the value is "4000.0000"
#    Then users gets the value in row 5 in "Price" column and verifies the value is "470.0000"