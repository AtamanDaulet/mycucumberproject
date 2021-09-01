@regression
Feature:user should add data

  Scenario Outline: data tables 1
    Given user is on the datatables page
    And use clicked on the new button
    When user enters the firstname "<firstname>"
    When user enters the lastname "<lastname>"
    When user enters the position "<position>"
    When user enters the office "<office>"
    When user enters the extension "<extension>"
    When user enters the startdate "<startdate>"
    When user enters the salary "<salary>"
    And user clicks on the create button
    And user search for the firstname "<firstname>"
    Then verify the name field contains the firstname "<firstname>"

    Examples: This is used to pass the data
      | firstname | lastname       | position         | office  | extension | startdate  | salary |
      | john      | carry          | teacher          | NY        | 123       | 2021-01-20 | 50000  |
      | safiye    | buyukbayraktar | sdet             | Manhattan | 435       | 2021-01-21 | 120000 |
      | demet     | buyuk          | Vice President   | London    | 673       | 2021-01-26 | 130000 |
      | ozge      | efe            | Product Owner    | Paris     | 899       | 2021-01-28 | 150000 |
      | hulya     | yasar          | bona fide hacker | anonymous | 866       | 2021-01-26 | 500000 |
