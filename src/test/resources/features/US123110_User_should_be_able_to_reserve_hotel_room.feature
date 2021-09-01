@dttables
Feature: Room Reserve

  Scenario: user should make a revervation
    Given user is on the Crystalkey Hotels page
    And user enters username and password
      | manager | Manager2! |
    And user clicks on the login button
    And user goes to room reservation page
    When user enters all required fields and click save button
      | price | date_start | date_end   | adult | children | contact_name | contact_phone | contact_email  | notes   |
      | 400   | 02/10/2021 | 02/14/2021 | 2     | 3        | john         | 5129995588    | test@email.com | Testing |
    Then verify the success message

#    take screenshot method
    And take the screenshot
    And user closes the application