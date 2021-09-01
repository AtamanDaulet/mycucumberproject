Feature: User should find related product on google page
  Background:
    Given user is on google home page

  Scenario: TC_01 iphone search
    When user search "iPhone"
    Then verify the result has "iphone"

    Scenario: TC_01 apple search
      When user search "apple"
      Then verify the result has "apple"

  Scenario: TC_01 flower search
    When user search "flower"
    Then verify the result has "flower"

