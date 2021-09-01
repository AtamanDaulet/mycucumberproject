@googlesearch
Feature: user should find the related products on google search

  Background:
    Given user is on google home page

  @iPhone
  Scenario: TC_01 iphone search
    When user search iPhone
    Then verify the result has iPhone

  Scenario: TC_02 Tea Pot search
    When user search Tea Pot
    Then verify the result has Tea Pot

  @flower
  Scenario: TC_03 flower search
    When user search flower
    Then verify the result has flower

  @flower @iPhone
  Scenario: TC_04 bmw  search
    Given user is on google home page
    When user search bmw
    Then verify the result has bmw
#    When user search for iPhone on google
#    Then verify the result has iPhone related results
#    When user search for Tea Pot on google
#    Then verify the result has Tea Pot related results
#    When user search for flower on google
#    Then verify the result has flower related results
#    When user search for bmw on google
#    Then verify the result has bmw related results